package Presentacion.comandos.listadecomandos.vistas.concesionario;

import Presentacion.comandos.Command;
import Presentacion.comandos.listadecomandos.ListaComandosJPA;
import Presentacion.controlador.Context;

public class CerrarVistaConcesionarioCommand implements Command {

	@Override
	public Context execute(Object data) {
		return new Context(ListaComandosJPA.CERRAR_VISTA_CONCESIONARIO, data);
	}

}
