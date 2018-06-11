/**
 * 
 */
package Presentacion.dispatcher;

import Presentacion.comandos.listadecomandos.ListaComandos;
import Presentacion.comandos.listadecomandos.ListaComandosJPA;
import Presentacion.controlador.Context;
import Presentacion.vistas.vistaAcercaDe.VistaAcercaDe;
import Presentacion.vistas.vistaAlquiler.VistaMenuAlquiler;
import Presentacion.vistas.vistaAlquiler.vistaAlquilerEmergente.VistaMenuAlquilerEmergente;
import Presentacion.vistas.vistaCliente.VistaMenuClientes;
import Presentacion.vistas.vistaDepartamento.VistaDepartamento;
import Presentacion.vistas.vistaEmpleado.VistaEmpleado;
import Presentacion.vistas.vistaPrincipal.VistaPrincipal;
import Presentacion.vistas.vistaVehiculo.VistaMenuVehiculo;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author Paulo Colombo
 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class DispatcherImp extends Dispatcher {

	@Override
	public void run(Context context) {
		// TODO Auto-generated method stub
		switch (context.getEvent()) 
		{
			// Vista Principal
	
			case ListaComandos.VISTAMENUPRINCIPAL:
				VistaPrincipal.getInstance().update(context);
			break;
			case ListaComandos.CERRAR_VISTA_PRINCIPAL:
				VistaPrincipal.getInstance().update(context);
			break;
			//VISTA CLIENTES
			case ListaComandos.VISTAMENUCLIENTE:
			case ListaComandos.MOSTRARALTACLIENTE:
			case ListaComandos.MOSTRARBAJACLIENTE:
			case ListaComandos.MOSTRARCONSULTARCLIENTE:
			case ListaComandos.MOSTRARLISTACLIENTE:
			case ListaComandos.MOSTRARMODIFICARCLIENTE:
			case ListaComandos.MOSTRARCLIENTEVIP:
				VistaMenuClientes.getInstance().update(context);
			break;
			
			case ListaComandos.MOSTRAR_ELIMINA_CLIENTE:
				VistaMenuClientes.getInstance().update(context);
			case ListaComandos.CERRAR_VISTA_CLIENTE:
				VistaMenuClientes.getInstance().update(context);
				VistaPrincipal.getInstance().update(context);
			break;
			//VISTA VEHICULO
			case ListaComandos.VISTAMENUVEHICULO:
			case ListaComandos.MOSTRARALTAVEHICULO:
			case ListaComandos.MOSTRARBAJAVEHICULO:
			case ListaComandos.MOSTRARBUSCARVEHICULO:
			case ListaComandos.MOSTRARMODIFICARVEHICULO:
			case ListaComandos.MOSTRARLISTAVEHICULO:
			case ListaComandos.MOSTRARCOMPROBARAUTONOMIA:
				VistaMenuVehiculo.getInstance().update(context);
			break;
			
			//VISTA ALQUILER
			case ListaComandos.VISTAMENUALQUILER:
			case ListaComandos.CERRAR_ALTA_ALQUILER_EMERGENTE:
				VistaMenuAlquilerEmergente.getInstance().update(context);
				VistaMenuAlquiler.getInstance().update(context);
			break;
			case ListaComandos.CERRAR_VISTA_ALQUILER_EMERGENTE:
				VistaMenuAlquilerEmergente.getInstance().update(context);
				VistaMenuAlquiler.getInstance().update(context);
			break;
			case ListaComandos.CERRAR_VISTA_ALQUILER:
				VistaMenuAlquiler.getInstance().update(context);
				VistaPrincipal.getInstance().update(context);
			break;
			
			case ListaComandos.MOSTRARLISTAALQUILER:
				
			case ListaComandos.MOSTRARMODIFICARALQUILER:
				VistaMenuAlquilerEmergente.getInstance().update(context);
				VistaMenuAlquiler.getInstance().update(context);
			break;
			case ListaComandos.MOSTRARBAJAALQUILER:
				VistaMenuAlquilerEmergente.getInstance().update(context);
				VistaMenuAlquiler.getInstance().update(context);
			break;
			
			case ListaComandos.MOSTRARBUSCARALQUILER:
				VistaMenuAlquiler.getInstance().update(context);
			break;
			case ListaComandos.ERROR_ALTA_ALQUILER:
				VistaMenuAlquilerEmergente.getInstance().update(context);
				VistaMenuAlquiler.getInstance().update(context);
				break;
		
			//VISTA ACERCADE
			case ListaComandos.VISTAACERCADE:
				VistaAcercaDe.getInstance().update(context);
			break;
			
			//VISTA ALQUILER EMERGENTE
			case ListaComandos.VISTA_MENU_MODIFICAR_ALQUILER_EMERGENTE:
				VistaMenuAlquiler.getInstance().update(context);
				VistaMenuAlquilerEmergente.getInstance().update(context);
			break;
			case ListaComandos.PREPARA_VISTA_MENU_MODIFICAR_ALQUILER_EMERGENTE:
				VistaMenuAlquiler.getInstance().update(context);
				VistaMenuAlquilerEmergente.getInstance().update(context);
			break;
			case ListaComandos.PREPARA_VISTA_MENU_ALTA_ALQUILER_EMERGENTE:
				VistaMenuAlquilerEmergente.getInstance().update(context);
			break;
			case ListaComandos.VISTA_MENU_ALTA_ALQUILER_EMERGENTE:
				VistaMenuAlquilerEmergente.getInstance().update(context);
			break;
			
			
			//JPA
			
			case ListaComandosJPA.VISTA_MENU_DEPARTAMENTO:
				VistaPrincipal.getInstance().update(context);
				VistaDepartamento.getInstance().update(context);
			break;
			case ListaComandosJPA.CERRAR_VISTA_DEPARTAMENTO:
				VistaDepartamento.getInstance().update(context);
				VistaPrincipal.getInstance().update(context);
			break;
			
			case ListaComandosJPA.VISTA_MENU_EMPLEADO:
				VistaPrincipal.getInstance().update(context);
				VistaEmpleado.getInstance().update(context);
			break;
			case ListaComandosJPA.CERRAR_VISTA_EMPLEADO:
				VistaEmpleado.getInstance().update(context);
				VistaPrincipal.getInstance().update(context);
			break;
			
			
			
			case ListaComandosJPA.MOSTRAR_ALTA_DEPARTAMENTO:
				VistaDepartamento.getInstance().update(context);
			break;
			case ListaComandosJPA.MOSTRAR_BAJA_DEPARTAMENTO:
				VistaDepartamento.getInstance().update(context);
			break;
			case ListaComandosJPA.MOSTRAR_MODIFICA_DEPARTAMENTO:
				VistaDepartamento.getInstance().update(context);
			break;
			case ListaComandosJPA.MOSTRAR_CONSULTA_DEPARTAMENTO:
				VistaDepartamento.getInstance().update(context);
			break;
			case ListaComandosJPA.MOSTRAR_LISTA_DEPARTAMENTOS:
				VistaDepartamento.getInstance().update(context);
			break;
			
			
			case ListaComandosJPA.MOSTRAR_ALTA_EMPLEADO:
				VistaEmpleado.getInstance().update(context);
			break;
			case ListaComandosJPA.MOSTRAR_BAJA_EMPLEADO:
				VistaEmpleado.getInstance().update(context);
			break;
			case ListaComandosJPA.MOSTRAR_MODIFICA_EMPLEADO:
				VistaEmpleado.getInstance().update(context);
			break;
			case ListaComandosJPA.MOSTRAR_CONSULTA_EMPLEADO:
				VistaEmpleado.getInstance().update(context);
			break;
			case ListaComandosJPA.MOSTRAR_LISTA_EMPLEADOS:
				VistaEmpleado.getInstance().update(context);
			break;
		}
	}
}