package Presentacion.comandos.listadecomandos.vistas.vehiculo;

import Presentacion.comandos.Command;
import Presentacion.comandos.listadecomandos.ListaComandos;
import Presentacion.controlador.Context;

public class CerrarVistaVehiculoCommand implements Command {

	@Override
	public Context execute(Object data) {
		return new Context(ListaComandos.CERRAR_VISTA_VEHICULO, data);
	}

}
