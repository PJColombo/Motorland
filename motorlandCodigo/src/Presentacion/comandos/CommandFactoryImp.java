/**
 * 
 */
package Presentacion.comandos;

import Presentacion.comandos.listadecomandos.ListaComandos;
import Presentacion.comandos.listadecomandos.ListaComandosJPA;
import Presentacion.comandos.listadecomandos.negocio.Alquiler.AltaAlquilerCommand;
import Presentacion.comandos.listadecomandos.negocio.Alquiler.BajaAlquilerCommand;
import Presentacion.comandos.listadecomandos.negocio.Alquiler.IniciaModificarAlquilerCommand;
import Presentacion.comandos.listadecomandos.negocio.Alquiler.ListadoAlquileresCommand;
import Presentacion.comandos.listadecomandos.negocio.Alquiler.ModificarAlquilerCommand;
import Presentacion.comandos.listadecomandos.negocio.Alquiler.BuscarAlquilerCommand;
import Presentacion.comandos.listadecomandos.negocio.Cliente.AltaClienteCommand;
import Presentacion.comandos.listadecomandos.negocio.Cliente.BajaClienteCommand;
import Presentacion.comandos.listadecomandos.negocio.Cliente.BuscarClienteCommand;
import Presentacion.comandos.listadecomandos.negocio.Cliente.ClienteVipCommand;
import Presentacion.comandos.listadecomandos.negocio.Cliente.EliminaClienteCommand;
import Presentacion.comandos.listadecomandos.negocio.Cliente.ListarClientesCommand;
import Presentacion.comandos.listadecomandos.negocio.Cliente.ModificarClienteCommand;
import Presentacion.comandos.listadecomandos.negocio.Vehiculo.AltaVehiculoCommand;
import Presentacion.comandos.listadecomandos.negocio.Vehiculo.BajaVehiculoCommand;
import Presentacion.comandos.listadecomandos.negocio.Vehiculo.BuscarVehiculoCommand;
import Presentacion.comandos.listadecomandos.negocio.Vehiculo.ComprobarAutonomiaCommand;
import Presentacion.comandos.listadecomandos.negocio.Vehiculo.ListarVehiculoCommand;
import Presentacion.comandos.listadecomandos.negocio.Vehiculo.ModificarVehiculoCommand;
import Presentacion.comandos.listadecomandos.negocio.concesionario.AgregaConcesionarioDepartamentoCommand;
import Presentacion.comandos.listadecomandos.negocio.concesionario.AltaConcesionarioCommand;
import Presentacion.comandos.listadecomandos.negocio.concesionario.BajaConcesionarioCommand;
import Presentacion.comandos.listadecomandos.negocio.concesionario.CalculaPresupuestoCommand;
import Presentacion.comandos.listadecomandos.negocio.concesionario.ConsultaConcesionarioCommand;
import Presentacion.comandos.listadecomandos.negocio.concesionario.EliminaConcesionarioDepartamentoCommand;
import Presentacion.comandos.listadecomandos.negocio.concesionario.ListaConcesionariosCommand;
import Presentacion.comandos.listadecomandos.negocio.concesionario.ModificaConcesionarioCommand;
import Presentacion.comandos.listadecomandos.negocio.departamento.AltaDepartamentoCommand;
import Presentacion.comandos.listadecomandos.negocio.departamento.BajaDepartamentoCommand;
import Presentacion.comandos.listadecomandos.negocio.departamento.ConsultaDepartamentoCommand;
import Presentacion.comandos.listadecomandos.negocio.departamento.ListaDepartamentosCommand;
import Presentacion.comandos.listadecomandos.negocio.departamento.ModificaDepartamentoCommand;
import Presentacion.comandos.listadecomandos.negocio.empleado.AltaEmpleadoCommand;
import Presentacion.comandos.listadecomandos.negocio.empleado.BajaEmpleadoCommand;
import Presentacion.comandos.listadecomandos.negocio.empleado.ConsultaEmpleadoCommand;
import Presentacion.comandos.listadecomandos.negocio.empleado.ListaEmpleadoCommand;
import Presentacion.comandos.listadecomandos.negocio.empleado.ModificaEmpleadoCommand;
import Presentacion.comandos.listadecomandos.vistas.CerrarVistaAlquilerCommand;
import Presentacion.comandos.listadecomandos.vistas.CerrarVistaAlquilerEmergenteCommand;
import Presentacion.comandos.listadecomandos.vistas.CerrarVistaClienteCommand;
import Presentacion.comandos.listadecomandos.vistas.CerrarVistaPrincipalCommand;
import Presentacion.comandos.listadecomandos.vistas.CerrarVistaVehiculoCommand;
import Presentacion.comandos.listadecomandos.vistas.PreparaVistaMenuAltaAlquilerEmergenteCommand;
import Presentacion.comandos.listadecomandos.vistas.VistaMenuAcercaDeCommand;
import Presentacion.comandos.listadecomandos.vistas.VistaMenuAlquilerCommand;
import Presentacion.comandos.listadecomandos.vistas.VistaMenuAltaAlquilerEmergenteCommand;
import Presentacion.comandos.listadecomandos.vistas.VistaMenuClienteCommand;
import Presentacion.comandos.listadecomandos.vistas.VistaMenuModificarAlquilerEmergente;
import Presentacion.comandos.listadecomandos.vistas.VistaMenuPrincipalCommand;
import Presentacion.comandos.listadecomandos.vistas.VistaMenuVehiculoCommand;
import Presentacion.comandos.listadecomandos.vistas.concesionario.CerrarVistaConcesionarioCommand;
import Presentacion.comandos.listadecomandos.vistas.concesionario.VistaMenuConcesionarioCommand;
import Presentacion.comandos.listadecomandos.vistas.departamento.CerrarVistaDepartamentoCommand;
import Presentacion.comandos.listadecomandos.vistas.departamento.VistaMenuDepartamentoCommand;
import Presentacion.comandos.listadecomandos.vistas.empleado.CerrarVistaEmpleadoCommand;
import Presentacion.comandos.listadecomandos.vistas.empleado.VistaMenuEmpleadoCommand;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author Paulo Colombo
 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class CommandFactoryImp extends CommandFactory {

	@Override
	public Command getCommand(int event) {
		Command comando = null;
		switch (event){
			//VISTAS
			case ListaComandos.VISTAMENUPRINCIPAL:
				comando = new VistaMenuPrincipalCommand();
			break;
			case ListaComandos.CERRAR_VISTA_PRINCIPAL:
				comando = new CerrarVistaPrincipalCommand();
			break;
			case ListaComandos.VISTAACERCADE:
				comando = new VistaMenuAcercaDeCommand();
			break;
			case ListaComandos.VISTAMENUVEHICULO:
				comando = new VistaMenuVehiculoCommand();
			break;
			case ListaComandos.VISTAMENUCLIENTE:
				comando = new VistaMenuClienteCommand();
			break;
			case ListaComandos.VISTAMENUALQUILER:
				comando = new VistaMenuAlquilerCommand();
			break;
			case ListaComandos.PREPARA_VISTA_MENU_ALTA_ALQUILER_EMERGENTE:
				comando = new PreparaVistaMenuAltaAlquilerEmergenteCommand();
			break; 
			case ListaComandos.VISTA_MENU_ALTA_ALQUILER_EMERGENTE:
				comando = new VistaMenuAltaAlquilerEmergenteCommand();
			break;
			case ListaComandos.VISTA_MENU_MODIFICAR_ALQUILER_EMERGENTE:
				comando = new VistaMenuModificarAlquilerEmergente();
			break;
			case ListaComandos.CERRAR_VISTA_ALQUILER:
				comando = new CerrarVistaAlquilerCommand();
			break;
			case ListaComandos.CERRAR_VISTA_CLIENTE:
				comando = new CerrarVistaClienteCommand();
			break;
			case ListaComandos.CERRAR_VISTA_VEHICULO:
				comando = new CerrarVistaVehiculoCommand();
			break;
			case ListaComandos.CERRAR_VISTA_ALQUILER_EMERGENTE:
				comando = new CerrarVistaAlquilerEmergenteCommand();
			break;
			//NEGOCIO CLIENTES
			case ListaComandos.NEGOCIOALTACLIENTE:
				comando = new AltaClienteCommand();
			break;
			case ListaComandos.NEGOCIOBAJACLIENTE:
				comando = new BajaClienteCommand();
			break;
			case ListaComandos.NEGOCIOCONSULTARCLIENTE:
				comando = new BuscarClienteCommand();
			break;
			case ListaComandos.NEGOCIOLISTACLIENTE:
				comando = new ListarClientesCommand();
			break;
			case ListaComandos.NEGOCIOCLIENTEVIP:
				comando = new ClienteVipCommand();
			break;
			
			case ListaComandos.NEGOCIOMODIFICARCLIENTE:
				comando = new ModificarClienteCommand();
			break;
			
			case ListaComandos.NEGOCIO_ELIMINA_CLIENTE:
				comando = new EliminaClienteCommand();
			break;
			//NEGOCIO ALQUILER
			case ListaComandos.NEGOCIOALTAALQUILER:
				comando = new AltaAlquilerCommand();
			break;
			case ListaComandos.NEGOCIOBAJAALQUILER:
				comando = new BajaAlquilerCommand();
			break;
			case ListaComandos.NEGOCIOMODIFICARALQUILER:
				comando = new ModificarAlquilerCommand();
			break;
			case ListaComandos.NEGOCIOLISTAALQUILER:
				comando = new ListadoAlquileresCommand();
			break;
			case ListaComandos.NEGOCIOBUSCARALQUILER:
				comando = new BuscarAlquilerCommand();
			break;
			case ListaComandos.NEGOCIO_INICIA_MODIFICAR_ALQUILER:
				comando = new IniciaModificarAlquilerCommand();
			break;
			//NEGOCIO VEHICULO
			case ListaComandos.NEGOCIOALTAVEHICULO:
				comando = new AltaVehiculoCommand();
			break;
			case ListaComandos.NEGOCIOBAJAVEHICULO:
				comando = new BajaVehiculoCommand();
			break;
			case ListaComandos.NEGOCIOBUSCARVEHICULO:
				comando = new BuscarVehiculoCommand();
			break;
			case ListaComandos.NEGOCIOLISTAVEHICULO:
				comando = new ListarVehiculoCommand();
			break;
			case ListaComandos.NEGOCIOCOMPROBARAUTONOMIA:
				comando = new ComprobarAutonomiaCommand();
			break;
			case ListaComandos.NEGOCIOMODIFICARVEHICULO:
				comando = new ModificarVehiculoCommand();
			break;
			
			
			//JPA
			
			//VISTAS
			case ListaComandosJPA.VISTA_MENU_DEPARTAMENTO:
				comando = new VistaMenuDepartamentoCommand();
			break;
			case ListaComandosJPA.CERRAR_VISTA_DEPARTAMENTO:
				comando = new CerrarVistaDepartamentoCommand();
			break;
			
			case ListaComandosJPA.VISTA_MENU_EMPLEADO:
				comando = new VistaMenuEmpleadoCommand();
			break;
			case ListaComandosJPA.CERRAR_VISTA_EMPLEADO:
				comando = new CerrarVistaEmpleadoCommand();
			break;
			
			case ListaComandosJPA.VISTA_MENU_CONCESIONARIO:
				comando = new VistaMenuConcesionarioCommand();
			break;
			case ListaComandosJPA.CERRAR_VISTA_CONCESIONARIO:
				comando = new CerrarVistaConcesionarioCommand();
			break;
			//NEGOCIO
			
			//Departamento
			case ListaComandosJPA.NEGOCIO_ALTA_DEPARTAMENTO:
				comando = new AltaDepartamentoCommand();
			break;
			case ListaComandosJPA.NEGOCIO_BAJA_DEPARTAMENTO:
				comando = new BajaDepartamentoCommand();
			break;
			case ListaComandosJPA.NEGOCIO_MODIFICA_DEPARTAMENTO:
				comando = new ModificaDepartamentoCommand();
			break;
			case ListaComandosJPA.NEGOCIO_CONSULTA_DEPARTAMENTO:
				comando = new ConsultaDepartamentoCommand();
			break;
			case ListaComandosJPA.NEGOCIO_LISTA_DEPARTAMENTOS:
				comando = new ListaDepartamentosCommand();
			break;
			
			
			//Empleado
			case ListaComandosJPA.NEGOCIO_ALTA_EMPLEADO:
				comando = new AltaEmpleadoCommand();
			break;
			case ListaComandosJPA.NEGOCIO_BAJA_EMPLEADO:
				comando = new BajaEmpleadoCommand();
			break;
			case ListaComandosJPA.NEGOCIO_MODIFICA_EMPLEADO:
				comando = new ModificaEmpleadoCommand();
			break;
			case ListaComandosJPA.NEGOCIO_CONSULTA_EMPLEADO:
				comando = new ConsultaEmpleadoCommand();
			break;
			case ListaComandosJPA.NEGOCIO_LISTA_EMPLEADOS:
				comando = new ListaEmpleadoCommand();
			break;
		
			//Concesionario
			case ListaComandosJPA.NEGOCIO_ALTA_CONCESIONARIO:
				comando = new AltaConcesionarioCommand();
			break;
			case ListaComandosJPA.NEGOCIO_BAJA_CONCESIONARIO:
				comando = new BajaConcesionarioCommand();
			break;
			case ListaComandosJPA.NEGOCIO_MODIFICA_CONCESIONARIO:
				comando = new ModificaConcesionarioCommand();
			break;
			case ListaComandosJPA.NEGOCIO_CONSULTA_CONCESIONARIO:
				comando = new ConsultaConcesionarioCommand();
			break;
			case ListaComandosJPA.NEGOCIO_LISTA_CONCESIONARIOS:
				comando = new ListaConcesionariosCommand();
			break;
			case ListaComandosJPA.NEGOCIO_AGREGA_CONCESIONARIODEPARTAMENTO_CONCONCESIONARIO:
				comando = new AgregaConcesionarioDepartamentoCommand();
			break;
			case ListaComandosJPA.NEGOCIO_ELIMINA_CONCESIONARIODEPARTAMENTO_CONCESIONARIO:
				comando = new EliminaConcesionarioDepartamentoCommand();
			break;
			case ListaComandosJPA.NEGOCIO_CALCULA_PRESUPUESTO_CONCESIONARIO:
				comando = new CalculaPresupuestoCommand();
			break;
		}
		
		return comando;
	}
}