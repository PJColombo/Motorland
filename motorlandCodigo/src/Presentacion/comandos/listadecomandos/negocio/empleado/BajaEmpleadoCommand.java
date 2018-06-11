package Presentacion.comandos.listadecomandos.negocio.empleado;

import Negocio.FactoriaSA.ASFactoryImp;
import Presentacion.comandos.Command;
import Presentacion.comandos.listadecomandos.ListaComandosJPA;
import Presentacion.controlador.Context;

public class BajaEmpleadoCommand implements Command {

	@Override
	public Context execute(Object data) {
		int res;
		
		res = ASFactoryImp.getInstance().createASEmpleado().bajaEmpleado((int) data);

		return new Context(ListaComandosJPA.MOSTRAR_BAJA_EMPLEADO, res);
	}

}
