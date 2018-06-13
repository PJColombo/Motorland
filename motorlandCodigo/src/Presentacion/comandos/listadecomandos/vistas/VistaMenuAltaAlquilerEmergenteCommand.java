package Presentacion.comandos.listadecomandos.vistas;

import java.util.ArrayList;

import Negocio.Alquiler.TAlquiler;
import Negocio.FactoriaSA.ASFactory;
import Negocio.Vehiculo.TVehiculo;
import Presentacion.comandos.Command;
import Presentacion.comandos.listadecomandos.ListaComandos;
import Presentacion.controlador.Context;

public class VistaMenuAltaAlquilerEmergenteCommand implements Command {

	@Override
	public Context execute(Object data) {
		ArrayList<TVehiculo> v = null;
		
		try {
			v = ASFactory.getInstance().createSAAlquiler().iniciarAlquiler((TAlquiler) data);
					
		} catch (Exception e) {
			// TODO Bloque catch generado automáticamente
			e.printStackTrace();
		}
		
		if(v != null)
			return new Context (ListaComandos.VISTA_MENU_ALTA_ALQUILER_EMERGENTE, v);
		else
			return new Context (ListaComandos.ERROR_ALTA_ALQUILER, v);
	}

}
