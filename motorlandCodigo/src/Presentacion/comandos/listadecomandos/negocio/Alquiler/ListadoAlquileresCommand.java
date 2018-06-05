/**
 * 
 */
package Presentacion.comandos.listadecomandos.negocio.Alquiler;

import java.util.ArrayList;

import Negocio.Alquiler.TAlquiler;
import Negocio.FactoriaSA.ASFactory;
import Presentacion.comandos.Command;
import Presentacion.comandos.listadecomandos.ListaComandos;
import Presentacion.controlador.Context;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author Paulo Colombo
 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class ListadoAlquileresCommand implements Command {
	/** 
	 * (sin Javadoc)
	 * @see Command#execute(Class data)
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public Context execute(Object data) {
		ArrayList<TAlquiler> lista = new ArrayList<>();
		
		try {
			lista = ASFactory.getInstance().createSAAlquiler().listadoAlquileres();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return new Context(ListaComandos.MOSTRARLISTAALQUILER, lista); 
	}
}