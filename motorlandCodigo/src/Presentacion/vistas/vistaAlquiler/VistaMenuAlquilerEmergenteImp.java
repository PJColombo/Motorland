package Presentacion.vistas.vistaAlquiler;





import java.util.ArrayList;

import javax.swing.JOptionPane;

import Negocio.Alquiler.Accion;
import Negocio.Alquiler.TAlquiler;
import Negocio.Vehiculo.TVehiculo;
import Presentacion.comandos.listadecomandos.ListaComandos;
import Presentacion.controlador.Context;
import Presentacion.vistas.vistaCliente.VistaMenuClientes;
import Presentacion.vistas.vistaVehiculo.Vehiculo;
import Presentacion.vistas.vistaVehiculo.VistaMenuVehiculoImp;

public class VistaMenuAlquilerEmergenteImp extends VistaMenuAlquilerEmergente{
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private AlquilerEmergente vAltaAlquilerEmergente;
	//private static final String SEPARATOR = "----------------------------------";	

	public VistaMenuAlquilerEmergenteImp(){
		vAltaAlquilerEmergente = new AlquilerEmergente();
	}


	@SuppressWarnings("unchecked")
	public void update(Context contexto) {
		
		
		switch(contexto.getEvent()) 
		{
			case ListaComandos.VISTAMENUALTAALQUILEREMERGENTE:
				vAltaAlquilerEmergente.setTAlquiler((TAlquiler) contexto.getData()); 
				vAltaAlquilerEmergente.configuraFechas();
				vAltaAlquilerEmergente.setVisible(true);
				vAltaAlquilerEmergente.setTipo(Accion.ALTA);
				break; 
			case ListaComandos.MOSTRAR_VEHICULOS_DISPONIBLES:
				vAltaAlquilerEmergente.muestraVehiculosDisponibles((ArrayList<TVehiculo>) contexto.getData());
				break; 
			case ListaComandos.CERRAR_ALTA_ALQUILER_EMERGENTE:
				vAltaAlquilerEmergente.setVisible(false);
				break;
			case ListaComandos.PREPARA_VISTA_MENU_MODIFICAR_ALQUILER_EMERGENTE:
				vAltaAlquilerEmergente.setTAlquiler((TAlquiler) contexto.getData());
				vAltaAlquilerEmergente.configuraFechas();
				vAltaAlquilerEmergente.setTipo(Accion.MODIFICACION);
				break;
			case ListaComandos.VISTA_MENU_MODIFICAR_ALQUILER_EMERGENTE:
				ArrayList<ArrayList<TVehiculo>> listas = (ArrayList<ArrayList<TVehiculo>>) contexto.getData();
				vAltaAlquilerEmergente.muestraVehiculosDisponibles(listas.get(0));
				vAltaAlquilerEmergente.muestraVehiculosAlquilados(listas.get(1));
				vAltaAlquilerEmergente.setVisible(true);
				break;
			case ListaComandos.CERRAR_VISTA_ALQUILER_EMERGENTE:
				vAltaAlquilerEmergente.setVisible(false);
				break;
			case ListaComandos.MOSTRARMODIFICARALQUILER:
				vAltaAlquilerEmergente.setVisible(false);
			break;
		}
	
	}
}
