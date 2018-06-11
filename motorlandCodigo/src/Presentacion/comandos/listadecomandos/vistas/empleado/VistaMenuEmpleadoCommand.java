package Presentacion.comandos.listadecomandos.vistas.empleado;

import Presentacion.comandos.Command;
import Presentacion.comandos.listadecomandos.ListaComandosJPA;
import Presentacion.controlador.Context;

public class VistaMenuEmpleadoCommand implements Command {

	@Override
	public Context execute(Object data) {
		// TODO Auto-generated method stub
		return new Context(ListaComandosJPA.VISTA_MENU_EMPLEADO, data);
	}

}
