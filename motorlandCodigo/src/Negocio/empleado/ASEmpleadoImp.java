package Negocio.empleado;

import java.util.Collection;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import Negocio.departamento.Departamento;

public class ASEmpleadoImp implements ASEmpleado {

	@SuppressWarnings("unchecked")
	@Override
	public int altaEmpleado(Empleado e) {
		int res = 0;
		EntityManagerFactory emf = null;
		EntityManager em = null; 
		EntityTransaction tr = null;
		List<Empleado> eLeido = null;
		List<Departamento> dLeido = null; 
		Query q; 
		try {
			emf = Persistence.createEntityManagerFactory("Motorland");
			em = emf.createEntityManager();
			tr = em.getTransaction();
			
			tr.begin();
			
			q = em.createNamedQuery("Departamento.findByNombre");
			q.setParameter("nombre", e.getDepartamento().getNombre());
			
			dLeido = q.getResultList();
			
			if(!dLeido.isEmpty()) {
				if(dLeido.get(0).isActivo()) {
					
					q = em.createNamedQuery("Empleado.findByDni");
					q.setParameter("dni", e.getDni());
					
					eLeido = q.getResultList();
					
					if(eLeido.isEmpty()) {
						res = 1;
						dLeido.get(0).agregaEmpleado(e);
						e.setDepartamento(dLeido.get(0));
						em.persist(e);
						tr.commit();
					}
					else {
						Empleado empLeido = eLeido.get(0);
						if(!empLeido.isActivo()) {
							empLeido.setActivo(true);
							empLeido.setCuenta(e.getCuenta());
							empLeido.setDepartamento(e.getDepartamento());
							empLeido.setDomicilio(e.getDomicilio());
							empLeido.setNombre(e.getNombre());
							
							if(e instanceof EmpleadoTemporal) {
								((EmpleadoTemporal) empLeido).setFechaIni(((EmpleadoTemporal) e).getFechaIni());
								((EmpleadoTemporal) empLeido).setFechaFin(((EmpleadoTemporal) e).getFechaFin());
							}
							else if(e instanceof EmpleadoFijo) {
								((EmpleadoFijo) empLeido).setAntiguedad(((EmpleadoFijo) e).getAntiguedad());
							}
							
							res = -4;
							tr.commit();
						}
						//Ya existe un empleado con ese DNI activo.
						else {
							res = -3;
							tr.rollback();
						}
					}
				}
				//El departamento del nuevo empleado está inactivo.
				else {
					res = -2;
					tr.rollback();
				}
				
			}
			//El departamento del nuevo empleado no existe. 
			else {
				res = -1;
				tr.rollback();
			}
		
		}
		catch(Exception exc) {
			exc.printStackTrace();
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
	public int bajaEmpleado(int id) {
		int res = 0;
		EntityManagerFactory emf = null;
		EntityManager em = null; 
		EntityTransaction tr = null;
		List<Empleado> eLeido = null;
		Query q; 
		
		try {
			emf = Persistence.createEntityManagerFactory("Motorland");
			em = emf.createEntityManager();
			tr = em.getTransaction();
			
			tr.begin();
			
			q = em.createNamedQuery("Empleado.findById");
			q.setParameter("id", id);
			
			eLeido = q.getResultList();
			
			if(!eLeido.isEmpty()) {
				if(eLeido.get(0).isActivo()) {
					Empleado emp = eLeido.get(0);
					//no funciona.
					emp.getDepartamento().eliminaEmpleado(emp);
					
					emp.setActivo(false);
					
					res = 1;
					tr.commit();
				}
				//El empleado ya está dado de baja.
				else {
					res = -2;
					tr.rollback();
				}
			}
			//El empleado no existe.
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
	public int modificaEmpleado(Empleado e) {
		int res = 0;
		EntityManagerFactory emf = null;
		EntityManager em = null; 
		EntityTransaction tr = null;
		List<Empleado> eLeido = null;
		List<Departamento> dLeido = null; 
		Query q1, q2; 
		
		try {
			emf = Persistence.createEntityManagerFactory("Motorland");
			em = emf.createEntityManager();
			tr = em.getTransaction();
			
			tr.begin();
			
			q1 = em.createNamedQuery("Empleado.findById");
			q1.setParameter("id", e.getId());
			eLeido = q1.getResultList();
			
			if(!eLeido.isEmpty()) {
				if(eLeido.get(0).isActivo()) {
					Empleado emp = eLeido.get(0);
					if(emp.getClass() == e.getClass()) {
						if(e.getDepartamento() != null) {
							q2 = em.createNamedQuery("Departamento.findByid");
							q2.setParameter("id", e.getDepartamento().getId());
							dLeido = q2.getResultList();
							
							if(!dLeido.isEmpty()) {
								if(dLeido.get(0).isActivo()) {
									emp.getDepartamento().eliminaEmpleado(emp);
									emp.setDepartamento(e.getDepartamento());
									emp.getDepartamento().agregaEmpleado(emp);
								}
								//El nuevo departamento se encuentra inactivo.
								else {
									res = -4;
									tr.rollback();
								}
							}
							//El nuevo departamento no existe.
							else {
								res = -3;
								tr.rollback();
							}
						}
						
						if(!e.getNombre().isEmpty())
							emp.setNombre(e.getNombre());
						
						if(!e.getDni().isEmpty()) {
							List<Empleado> empleadoDni;
							q2 = em.createNamedQuery("Empleado.findByDni");
							q2.setParameter("dni", e.getDni());
							empleadoDni = q2.getResultList();
							
							if(empleadoDni.isEmpty()) {
								emp.setDni(e.getDni());
							}
							//El nuevo DNI ya existe en la tabla. 
							else {
								res = -8;
								tr.rollback();
							}
						}
						
						if(!e.getDomicilio().isEmpty())
							emp.setDomicilio(e.getDomicilio());
						
						if(!e.getCuenta().isEmpty())
							emp.setCuenta(e.getCuenta());
						
						if(e instanceof EmpleadoTemporal) {
							EmpleadoTemporal empTemp = (EmpleadoTemporal) e;
							EmpleadoTemporal empTempLeido = (EmpleadoTemporal) emp;
							if(empTemp.getFechaIni() != null && empTemp.getFechaFin() != null) {
								empTempLeido.setFechaIni(empTemp.getFechaIni());
								empTempLeido.setFechaFin(empTemp.getFechaFin());
							}
							else if(empTemp.getFechaIni() != null) {
								if (empTemp.getFechaIni().compareTo(empTempLeido.getFechaFin()) <= 0)
									empTempLeido.setFechaIni(empTemp.getFechaIni());
								//La nueva fecha de inicio es mayor que la fecha final. 
								else {
									res = -5;
									tr.rollback();
								}
									
							}
							else if(empTemp.getFechaFin() != null) {
								if(empTemp.getFechaFin().compareTo(empTempLeido.getFechaIni()) >= 0)
									empTempLeido.setFechaFin( empTemp.getFechaFin());
								//La nueva fecha final es menor que la fecha de inicio.
								else {
									res = -6;
									tr.rollback();
								}
							}
								
						}
						else if(e instanceof EmpleadoFijo) {
							if(((EmpleadoFijo) e).getAntiguedad() > 0)
								((EmpleadoFijo) emp).setAntiguedad(((EmpleadoFijo) e).getAntiguedad());
						}
						
						res = 1;
						tr.commit();
					}
					//El tipo de empleado que se quiere modificar es diferente.
					else {
						res = -7;
						tr.rollback();
					}
				}
				//El empleado está inactivo.
				else {
					res = -2;
					tr.rollback();
				}
			}
			//El empleado no existe. 
			else {
				res = -1;
				tr.rollback();
			}
		}
		catch (Exception exc) {
			exc.printStackTrace();
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
	public Empleado consultaEmpleado(int id) {
		Empleado e = null;
		EntityManagerFactory emf = null;
		EntityManager em = null; 
		EntityTransaction tr = null;
		List<Empleado> eLeido = null;
		Query q;
		
		try {
			emf = Persistence.createEntityManagerFactory("Motorland");
			em = emf.createEntityManager();
			tr = em.getTransaction();
			
			tr.begin();
			
			q = em.createNamedQuery("Empleado.findById");
			q.setParameter("id", id);
			eLeido = q.getResultList();
			
			if(!eLeido.isEmpty()) {
				e = eLeido.get(0);
				tr.commit();
			}
			else
				tr.rollback();

		}
		finally {
			if(emf != null && emf.isOpen())
				emf.close();
			if(em != null && em.isOpen())
				em.close();
		}
		return e;
	}

	@Override
	public Collection<Empleado> listaEmpleados() {
		Collection<Empleado> l = null; 
		EntityManagerFactory emf = null;
		EntityManager em = null; 
		EntityTransaction tr = null;
		Query q;
		
		try {
			emf = Persistence.createEntityManagerFactory("Motorland");
			em = emf.createEntityManager();
			tr = em.getTransaction();
			
			tr.begin();

			q = em.createQuery("Empleado.findAll");
			l = q.getResultList();
			
			tr.commit();
		}
		finally {
			if(emf != null && emf.isOpen())
				emf.close();
			if(em != null && em.isOpen())
				em.close();
		}
		return l;
	}

}
