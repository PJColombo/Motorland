package Negocio.departamento;

import java.util.Collection;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;

import Negocio.empleado.Empleado;

public class ASDepartamentoImp implements ASDepartamento {

	@Override
	public int altaDepartamento(Departamento d) {
		int res = 0;
		EntityManagerFactory emf = null;
		EntityManager em = null;
		EntityTransaction tr;
		Query q = null; 
		List<Departamento> dLeido = null;
		try {
			emf = Persistence.createEntityManagerFactory("Motorland");
			em = emf.createEntityManager();
			tr = em.getTransaction();
			
			tr.begin();
			
			q = em.createNamedQuery("Departamento.findByNombre", Departamento.class);
			q.setParameter("nombre", d.getNombre());
			
			dLeido = (List<Departamento>) q.getResultList();
			
			//Departamento no existe.
			if(dLeido.isEmpty()) {
				res = 1; 
				em.persist(d);
				tr.commit();
			}
			//Departamento existe y esta activo.
			else if(dLeido.get(0).isActivo()) {
				res = -1;
				tr.rollback();
			}
			//Departamento existe pero esta inactivo.
			else {
				dLeido.get(0).setActivo(true);
				dLeido.get(0).setNombre(d.getNombre());
				tr.commit();
				res = -2;
			}
		}
		finally {
			if(em != null)
				em.close();
			if(emf != null)
				emf.close();
		}
		return res;
	}

	@Override
	public int bajaDepartamento(Integer id) {
		int res = 0;
		EntityManagerFactory emf = null;
		EntityManager em = null;
		EntityTransaction tr;
		Departamento dLeido = null;
		Empleado empFind;
		try {
			emf = Persistence.createEntityManagerFactory("Motorland");
			em = emf.createEntityManager();
			tr = em.getTransaction();
			
			tr.begin();
			
			dLeido = em.find(Departamento.class, id);
			
			
			if(dLeido != null) {
				if(dLeido.isActivo()) {
					dLeido.setActivo(false);
					/*
					 * Al dar de baja un departamento, damos de baja
					 * todos sus empleados
					 */
					for (Empleado e : dLeido.getEmpleados()) {
						empFind = em.find(Empleado.class, e.getId());
						empFind.setActivo(false);
					}
					res = 1;
					tr.commit();
				}
				//Departamento ya estaba inactivo.
				else {
					res = -2;
					tr.rollback();
				}
			}
			//Departamento inexistente.
			else {
				res = -1;
				tr.rollback();
			}
		return res;
		}
		finally {
			if(em != null)
				em.close();
			if(emf != null)
				emf.close();
		}
	}
	@Override
	public int modificaDepartamento(Departamento d) {
		int res = 1;
		EntityManagerFactory emf = null;
		EntityManager em = null;
		EntityTransaction tr;
		List<Departamento> dLeido = null;
		Departamento dAModificar = null; 
		Query q; 
		try {
			emf = Persistence.createEntityManagerFactory("Motorland");
			em = emf.createEntityManager();
			tr = em.getTransaction();
			
			tr.begin();
			
			dAModificar = em.find(Departamento.class, d.getId());
			if(dAModificar != null) {
				if(dAModificar.isActivo()) {
					if(!d.getNombre().isEmpty()) {
						q = em.createNamedQuery("Departamento.findByNombre", Departamento.class);
						q.setParameter("nombre", d.getNombre());
						dLeido = q.getResultList();
						
						if(dLeido.isEmpty()) {
							dAModificar.setNombre(d.getNombre());
						}
						//Ya existe un departamento con ese nombre.
						else {
							res = -3;
							tr.rollback();
						}
					}
					
					tr.commit();
				}
				//Departamento inactivo. No se puede modificar.
				else {
					res = -2;
					tr.rollback();
				}
				
			}
			//Departamento inexistente.
			else {
				res = -1;
				tr.rollback();
			}
			
		}
		finally {
			if(em != null)
				em.close();
			if(emf != null)
				emf.close();
		}
		
		return res;
	}

	@Override
	public Departamento consultaDepartamento(Integer id) {
		EntityManagerFactory emf = null;
		EntityManager em = null;
		EntityTransaction tr;
		Departamento d = null;
		
		try {
			emf = Persistence.createEntityManagerFactory("Motorland");
			em = emf.createEntityManager();
			tr = em.getTransaction();
			
			tr.begin();
			
			d = em.find(Departamento.class, id);
			
			if(d != null)
				tr.commit();
			else
				tr.rollback();
		}
		finally {
			if(em != null)
				em.close();
			if(emf != null)
				emf.close();
		}
		return d;
	}

	@SuppressWarnings("unchecked")
	@Override
	public Collection<Departamento> listaDepartamento() {
		EntityManagerFactory emf = null;
		EntityManager em = null;
		EntityTransaction tr;
		Collection<Departamento> l = null;
		Query q;
		try {
			emf = Persistence.createEntityManagerFactory("Motorland");
			em = emf.createEntityManager();
			tr = em.getTransaction();
			
			tr.begin();
			
			q = em.createNamedQuery("Negocio.departamento.Departamento.findAll", Departamento.class);
			
			l = q.getResultList();
		}
		finally {
			if(em != null)
				em.close();
			if(emf != null)
				emf.close();
		}
		return l; 
	}
	
}
