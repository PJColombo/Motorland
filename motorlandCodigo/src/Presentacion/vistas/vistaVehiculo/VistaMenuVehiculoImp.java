/**
 * 
 */
package Presentacion.vistas.vistaVehiculo;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import Integración.query.VIPResultado;
import Negocio.Vehiculo.TVehiculo;
import Presentacion.comandos.listadecomandos.ListaComandos;
import Presentacion.controlador.Context;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author José Antonio Garrido Sualdea
 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class VistaMenuVehiculoImp extends VistaMenuVehiculo {
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private VehiculoGUI vVehiculos;

	public VistaMenuVehiculoImp(){
		vVehiculos = new VehiculoGUI();
	}


	@Override
	public void update(Context contexto) {
		String mensaje = ""; 
		int tipo = -1; 
		if(contexto.getEvent() == ListaComandos.VISTAMENUVEHICULO){
			vVehiculos.setVisible(true);
		}
		else if(contexto.getEvent() == ListaComandos.MOSTRARALTAVEHICULO){			
			switch((int)contexto.getData()){
				case -1: mensaje +="error al dar de alta a un vehiculo"; 
				tipo = JOptionPane.ERROR_MESSAGE;
				break;
				case -2: mensaje +="error al dar de alta a vehiculo existente pero dado de baja"; 
				tipo = JOptionPane.ERROR_MESSAGE;
				break;
				case -3: mensaje +="error, el vehiculo existe y esta dado de alta"; 
				tipo = JOptionPane.ERROR_MESSAGE;
				break;
				default: mensaje += "existo al dar de alta"; 
				tipo = JOptionPane.INFORMATION_MESSAGE;
				break;
			}
			JOptionPane.showMessageDialog(vVehiculos, mensaje, "Alta vehículo", 
					tipo);
		}
		else if(contexto.getEvent() == ListaComandos.MOSTRARBAJAVEHICULO){
			switch((int)contexto.getData()){
				case -1: mensaje +="error al dar de baja a un vehiculo existe dado de alta"; 
				tipo = JOptionPane.ERROR_MESSAGE;
				break;
				case -2: mensaje +="error ya esta dado de baja el vehiculo"; 
				tipo = JOptionPane.ERROR_MESSAGE;
				break;
				case -3: mensaje +="error, el vehiculo no existe"; 
				tipo = JOptionPane.ERROR_MESSAGE;
				break;
				default: mensaje += "existo al dar de baja"; 
				tipo = JOptionPane.INFORMATION_MESSAGE;
				break;
			}
			JOptionPane.showMessageDialog(vVehiculos, mensaje, "Baja vehículo", 
					tipo);	
		}
		else if(contexto.getEvent() == ListaComandos.MOSTRARMODIFICARVEHICULO){
			switch((int)contexto.getData()){
				case -1: mensaje +="error al actualizar un vehiculo dado de alta";
				tipo = JOptionPane.ERROR_MESSAGE;
				break;
				case -2: mensaje +="error al instanciar";
				tipo = JOptionPane.ERROR_MESSAGE;
				break;
				case -3: mensaje +="error, no existe el vehiculo"; 
				tipo = JOptionPane.ERROR_MESSAGE;
				break;
				case -4: mensaje +="error el vehiculo ya esta dado de baja"; 
				tipo = JOptionPane.ERROR_MESSAGE;
				break;
				default: mensaje += "existo al dar de baja";
				tipo = JOptionPane.INFORMATION_MESSAGE;
				break;
			}
			JOptionPane.showMessageDialog(vVehiculos, mensaje, "Modifica vehículo", 
					tipo);	
		}
		else if(contexto.getEvent() == ListaComandos.MOSTRARBUSCARVEHICULO){
			TVehiculo v = (TVehiculo)contexto.getData();
			if(v != null){
				vVehiculos.muestra(v.toString());
			}
			else{
				JOptionPane.showMessageDialog(vVehiculos,"El vehículo no existe.", "Consulta vehículo",
						JOptionPane.ERROR_MESSAGE);
			}
			
		}
		else if(contexto.getEvent() == ListaComandos.MOSTRARLISTAVEHICULO){
			@SuppressWarnings("unchecked")
			ArrayList<TVehiculo> lista = ((ArrayList<TVehiculo>) contexto.getData());
			if (lista.size() > 0){
				for (TVehiculo v : lista) {
					vVehiculos.muestra(v.toString());
				}
			}
			else {
				JOptionPane.showMessageDialog(vVehiculos,"No hay vehículos para mostrar.", "Lista vehículos",
						JOptionPane.INFORMATION_MESSAGE);
			}
			
		}
		else if(contexto.getEvent() == ListaComandos.MOSTRARCOMPROBARAUTONOMIA){
			String autonomia = Integer.toString((int)contexto.getData());
			if(autonomia != null){
				vVehiculos.muestra("AUTONOMÍA DEL VEHÍCULO: " + autonomia);
			}
			else{
				JOptionPane.showMessageDialog(vVehiculos,"El vehículo no existe.", "Calcula autonomía", 
						JOptionPane.ERROR_MESSAGE);
			}		
			
		}
		else if(contexto.getEvent() == ListaComandos.MOSTRAR_VEHICULO_MAS_ALQUILADO) {
			VIPResultado res = (VIPResultado) contexto.getData();
			TVehiculo v = (TVehiculo) res.getRes1();
			int vecesAlquilado = (int) res.getRes2Valor();
			
			if(v != null)
				vVehiculos.muestra(v.toString() + "\n" + "NÚMERO DE VECES ALQUILADO: " + vecesAlquilado);
			else
				JOptionPane.showMessageDialog(vVehiculos,"No hay vehículos existentes.", "Vehículo VIP", 
						JOptionPane.INFORMATION_MESSAGE);
		}
		else if(contexto.getEvent() == ListaComandos.CERRAR_VISTA_VEHICULO) {
			vVehiculos.setVisible(false);
		}
	}
}