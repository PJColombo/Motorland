package Negocio.concesionario;

import java.util.Collection;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.LockModeType;
import javax.persistence.Persistence;
import javax.persistence.Query;

import Negocio.departamento.Departamento;

public class ASConcesionarioImp implements ASConcesionario {

	@SuppressWarnings("unchecked")
	@Override
	public int altaConcesionario(Concesionario c) {
		int res = 0;
		EntityManagerFactory emf = null;
		EntityManager em = null; 
		EntityTransaction tr = null;
		List<Concesionario> cLeido = null;
		Query q; 
		
		try {
			
			emf = Persistence.createEntityManagerFactory("Motorland");
			em = emf.createEntityManager();
			tr = em.getTransaction();
			
			tr.begin();
			
			q = em.createNamedQuery("Concesionario.findByNombre");
			q.setParameter("nombre", c.getNombre());
			
			cLeido = q.getResultList();
			
			if(cLeido.isEmpty()) {
				res = 1;
				em.persist(c);
				tr.commit();
			}
			else {
				Concesionario con = cLeido.get(0);
				
				if(!con.isActivo()) {
					con.setNombre(c.getNombre());
					con.setDireccion(c.getDireccion());
					con.setActivo(true);
				}
				//Concesionario ya existe y está activo.
				else {
					res = -1;
					tr.rollback();
				}
			}
		}
		finally {
			if(emf != null && emf.isOpen())
				emf.close();
			if(em != null && em.isOpen())
				em.close();
		}
		return res;
	}

	@SuppressWarnings("unchecked")
	@Override
	public int bajaConcesionario(int id) {
		int res = 0;
		EntityManagerFactory emf = null;
		EntityManager em = null; 
		EntityTransaction tr = null;
		Concesionario cLeido = null;
		Query q; 
		
		try {
			emf = Persistence.createEntityManagerFactory("Motorland");
			em = emf.createEntityManager();
			tr = em.getTransaction();
			
			tr.begin();
			
			cLeido = em.find(Concesionario.class, id);
			
			if(cLeido != null) {
				
				if(cLeido.isActivo()) {
					res = 1;
					cLeido.setActivo(false);
					tr.commit();
				}
				//El concesionario ya está dado de baja.
				else {
					res = -2;
					tr.rollback();
				}
			}
			//Concesionario inexistente.
			else {
				res = -1;
				tr.rollback();
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			if(emf != null && emf.isOpen())
				emf.close();
			if(em != null && em.isOpen())
				em.close();
		}
		return res;
	}

	@SuppressWarnings("unchecked")
	@Override
	public int modificaConcesionario(Concesionario c) {
		int res = 0;
		EntityManagerFactory emf = null;
		EntityManager em = null; 
		EntityTransaction tr = null;
		Concesionario cLeido = null;
		Query q;
		
		try {
			emf = Persistence.createEntityManagerFactory("Motorland");
			em = emf.createEntityManager();
			tr = em.getTransaction();
			
			tr.begin();
			
			cLeido = em.find(Concesionario.class, c.getIdConcesionario());
			
			if(cLeido != null) {
				
				if(cLeido.isActivo()) {
					List<Concesionario> conComprueba; 
					
					if(!c.getNombre().isEmpty()) {
						q = em.createNamedQuery("Concesionario.findByNombre");
						q.setParameter("nombre", c.getNombre());
						
						conComprueba = q.getResultList();
						
						if(conComprueba.isEmpty()) {
							cLeido.setNombre(c.getNombre());
						}
						//Ya existe un concesionario con ese nombre.
						else {
							res = -3;
							tr.rollback();
						}	
					}
	
					if(!c.getDireccion().isEmpty()) {
						q = em.createNamedQuery("Concesionario.findByDireccion");
						q.setParameter("direccion", c.getDireccion());
						
						conComprueba = q.getResultList();
						
						if(conComprueba.isEmpty()) {
							cLeido.setDireccion(c.getDireccion());
						}
						//Ya existe un concesionario en esa dirección.
						else {
							res = -4;
							tr.rollback();
						}
						
						
					}	
					
					if(res == 0) {
						res = 1;
						tr.commit();
					}
				}
				//Concesionario dado de baja.
				else {
					res = -2;
					tr.rollback();
				}
			}
			//Concesionario inexistente.
			else {
				res = -1;
				tr.rollback();
			}
		}
		finally {
			if(emf != null && emf.isOpen())
				emf.close();
			if(em != null && em.isOpen())
				em.close();
		}
		return res;
	}

	@SuppressWarnings("unchecked")
	@Override
	public Concesionario consultaConcesionario(int id) {
		EntityManagerFactory emf = null;
		EntityManager em = null; 
		EntityTransaction tr = null;
		Concesionario c = null; 
		try {
			emf = Persistence.createEntityManagerFactory("Motorland");
			em = emf.createEntityManager();
			tr = em.getTransaction();
			
			tr.begin();
			
			c = em.find(Concesionario.class, id);
			
			tr.commit();
		}
		finally {
			if(emf != null && emf.isOpen())
				emf.close();
			if(em != null && em.isOpen())
				em.close();
		}
		return c;
	}

	@SuppressWarnings("unchecked")
	@Override
	public Collection<Concesionario> listaConcesionarios() {
		EntityManagerFactory emf = null;
		EntityManager em = null; 
		EntityTransaction tr = null;
		List<Concesionario> cLeido;
		Collection<Concesionario> concesionarios = null; 
		Query q;
		
		try {
			emf = Persistence.createEntityManagerFactory("Motorland");
			em = emf.createEntityManager();
			tr = em.getTransaction();
			
			tr.begin();
			
			q = em.createNamedQuery("Concesionario.findAll");
			
			cLeido = q.getResultList();
			
			if(!cLeido.isEmpty()) 
				concesionarios = cLeido;
			
			tr.commit();
		}
		finally {
			if(emf != null && emf.isOpen())
				emf.close();
			if(em != null && em.isOpen())
				em.close();	
		}
		return concesionarios;
	}

	@Override
	public int agregaDepartamento(ConcesionarioDepartamento conDep) {
		EntityManagerFactory emf = null;
		EntityManager em = null; 
		EntityTransaction tr = null;
		Departamento d;
		Concesionario c;
		ConcesionarioDepartamento cd; 
		int idConcesionario = conDep.getConcesionario().getIdConcesionario();
		int idDepartamento = conDep.getDepartamento().getId();
		int res = 0; 
		try {
			emf = Persistence.createEntityManagerFactory("Motorland");
			em = emf.createEntityManager();
			tr = em.getTransaction();
			
			tr.begin();
			
			c = em.find(Concesionario.class, idConcesionario);
			
			if(c != null) {
				if(c.isActivo()) {
					d = em.find(Departamento.class, idDepartamento);
					
					if(d != null) {
						if(d.isActivo()) {
							cd = em.find(ConcesionarioDepartamento.class, 
									new ConcesionarioDepartamentoID(idConcesionario, idDepartamento));
							if(cd == null) {
								conDep.setConcesionario(c);
								conDep.setDepartamento(d);
								c.agregaConcesionarioDepartamento(conDep);
								d.agregaConcesionarioDepartamento(conDep);
								em.persist(conDep);
								res = 1;
								tr.commit();
							}
							//Ya existe un ConcesionarioDepartamento
							else {
								res = -5;
								tr.rollback();
							}
						}
						//El departamento se encuetra inactivo.
						else {
							res = -4;
							tr.rollback();
						}
					}
					//El departamento no existe.
					else {
						res = -3;
						tr.rollback();
					}
				}
				//El concesionario se encuentra inactivo.
				else {
					res = -2;
					tr.rollback();
				}
			}
			//El concesionario no existe. 
			else {
				res = -1;
				tr.rollback();
			}
		}
		finally {
			if(emf != null && emf.isOpen())
				emf.close();
			if(em != null && em.isOpen())
				em.close();	
		}
		return res;
	}

	@Override
	public int eliminaDepartamento(ConcesionarioDepartamentoID cdId) {
		EntityManagerFactory emf = null;
		EntityManager em = null; 
		EntityTransaction tr = null;
		Departamento d;
		Concesionario c;
		int idConcesionario = cdId.getConcesionarioID();
		int idDepartamento = cdId.getDepartamentoID();
		ConcesionarioDepartamento cd;
		int res = 0; 
		
		try {
			emf = Persistence.createEntityManagerFactory("Motorland");
			em = emf.createEntityManager();
			tr = em.getTransaction();
			
			tr.begin();
			
			c = em.find(Concesionario.class, idConcesionario);
			
			if(c != null) {
				if(c.isActivo()) {
					d = em.find(Departamento.class, idDepartamento);
					
					if(d != null) {
						if(d.isActivo()) {
							cd = em.find(ConcesionarioDepartamento.class, 
									new ConcesionarioDepartamentoID(idConcesionario, idDepartamento));
							if(cd != null) {
								c.eliminaConcesionarioDepartamento(cd);
								d.eliminaConcesionarioDepartamento(cd);
								em.remove(cd);
								res = 1;
								
								tr.commit();
							}
							//El concesionarioDepartamento no existe. 
							else {
								res = -5;
								tr.rollback();
							}
						}
						//El departamento está inactivo.
						else {
							res = -4;
							tr.rollback();
						}
					}
					//El departamento no existe.
					else {
						res = -3;
						tr.rollback();
					}
				}
				//El concesionario está inactivo.
				else {
					res = -2;
					tr.rollback();
				}
			}
			//El concesionario no existe.
			else {
				res = -1;
				tr.rollback();
			}
		}
		finally {
			if(emf != null && emf.isOpen())
				emf.close();
			if(em != null && em.isOpen())
				em.close();	
		}
		return res;
	}

	@Override
	public double calculaPresupuesto(int id) {
		EntityManagerFactory emf = null;
		EntityManager em = null; 
		EntityTransaction tr = null;
		Concesionario c = null;
		double presupuestoTotal = 0;
		try {
			emf = Persistence.createEntityManagerFactory("Motorland");
			em = emf.createEntityManager();
			tr = em.getTransaction();
			
			tr.begin();
			
			c = em.find(Concesionario.class, id, LockModeType.OPTIMISTIC_FORCE_INCREMENT);
			
			if(c != null) {
				if(c.isActivo()) {
					for (ConcesionarioDepartamento cd : c.getConcesionariosDepartamentos()) {
						em.lock(cd, LockModeType.OPTIMISTIC_FORCE_INCREMENT);
						presupuestoTotal += cd.getPresupuesto();
					}
					tr.commit();
				}
				else {
					presupuestoTotal = -2;
					tr.rollback();
				}
			}
			else {
				presupuestoTotal = -1;
				tr.rollback();
			}
		}
		finally {
			if(emf != null && emf.isOpen())
				emf.close();
			if(em != null && em.isOpen())
				em.close();
		}
		return presupuestoTotal;
	}

}
