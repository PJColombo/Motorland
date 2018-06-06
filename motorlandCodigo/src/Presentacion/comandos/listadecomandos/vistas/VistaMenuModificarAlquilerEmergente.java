package Presentacion.comandos.listadecomandos.vistas;

import java.util.ArrayList;

import Negocio.Alquiler.TAlquiler;
import Negocio.FactoriaSA.ASFactory;
import Negocio.Vehiculo.TVehiculo;
import Presentacion.comandos.Command;
import Presentacion.comandos.listadecomandos.ListaComandos;
import Presentacion.controlador.Context;

public class VistaMenuModificarAlquilerEmergente implements Command {

	@Override
	public Context execute(Object data) {
		TAlquiler t = (TAlquiler) data; 
		ArrayList<ArrayList<TVehiculo>> listas;
		
		listas = ASFactory.getInstance().createSAAlquiler().iniciaModificarAlquiler(t);
		
		
		return new Context(ListaComandos.VISTA_MENU_MODIFICAR_ALQUILER_EMERGENTE, listas);
	}

}
