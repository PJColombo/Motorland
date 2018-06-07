/**
 * 
 */
package Presentacion.vistas.vistaPrincipal;

import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

import Presentacion.comandos.listadecomandos.ListaComandos;
import Presentacion.controlador.Context;
import Presentacion.vistas.vistaAlquiler.vistaAlquilerEmergente.AlquilerEmergenteGUI;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author Paulo Colombo
 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class VistaPrincipalImp extends VistaPrincipal {
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private PrincipalGUI vPrincipal;
	
	public VistaPrincipalImp() 
	{
		vPrincipal = new PrincipalGUI();
	}

	/** 
	 * (sin Javadoc)
	 * @see VistaPrincipal#update(Context contexto)
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void update(Context contexto) {
		if(contexto.getEvent() == ListaComandos.VISTAMENUPRINCIPAL ||
				contexto.getEvent() == ListaComandos.CERRAR_VISTA_ALQUILER ||
				contexto.getEvent() == ListaComandos.CERRAR_VISTA_CLIENTE ||
				contexto.getEvent() == ListaComandos.CERRAR_VISTA_VEHICULO){
	            vPrincipal.setVisible(true);
		}
		else if(contexto.getEvent() == ListaComandos.CERRAR_VISTA_PRINCIPAL) {
			vPrincipal.setVisible(false);
			JOptionPane.showMessageDialog(vPrincipal, "Hasta luego! ", "Salir", JOptionPane.INFORMATION_MESSAGE);
			System.exit(0);
		}
	}
}