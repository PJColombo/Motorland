package Presentacion.comandos.listadecomandos.negocio.concesionario;

import Negocio.FactoriaSA.ASFactory;
import Negocio.concesionario.Concesionario;
import Presentacion.comandos.Command;
import Presentacion.comandos.listadecomandos.ListaComandosJPA;
import Presentacion.controlador.Context;

public class ModificaConcesionarioCommand implements Command {

	@Override
	public Context execute(Object data) {
		int res;
		
		res = ASFactory.getInstance().createASConcesionario().modificaConcesionario((Concesionario) data);
		
		return new Context(ListaComandosJPA.MOSTRAR_MODIFICA_CONCESIONARIO, res);
	}

}
