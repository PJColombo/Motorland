package Presentacion.comandos.listadecomandos.vistas.departamento;

import Presentacion.comandos.Command;
import Presentacion.comandos.listadecomandos.ListaComandosJPA;
import Presentacion.controlador.Context;

public class CerrarVistaDepartamentoCommand implements Command {

	@Override
	public Context execute(Object data) {
		return new Context(ListaComandosJPA.CERRAR_VISTA_DEPARTAMENTO, null);
	}

}
