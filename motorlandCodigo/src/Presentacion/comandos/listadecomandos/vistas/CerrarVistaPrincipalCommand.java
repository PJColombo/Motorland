package Presentacion.comandos.listadecomandos.vistas;

import java.sql.SQLException;


import Integración.connectionPool.ConnectionPoolFactory;
import Presentacion.comandos.Command;
import Presentacion.comandos.listadecomandos.ListaComandos;
import Presentacion.controlador.Context;

public class CerrarVistaPrincipalCommand implements Command {

	@Override
	public Context execute(Object data){
		try {
			ConnectionPoolFactory.getInstance().closeConnections();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new Context(ListaComandos.CERRAR_VISTA_PRINCIPAL, null);
	}

}
