package Presentacion.comandos.listadecomandos.negocio.concesionario;

import Negocio.FactoriaSA.ASFactory;
import Negocio.concesionario.Concesionario;
import Presentacion.comandos.Command;
import Presentacion.comandos.listadecomandos.ListaComandosJPA;
import Presentacion.controlador.Context;

public class ConsultaConcesionarioCommand implements Command {

	@Override
	public Context execute(Object data) {
		Concesionario c;
		
		c = ASFactory.getInstance().createASConcesionario().consultaConcesionario((int) data);
		
		return new Context(ListaComandosJPA.MOSTRAR_CONSULTA_CONCESIONARIO, c);
	}

}
