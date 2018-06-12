package Presentacion.comandos.listadecomandos.negocio.concesionario;

import Negocio.FactoriaSA.ASFactory;
import Negocio.concesionario.ConcesionarioDepartamento;
import Presentacion.comandos.Command;
import Presentacion.comandos.listadecomandos.ListaComandosJPA;
import Presentacion.controlador.Context;

public class AgregaConcesionarioDepartamentoCommand implements Command {

	@Override
	public Context execute(Object data) {
		ConcesionarioDepartamento conDep = (ConcesionarioDepartamento) data;
		int res;
		
		res = ASFactory.getInstance().createASConcesionario().agregaDepartamento(conDep);
		
		return new Context(ListaComandosJPA.MOSTRAR_AGREGA_CONCESIONARIODEPARTAMENTO_CONCESIONARIO, res);
	}

}
