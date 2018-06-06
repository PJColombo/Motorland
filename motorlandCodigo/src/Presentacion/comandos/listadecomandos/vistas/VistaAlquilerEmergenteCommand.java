package Presentacion.comandos.listadecomandos.vistas;


import Presentacion.comandos.Command;
import Presentacion.comandos.listadecomandos.ListaComandos;
import Presentacion.controlador.Context;

public class VistaAlquilerEmergenteCommand implements Command {

	@Override
	public Context execute(Object data) {
		
		return new Context(ListaComandos.VISTAMENUALTAALQUILEREMERGENTE, data);
		
	}

}
