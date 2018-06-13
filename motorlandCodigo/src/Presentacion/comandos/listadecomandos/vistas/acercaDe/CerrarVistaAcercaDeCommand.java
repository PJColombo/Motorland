package Presentacion.comandos.listadecomandos.vistas.acercaDe;

import Presentacion.comandos.Command;
import Presentacion.comandos.listadecomandos.ListaComandos;
import Presentacion.controlador.Context;

public class CerrarVistaAcercaDeCommand implements Command {

	@Override
	public Context execute(Object data) {
		return new Context(ListaComandos.CERRAR_VISTA_ACERCADE, data);
	}

}
