package Presentacion.comandos.listadecomandos.vistas.alquiler.alquilerEmergente;

import Presentacion.comandos.Command;
import Presentacion.comandos.listadecomandos.ListaComandos;
import Presentacion.controlador.Context;

public class CerrarVistaAlquilerEmergenteCommand implements Command {

	@Override
	public Context execute(Object data) {
		// TODO Auto-generated method stub
		return new Context(ListaComandos.CERRAR_VISTA_ALQUILER_EMERGENTE, null);
	}

}
