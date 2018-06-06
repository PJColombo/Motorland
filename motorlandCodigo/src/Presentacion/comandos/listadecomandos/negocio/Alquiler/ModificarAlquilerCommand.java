/**
 * 
 */
package Presentacion.comandos.listadecomandos.negocio.Alquiler;

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
public class ModificarAlquilerCommand implements Command {
	/** 
	 * (sin Javadoc)
	 * @see Command#execute(Class data)
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public Context execute(Object data) {
		// begin-user-code
		TAlquiler t = (TAlquiler) data; 
		int res = 0; 
		try {
			res = ASFactory.getInstance().createSAAlquiler().modificarAlquiler(t);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Apéndice de método generado automáticamente
		return new Context(ListaComandos.MOSTRARMODIFICARALQUILER, res);
		// end-user-code
	}
}