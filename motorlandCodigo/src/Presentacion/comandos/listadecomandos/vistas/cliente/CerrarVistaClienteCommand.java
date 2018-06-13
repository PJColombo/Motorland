package Presentacion.comandos.listadecomandos.vistas.cliente;

import Presentacion.comandos.Command;
import Presentacion.comandos.listadecomandos.ListaComandos;
import Presentacion.controlador.Context;

public class CerrarVistaClienteCommand implements Command {

	@Override
	public Context execute(Object data) {
		return new Context(ListaComandos.CERRAR_VISTA_CLIENTE, null);
	}

}
