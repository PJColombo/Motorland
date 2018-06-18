package Presentacion.comandos.listadecomandos.negocio.Cliente;

import java.util.List;

import Integración.query.VIPResultado;
import Negocio.Cliente.TCliente;
import Negocio.FactoriaSA.ASFactory;
import Presentacion.comandos.Command;
import Presentacion.comandos.listadecomandos.ListaComandos;
import Presentacion.controlador.Context;

public class ClienteVipCommand implements Command {

	@Override
	public Context execute(Object data) {
		// TODO Auto-generated method stub
		List<VIPResultado> clientes;
		try {
			clientes = ASFactory.getInstance().createSACliente().clienteVip();
		} catch (Exception e) {
			return new Context(ListaComandos.MOSTRARCLIENTEVIP, e);
		}
		return new Context (ListaComandos.MOSTRARCLIENTEVIP, clientes);
	}

}
