package Presentacion.comandos.listadecomandos.negocio.departamento;

import Negocio.FactoriaSA.ASFactory;
import Presentacion.comandos.Command;
import Presentacion.comandos.listadecomandos.ListaComandosJPA;
import Presentacion.controlador.Context;

public class BajaDepartamentoCommand implements Command {

	@Override
	public Context execute(Object data) {
		int res; 
		
		res = ASFactory.getInstance().createASDepartamento().bajaDepartamento((int) data);
		
		return new Context(ListaComandosJPA.MOSTRAR_BAJA_DEPARTAMENTO, res);
	}

}
