package Presentacion.comandos.listadecomandos.negocio.departamento;

import Negocio.FactoriaSA.ASFactory;
import Negocio.departamento.Departamento;
import Presentacion.comandos.Command;
import Presentacion.comandos.listadecomandos.ListaComandosJPA;
import Presentacion.controlador.Context;

public class ConsultaDepartamentoCommand implements Command {

	@Override
	public Context execute(Object data) {
		Departamento d;
		
		d = ASFactory.getInstance().createASDepartamento().consultaDepartamento((int) data);
		
		return new Context(ListaComandosJPA.MOSTRAR_CONSULTA_DEPARTAMENTO, d);
	}

}
