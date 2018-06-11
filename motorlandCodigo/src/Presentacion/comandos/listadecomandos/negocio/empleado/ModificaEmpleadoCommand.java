package Presentacion.comandos.listadecomandos.negocio.empleado;

import Negocio.FactoriaSA.ASFactory;
import Negocio.empleado.Empleado;
import Presentacion.comandos.Command;
import Presentacion.comandos.listadecomandos.ListaComandosJPA;
import Presentacion.controlador.Context;

public class ModificaEmpleadoCommand implements Command {

	@Override
	public Context execute(Object data) {
		int res;
		
		res = ASFactory.getInstance().createASEmpleado().modificaEmpleado((Empleado) data);

		return new Context(ListaComandosJPA.MOSTRAR_MODIFICA_EMPLEADO, res);
	}

}
