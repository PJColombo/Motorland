package Presentacion.comandos.listadecomandos.vistas.departamento;

import Presentacion.comandos.Command;
import Presentacion.comandos.listadecomandos.ListaComandosJPA;
import Presentacion.controlador.Context;

public class VistaMenuDepartamentoCommand implements Command {

	@Override
	public Context execute(Object data) {
		return new Context(ListaComandosJPA.VISTA_MENU_DEPARTAMENTO, data);
	}

}
