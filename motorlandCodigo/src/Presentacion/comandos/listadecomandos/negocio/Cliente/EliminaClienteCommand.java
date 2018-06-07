package Presentacion.comandos.listadecomandos.negocio.Cliente;

import Negocio.FactoriaSA.ASFactory;
import Presentacion.comandos.Command;
import Presentacion.comandos.listadecomandos.ListaComandos;
import Presentacion.controlador.Context;

public class EliminaClienteCommand implements Command {

	@Override
	public Context execute(Object data) {
		int res; 
		res = ASFactory.getInstance().createSACliente().eliminaCliente((int) data);
		return new Context(ListaComandos.MOSTRAR_ELIMINA_CLIENTE, res);
	}

}
