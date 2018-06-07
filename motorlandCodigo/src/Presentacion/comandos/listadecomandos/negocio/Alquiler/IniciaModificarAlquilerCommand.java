package Presentacion.comandos.listadecomandos.negocio.Alquiler;

import Negocio.Alquiler.TAlquiler;
import Negocio.FactoriaSA.ASFactory;
import Presentacion.comandos.Command;
import Presentacion.comandos.listadecomandos.ListaComandos;
import Presentacion.controlador.Context;

public class IniciaModificarAlquilerCommand implements Command {

	@Override
	public Context execute(Object data) {
		TAlquiler t = (TAlquiler) data;
		ModificacionResultado res;
		
		res = ASFactory.getInstance().createSAAlquiler().compruebaAlquiler(t);

		if(res.getRes() > 0)
			return new Context(ListaComandos.PREPARA_VISTA_MENU_MODIFICAR_ALQUILER_EMERGENTE, res.gettAlquiler());
		else
			return new Context(ListaComandos.MOSTRARMODIFICARALQUILER, res.getRes());
	}

}
