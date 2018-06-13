package Presentacion.comandos.listadecomandos.vistas.alquiler;

import Presentacion.comandos.Command;
import Presentacion.comandos.listadecomandos.ListaComandos;
import Presentacion.controlador.Context;

public class CerrarVistaAlquilerCommand implements Command {

	@Override
	public Context execute(Object data) {
		return new Context(ListaComandos.CERRAR_VISTA_ALQUILER, data);
	}

}
