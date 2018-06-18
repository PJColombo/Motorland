/**
 * 
 */
package Presentacion.vistas.vistaCliente;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import Integración.query.VIPResultado;
import Negocio.Alquiler.TAlquiler;
import Negocio.Cliente.TCliente;
import Presentacion.comandos.listadecomandos.ListaComandos;
import Presentacion.controlador.Context;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author Paulo Colombo
 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class VistaMenuClientesImp extends VistaMenuClientes {
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private ClienteGUI vClientes;
	
	public VistaMenuClientesImp(){
		vClientes = new ClienteGUI();
	}
	

	/** 
	 * (sin Javadoc)
	 * @see VistaMenuClientes#update(Context contexto)
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	@SuppressWarnings("unchecked")
	public void update(Context contexto) {
		if(contexto.getEvent() == ListaComandos.VISTAMENUCLIENTE){
			vClientes.setVisible(true);
		}
		else if(contexto.getEvent() == ListaComandos.MOSTRARALTACLIENTE){
			String mensajeAlta ="";
			
			switch((int)contexto.getData()){
			case -2:
				mensajeAlta += "Error al dar de alta un cliente existente pero dado de baja";
				break;
			case -1:
				mensajeAlta += "Error al dar de alta un cliente nuevo";
				break;
			case -3:
				mensajeAlta += "Error, el cliente ya está dado de alta";
				break;
				
				default:
				mensajeAlta += "Éxito al dar de alta el cliente";
				break;	
			}
			JOptionPane.showMessageDialog(null,mensajeAlta);
		}
		else if(contexto.getEvent() == ListaComandos.MOSTRARBAJACLIENTE){
			String mensajeBaja = "";
			switch((int)contexto.getData()){
			case -1:
				mensajeBaja += "Error al dar de baja un cliente existente activo";
				break;
			case -2:
				mensajeBaja += "Error, el cliente ya está dado de baja";
				break;
			case -3:
				mensajeBaja += "Error, no existe el cliente";
				break;
				
				default:
				mensajeBaja += "Éxito al dar de baja el cliente";
				break;	
			}
			JOptionPane.showMessageDialog(null,mensajeBaja);
					
		}
		else if(contexto.getEvent() == ListaComandos.MOSTRARCONSULTARCLIENTE){
			
			if((TCliente)contexto.getData() != null){
				vClientes.muestra((TCliente)contexto.getData());
			}
			else{
				JOptionPane.showMessageDialog(vClientes,"Error al consultar el cliente", 
						"Consulta cliente", JOptionPane.ERROR_MESSAGE);
			}
			
			
		}
		else if(contexto.getEvent() == ListaComandos.MOSTRARMODIFICARCLIENTE){
			String mensajeModificar = "";
			switch((int)contexto.getData()){
			case -1:
				mensajeModificar += "Error al modificar cliente existente dado de alta";
				break;
			case -2:
				mensajeModificar += "Error, el cliente ya está dado de baja";
				break;
			case -3:
				mensajeModificar += "Error, no existe el cliente";
				break;
				
				default:
					mensajeModificar += "Éxito al modificar el cliente";
				break;	
			}
			JOptionPane.showMessageDialog(null,mensajeModificar);
			
		}
		else if(contexto.getEvent() == ListaComandos.MOSTRARLISTACLIENTE){
			ArrayList<TCliente> lista = ((ArrayList<TCliente>) contexto.getData());
			TCliente[] listaConFormato = new TCliente[lista.size()];
			
			vClientes.muestra(lista.toArray(listaConFormato));
				
			
		}
		else if(contexto.getEvent() == ListaComandos.MOSTRARCLIENTEVIP){
			ArrayList<VIPResultado> lista = (ArrayList<VIPResultado>) contexto.getData();
			if(lista != null) {
				for (VIPResultado vipResultado : lista) {
					TCliente c = (TCliente) vipResultado.getRes1();
					vClientes.muestraTexto(c.toString());
					TAlquiler t = (TAlquiler) vipResultado.getRes2Valor();
					vClientes.muestraTexto("ID ALQUILER: " + t.getId() + "\n" + "COSTE: " + t.getCosteTotal());
				}
			}
			else{
				JOptionPane.showMessageDialog(null,"Error al consultar el cliente VI");
			}
			
		}
		else if(contexto.getEvent() == ListaComandos.MOSTRAR_ELIMINA_CLIENTE) {
			switch((int) contexto.getData()){
				case -1:
					JOptionPane.showMessageDialog(vClientes,"El cliente no existe.", "Elimina cliente", JOptionPane.INFORMATION_MESSAGE);
				break;
				case -2:
					JOptionPane.showMessageDialog(vClientes,"Error al intentar eliminar el cliente", "Elimina cliente", JOptionPane.ERROR_MESSAGE);
				break;
				default:
					JOptionPane.showMessageDialog(vClientes,"El cliente se ha eliminado con éxito! ", "Elimina cliente", JOptionPane.INFORMATION_MESSAGE);
				break;
			}
		}
		else if(contexto.getEvent() == ListaComandos.CERRAR_VISTA_CLIENTE) {
			vClientes.setVisible(false);
		}
		
	}
}