/**
 * 
 */
package Negocio.Alquiler;

import java.util.ArrayList;
import java.util.Calendar;

import Integración.Alquiler.DAOAlquiler;
import Integración.Alquiler.DAOAlquilerImp;
import Integración.Cliente.DAOCliente;
import Integración.DAOFactory.DaoFactory;
import Integración.Transaction.Transaction;
import Integración.Transaction.TransactionManager;
import Integración.Vehiculo.DAOVehiculo;
import Negocio.Cliente.TCliente;
import Negocio.Vehiculo.TVehiculo;
import Presentacion.comandos.listadecomandos.negocio.Alquiler.ModificacionResultado;


public class ASAlquilerImp implements ASAlquiler {

	@Override
	public int altaAlquiler(TAlquiler t) {
		int res = -1;
		Transaction tr = null;
		DAOAlquiler dao = DaoFactory.getInstance().createDAOAlquiler(); 
		try {
		TransactionManager.getInstance().newTransaction();
		tr = TransactionManager.getInstance().getTransaction();
		
		tr.start();
		
		res = dao.create(t); 
		
		if (res == 0) {
			res = -1;
			tr.rollback();
		}
		else
			tr.commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			TransactionManager.getInstance().deleteTransaction();
		}
		return res;
	}

	@Override
	public int bajaAlquiler(int idAlquiler) {
		int res = -1;
		Transaction tr = null; 
		DAOAlquiler dao = DaoFactory.getInstance().createDAOAlquiler();
		TAlquiler tAlq = null; 
		try {
			TransactionManager.getInstance().newTransaction();
			tr = TransactionManager.getInstance().getTransaction();
			
			tr.start();
			tAlq = dao.read(idAlquiler);
			//Alquiler inexistente.
			if (tAlq == null) {
				res = -1;
				tr.rollback();
			}
			else {
				if(tAlq.getActivo()) {
					tAlq.setActivo(false);
					tAlq.ponOrdenLineasAlquiler(Operacion.ELIMINAR);
					res = dao.update(tAlq);
					//Error al dar de bajar
					if (res == 0) {
						res = -2; 
						tr.rollback();
					}
					else
						tr.commit();
				}
				else {
					//Alquiler ya dado de baja.
					res = -3;
					tr.rollback();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			TransactionManager.getInstance().deleteTransaction();
		}
		return res;
	}

	@Override
	public ArrayList<TAlquiler> listadoAlquileres() throws Exception {
		Transaction tr = null; 
		DAOAlquiler dao = DaoFactory.getInstance().createDAOAlquiler(); 
		ArrayList<TAlquiler> lista;
		try {
			TransactionManager.getInstance().newTransaction();
			tr = TransactionManager.getInstance().getTransaction();

			tr.start();
			
			lista = dao.list(); 
			
			tr.commit();
		}finally {
			TransactionManager.getInstance().deleteTransaction();
		}
		
		return lista;
	}

	@Override
	public TAlquiler buscaAlquiler(int idAlquiler) throws Exception {
		Transaction tr = null;
		DAOAlquiler dao = DaoFactory.getInstance().createDAOAlquiler();
		TAlquiler tAlq = null; 
		try {
			TransactionManager.getInstance().newTransaction();
			tr = TransactionManager.getInstance().getTransaction();
			
			tr.start();
			
			tAlq = dao.read(idAlquiler);
			
			tr.commit();
			
		}
		finally {
			TransactionManager.getInstance().deleteTransaction();	
		}		
		return tAlq;
	}


	@Override
	public ArrayList<TVehiculo> iniciarAlquiler(TAlquiler alqEnCurso) throws Exception {
		Transaction tr = null; 
		DAOCliente daoC = DaoFactory.getInstance().createDAOCliente();
		DAOAlquiler daoA = DaoFactory.getInstance().createDAOAlquiler();
		ArrayList<TVehiculo> l = null; 
		TCliente tCli = null; 
		
		try {
			TransactionManager.getInstance().newTransaction();
			tr = TransactionManager.getInstance().getTransaction();
			
			tr.start();
			
			tCli = daoC.read(alqEnCurso.getIdCliente());
	
			if (tCli != null && tCli.getActivo()) {
				l = new ArrayList<>();
				l = daoA.obtenVehiculosNoCoincidentes(alqEnCurso.getFechaIni(), alqEnCurso.getFechaFin());
				
				tr.commit();
			}
			else {
				tr.rollback();
			}
	
		}
		finally {
			TransactionManager.getInstance().deleteTransaction();
		}

		return l;
	}


	@Override
	public void agregarVehiculo(int idVehiculo) {
		
		
	}


	@Override
	public void quitarVehiculo(int idVehiculo) {
		
	}

	@Override
	public int modificarAlquiler(TAlquiler t) throws Exception {
		int res = 0;
		Transaction tr = null;
		DAOAlquiler daoA = DaoFactory.getInstance().createDAOAlquiler();
		try {
			TransactionManager.getInstance().newTransaction();
			tr = TransactionManager.getInstance().getTransaction();
			
			tr.start();
			
			res = daoA.update(t);
			
			if(res == 0) {
				tr.rollback();
				res = -1; 
			}
			else {
				res = 1;
				tr.commit();
			}
		}
		finally {
			TransactionManager.getInstance().deleteTransaction();
		}
		return res;
	}

	@Override
	public ArrayList<ArrayList<TVehiculo>> iniciaModificarAlquiler(TAlquiler t) {
		Transaction tr = null; 
		DAOAlquiler daoA = DaoFactory.getInstance().createDAOAlquiler();
		ArrayList<ArrayList<TVehiculo>> l = null; 
		
		try {
			TransactionManager.getInstance().newTransaction();
			tr = TransactionManager.getInstance().getTransaction();
			
			tr.start();
			
			l = new ArrayList<>();
			
			ArrayList<TVehiculo> vehiculosDisponibles = new ArrayList<>();
			vehiculosDisponibles = daoA.obtenVehiculosNoAlquiladosNoCoincidentes(t.getId(), t.getFechaIni(), t.getFechaFin());
			l.add(vehiculosDisponibles);
			
			ArrayList<TVehiculo> vehiculosAlquilados = new ArrayList<>();
			vehiculosAlquilados = daoA.obtenVehiculosAlquilados(t.getId());
			l.add(vehiculosAlquilados);
			
			
			tr.commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			TransactionManager.getInstance().deleteTransaction();
		}

		return l;
	}

	@Override
	public ModificacionResultado compruebaAlquiler(TAlquiler t) {
		Transaction tr = null; 
		DAOCliente daoC = DaoFactory.getInstance().createDAOCliente();
		DAOAlquiler daoA = DaoFactory.getInstance().createDAOAlquiler();
		TAlquiler tAlqAModificar = null; 
		boolean coincide = false;
		
		try {
			TransactionManager.getInstance().newTransaction();
			tr = TransactionManager.getInstance().getTransaction();
			
			tr.start();
			
			tAlqAModificar = daoA.read(t.getId());
			//El alquiler no existe.
			if(tAlqAModificar == null) {
				tr.rollback();
				return new ModificacionResultado(-1, null);
			}
			//El nuevo cliente no existe. 
			if(t.getIdCliente() > 0) {
				if(daoC.read(t.getIdCliente()) == null) {
					tr.rollback();
					return new ModificacionResultado(-2, null);
				}
			}
			else
				t.setIdCliente(tAlqAModificar.getIdCliente());
			//Nuevos fechas solapan con otros alquileres existentes en el sistema.
			if(t.getFechaIni() != null && t.getFechaFin() != null) {
				coincide = daoA.alquilerSolapa(t.getId(), t.getFechaIni(), t.getFechaFin());
				
				if(coincide) {
					tr.rollback();
					return new ModificacionResultado(-3, null); 
				}
			}
			else if(t.getFechaIni() != null) {
				coincide = daoA.alquilerSolapa(t.getId(), t.getFechaIni(), tAlqAModificar.getFechaFin());
				
				if(coincide) {
					tr.rollback();
					return new ModificacionResultado(-3, null);
				}
				else
					t.setFechaFin(tAlqAModificar.getFechaFin());
				
			}
			else if(t.getFechaFin() != null){
				coincide = daoA.alquilerSolapa(t.getId(), tAlqAModificar.getFechaIni(), t.getFechaFin());
				
				if(coincide) {
					tr.rollback();
					return new ModificacionResultado(-3, null);
				}
				else
					t.setFechaIni(tAlqAModificar.getFechaIni());
			}
			else {
				t.setFechaIni(tAlqAModificar.getFechaIni());
				t.setFechaFin(tAlqAModificar.getFechaFin());
			}

			t.setCosteTotal(tAlqAModificar.getCosteTotal());
			
			tr.commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			TransactionManager.getInstance().deleteTransaction();
		}

		return new ModificacionResultado(1, t);
	}
	
}