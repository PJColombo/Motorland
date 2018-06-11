package Presentacion.comandos.listadecomandos.negocio.departamento;

import java.util.List;

import Negocio.FactoriaSA.ASFactory;
import Negocio.departamento.Departamento;
import Presentacion.comandos.Command;
import Presentacion.comandos.listadecomandos.ListaComandosJPA;
import Presentacion.controlador.Context;

public class ListaDepartamentosCommand implements Command {

	@Override
	public Context execute(Object data) {
		List<Departamento> l = null;
		
		l = (List<Departamento>) ASFactory.getInstance().createASDepartamento().listaDepartamento();
		
		return new Context(ListaComandosJPA.MOSTRAR_LISTA_DEPARTAMENTOS, l);
	}

}
