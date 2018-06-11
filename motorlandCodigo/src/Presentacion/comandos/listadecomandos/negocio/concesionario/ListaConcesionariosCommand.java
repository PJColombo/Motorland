package Presentacion.comandos.listadecomandos.negocio.concesionario;

import java.util.List;

import Negocio.FactoriaSA.ASFactory;
import Negocio.concesionario.Concesionario;
import Presentacion.comandos.Command;
import Presentacion.comandos.listadecomandos.ListaComandosJPA;
import Presentacion.controlador.Context;

public class ListaConcesionariosCommand implements Command {

	@Override
	public Context execute(Object data) {
		List<Concesionario> l;
		
		l = (List<Concesionario>) ASFactory.getInstance().createASConcesionario().listaConcesionarios();
		
		return new Context(ListaComandosJPA.MOSTRAR_LISTA_CONCESIONARIOS, l);
	}

}
