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
	
		//	tr.commit();
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
		int res = -1;
		Transaction tr = null;
		DAOAlquiler daoA = DaoFactory.getInstance().createDAOAlquiler();
		DAOCliente daoC = DaoFactory.getInstance().createDAOCliente();
		boolean coincide = false; 
		TAlquiler tAlqAModificar = new TAlquiler();
		try {
			TransactionManager.getInstance().newTransaction();
			tr = TransactionManager.getInstance().getTransaction();
			
			tr.start();
			
			tAlqAModificar = daoA.read(t.getId());
			if(tAlqAModificar != null) {
				if(t.getIdCliente() > 0) {
					
					if(daoC.read(t.getIdCliente()) != null){
						tAlqAModificar.setIdCliente(t.getIdCliente());
					}
					//Nuevo ID de cliente no existe. 
					else {
						res = -2;
						tr.rollback();
						return res; 
					}
				}
				if(t.getFechaIni() != null && t.getFechaFin() != null) {
					coincide = daoA.alquilerSolapa(t.getFechaIni(), t.getFechaFin());
					
					if(!coincide) {
						tAlqAModificar.setFechaIni(t.getFechaIni());
						tAlqAModificar.setFechaFin(t.getFechaFin());
					}
					//Nuevas fechas solapan con alquileres ya existentes.
					else {
						res = -3; 
						tr.rollback();
						return res; 
					}
				}
				
				tAlqAModificar.setPago(t.getPago());
				
				tAlqAModificar.setlistaAlquilados(t.getlistaAlquilados());
				
				int updateRes;
				updateRes = daoA.update(tAlqAModificar);
				//Error al actualizar
				if(updateRes == 0) 
					res = -4;		
			}
			//No existe el alquiler a modificar. 
			else {
				res = -1;
				tr.rollback();
			}	
		}
		finally {
			TransactionManager.getInstance().deleteTransaction();
		}
		return res;
	}
	
}