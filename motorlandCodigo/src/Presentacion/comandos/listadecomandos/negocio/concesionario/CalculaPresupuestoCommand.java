package Presentacion.comandos.listadecomandos.negocio.concesionario;

import Negocio.FactoriaSA.ASFactory;
import Presentacion.comandos.Command;
import Presentacion.comandos.listadecomandos.ListaComandosJPA;
import Presentacion.controlador.Context;

public class CalculaPresupuestoCommand implements Command {

	@Override
	public Context execute(Object data) {
		double presupuesto;
		
		presupuesto = ASFactory.getInstance().createASConcesionario().calculaPresupuesto((int) data);
		
		return new Context(ListaComandosJPA.MOSTRAR_CALCULA_PRESUPUESTO_CONCESIONARIO, presupuesto);
	}

}
