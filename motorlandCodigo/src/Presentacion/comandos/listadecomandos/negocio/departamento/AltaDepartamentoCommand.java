package Presentacion.comandos.listadecomandos.negocio.departamento;

import Negocio.FactoriaSA.ASFactory;
import Negocio.departamento.Departamento;
import Presentacion.comandos.Command;
import Presentacion.comandos.listadecomandos.ListaComandosJPA;
import Presentacion.controlador.Context;

public class AltaDepartamentoCommand implements Command {

	@Override
	public Context execute(Object data) {
		int res;
		
		res = ASFactory.getInstance().createASDepartamento().altaDepartamento((Departamento) data);
		
		return new Context(ListaComandosJPA.MOSTRAR_ALTA_DEPARTAMENTO, res);
	}

}
