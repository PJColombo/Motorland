package Presentacion.comandos.listadecomandos.vistas;


import Presentacion.comandos.Command;
import Presentacion.comandos.listadecomandos.ListaComandos;
import Presentacion.controlador.Context;

public class PreparaVistaMenuAltaAlquilerEmergenteCommand implements Command {

	@Override
	public Context execute(Object data) {
		
		return new Context(ListaComandos.PREPARA_VISTA_MENU_ALTA_ALQUILER_EMERGENTE, data);
		
	}

}
