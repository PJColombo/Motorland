package Presentacion.vistas.vistaAlquiler.vistaAlquilerEmergente;





import java.util.ArrayList;

import javax.swing.JOptionPane;

import Negocio.Alquiler.TAlquiler;
import Negocio.Alquiler.enumeradosAlq.Accion;
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
	private AlquilerEmergenteGUI vAlquilerEmergente;
	//private static final String SEPARATOR = "----------------------------------";	

	public VistaMenuAlquilerEmergenteImp(){
		vAlquilerEmergente = new AlquilerEmergenteGUI();
	}


	@SuppressWarnings("unchecked")
	public void update(Context contexto) {
		
		
		switch(contexto.getEvent()) 
		{
			case ListaComandos.PREPARA_VISTA_MENU_ALTA_ALQUILER_EMERGENTE:
				vAlquilerEmergente.setTAlquiler((TAlquiler) contexto.getData()); 
				vAlquilerEmergente.configuraFechas();
				vAlquilerEmergente.setVisible(true);
				vAlquilerEmergente.setTipo(Accion.ALTA);
				break; 
			case ListaComandos.VISTA_MENU_ALTA_ALQUILER_EMERGENTE:
				vAlquilerEmergente.muestraVehiculosDisponibles((ArrayList<TVehiculo>) contexto.getData());
				break; 
			case ListaComandos.CERRAR_ALTA_ALQUILER_EMERGENTE:
				vAlquilerEmergente.limpiaCampos();
				vAlquilerEmergente.setVisible(false);
				break;
			case ListaComandos.PREPARA_VISTA_MENU_MODIFICAR_ALQUILER_EMERGENTE:
				TAlquiler t = (TAlquiler) contexto.getData();
				vAlquilerEmergente.setTAlquiler(t);
				vAlquilerEmergente.configuraFechas();
				vAlquilerEmergente.setTipo(Accion.MODIFICACION);
				vAlquilerEmergente.preparaTipo();
				break;
			case ListaComandos.VISTA_MENU_MODIFICAR_ALQUILER_EMERGENTE:
				ArrayList<ArrayList<TVehiculo>> listas = (ArrayList<ArrayList<TVehiculo>>) contexto.getData();
				vAlquilerEmergente.muestraVehiculosDisponibles(listas.get(0));
				vAlquilerEmergente.muestraVehiculosAlquilados(listas.get(1));
				vAlquilerEmergente.setVisible(true);
				break;
			case ListaComandos.CERRAR_VISTA_ALQUILER_EMERGENTE:
				vAlquilerEmergente.limpiaCampos();
				vAlquilerEmergente.setVisible(false);
				break;
			case ListaComandos.MOSTRARMODIFICARALQUILER:
				vAlquilerEmergente.limpiaCampos();
				vAlquilerEmergente.setVisible(false);
			break;
			case ListaComandos.ERROR_ALTA_ALQUILER:
				vAlquilerEmergente.limpiaCampos();
				vAlquilerEmergente.setVisible(false);
			break;
		}
	
	}
}
