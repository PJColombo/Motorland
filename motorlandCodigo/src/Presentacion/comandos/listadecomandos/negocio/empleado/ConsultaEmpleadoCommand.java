package Presentacion.comandos.listadecomandos.negocio.empleado;

import Negocio.FactoriaSA.ASFactory;
import Negocio.empleado.Empleado;
import Presentacion.comandos.Command;
import Presentacion.comandos.listadecomandos.ListaComandosJPA;
import Presentacion.controlador.Context;

public class ConsultaEmpleadoCommand implements Command {

	@Override
	public Context execute(Object data) {
		Empleado e;
		
		e = ASFactory.getInstance().createASEmpleado().consultaEmpleado((int) data);

		return new Context(ListaComandosJPA.MOSTRAR_CONSULTA_EMPLEADO, e);
	}

}
