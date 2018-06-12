package Presentacion.comandos.listadecomandos.negocio.concesionario;

import Negocio.FactoriaSA.ASFactory;
import Negocio.concesionario.ConcesionarioDepartamentoID;
import Presentacion.comandos.Command;
import Presentacion.comandos.listadecomandos.ListaComandosJPA;
import Presentacion.controlador.Context;

public class EliminaConcesionarioDepartamentoCommand implements Command {

	@Override
	public Context execute(Object data) {
		int res;
		
		res = ASFactory.getInstance().createASConcesionario().eliminaDepartamento((ConcesionarioDepartamentoID) data);
		
		return new Context(ListaComandosJPA.MOSTRAR_ELIMINA_CONCESIONARIODEPARTAMENTO_CONCESIONARIO, res);
	}

}
