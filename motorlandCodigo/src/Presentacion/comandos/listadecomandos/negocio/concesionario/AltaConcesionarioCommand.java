package Presentacion.comandos.listadecomandos.negocio.concesionario;

import Negocio.FactoriaSA.ASFactory;
import Negocio.concesionario.Concesionario;
import Presentacion.comandos.Command;
import Presentacion.comandos.listadecomandos.ListaComandosJPA;
import Presentacion.controlador.Context;

public class AltaConcesionarioCommand implements Command {

	@Override
	public Context execute(Object data) {
		int res;
		
		res = ASFactory.getInstance().createASConcesionario().altaConcesionario((Concesionario) data);
		
		return new Context(ListaComandosJPA.MOSTRAR_ALTA_CONCESIONARIO, res);
	}

}
