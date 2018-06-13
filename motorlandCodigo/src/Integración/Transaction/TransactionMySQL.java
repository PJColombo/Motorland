/**
 * 
 */
package Integración.Transaction;

import java.sql.Connection;
import java.sql.SQLException;

import Integración.connectionPool.ConnectionPoolFactory;

public class TransactionMySQL implements Transaction {
	private Connection connection;
	
	@Override
	public void start() throws Exception {
		try {
			connection = (Connection) ConnectionPoolFactory.getInstance().getConnection(); 
			this.connection.setAutoCommit(false);
		} catch (SQLException e) {
			throw e;
			//throw new Exception("Error establecer auto commit a falso");
		}
	}

	@Override
	public void commit() throws Exception {
		try {
			this.connection.commit();
			ConnectionPoolFactory.getInstance().putConnection(connection);
		} catch (SQLException e) {
			throw new Exception("Error al realizar commit.");
		}
	}

	@Override
	public void rollback() throws Exception {
		try {
			this.connection.rollback();
			ConnectionPoolFactory.getInstance().putConnection(connection);
		} catch (SQLException e) {
			throw new Exception("Error al realizar rollback.");
		}
	}

	@Override
	public Object getResource() {
		return this.connection;
	}
}