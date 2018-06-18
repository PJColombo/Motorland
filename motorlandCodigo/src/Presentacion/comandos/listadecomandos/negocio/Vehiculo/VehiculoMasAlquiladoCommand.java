package Presentacion.comandos.listadecomandos.negocio.Vehiculo;

import Integración.query.VIPResultado;
import Negocio.FactoriaSA.ASFactory;
import Presentacion.comandos.Command;
import Presentacion.comandos.listadecomandos.ListaComandos;
import Presentacion.controlador.Context;

public class VehiculoMasAlquiladoCommand implements Command {

	@Override
	public Context execute(Object data) {
		VIPResultado res;
		
		res = ASFactory.getInstance().createSAVehiculo().vehiculoMasAlquilado();
		
		return new Context(ListaComandos.MOSTRAR_VEHICULO_MAS_ALQUILADO, res);
	}

}
