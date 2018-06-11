package Presentacion.comandos.listadecomandos.vistas.empleado;

import Presentacion.comandos.Command;
import Presentacion.comandos.listadecomandos.ListaComandosJPA;
import Presentacion.controlador.Context;

public class CerrarVistaEmpleadoCommand implements Command {

	@Override
	public Context execute(Object data) {
		return new Context(ListaComandosJPA.CERRAR_VISTA_EMPLEADO, data);
	}

}
