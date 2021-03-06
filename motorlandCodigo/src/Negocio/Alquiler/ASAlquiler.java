/**
 * 
 */
package Negocio.Alquiler;

import java.util.ArrayList;

import Negocio.Vehiculo.TVehiculo;
import Presentacion.comandos.listadecomandos.negocio.Alquiler.ModificacionResultado;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author Paulo Colombo
 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public interface ASAlquiler {
	
	
	public ArrayList<TVehiculo> iniciarAlquiler(TAlquiler alqEnCurso) throws Exception;
	public void agregarVehiculo(int idVehiculo);
	public void quitarVehiculo(int idVehiculo);
	
	public int altaAlquiler(TAlquiler t);

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public int bajaAlquiler(int idAlquiler);

	public ArrayList<ArrayList<TVehiculo>> iniciaModificarAlquiler(TAlquiler t); 
	
	public ModificacionResultado compruebaAlquiler(TAlquiler t); 
	
	public int modificarAlquiler(TAlquiler t) throws Exception;
	public ArrayList<TAlquiler> listadoAlquileres() throws Exception;

	public TAlquiler buscaAlquiler(int idAlquiler) throws Exception;
}