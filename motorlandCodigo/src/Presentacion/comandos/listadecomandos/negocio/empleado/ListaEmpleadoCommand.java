package Presentacion.comandos.listadecomandos.negocio.empleado;

import java.util.List;

import Negocio.FactoriaSA.ASFactory;
import Negocio.empleado.Empleado;
import Presentacion.comandos.Command;
import Presentacion.comandos.listadecomandos.ListaComandosJPA;
import Presentacion.controlador.Context;

public class ListaEmpleadoCommand implements Command {

	@Override
	public Context execute(Object data) {
		List<Empleado> l;
		
		l = (List<Empleado>) ASFactory.getInstance().createASEmpleado().listaEmpleados();
		
		return new Context(ListaComandosJPA.MOSTRAR_LISTA_EMPLEADOS, l);
	}

}
