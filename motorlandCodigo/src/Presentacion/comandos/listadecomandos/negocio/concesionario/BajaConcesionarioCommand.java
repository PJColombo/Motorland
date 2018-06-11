package Presentacion.comandos.listadecomandos.negocio.concesionario;

import Negocio.FactoriaSA.ASFactory;
import Presentacion.comandos.Command;
import Presentacion.comandos.listadecomandos.ListaComandosJPA;
import Presentacion.controlador.Context;

public class BajaConcesionarioCommand implements Command {

	@Override
	public Context execute(Object data) {
		int res;
		
		res = ASFactory.getInstance().createASConcesionario().bajaConcesionario((int) data);
		
		return new Context(ListaComandosJPA.MOSTRAR_BAJA_CONCESIONARIO, res);
	}

}
