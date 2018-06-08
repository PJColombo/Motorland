package Integración.connectionPool;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedDeque;

public class ConnectionPoolFactoryImp extends ConnectionPoolFactory {

	private final int NUM_CONN = 1;  
	private Queue<Connection> pool;	
	
	public ConnectionPoolFactoryImp() {
		super();
		this.pool = new ConcurrentLinkedDeque<Connection>();
		
	}
	
	@Override
	protected void createConnections() throws SQLException, FileNotFoundException, IOException {
		Connection conn; 
		Properties p;
		p = cargaProperties();
		String host = p.getProperty("host");
		String port = p.getProperty("port");
		String db = p.getProperty("database");
		String user = p.getProperty("user");
		String passwd = p.getProperty("password");
		
		for(int i = 0; i < NUM_CONN; i++) {
			conn = DriverManager.getConnection("jdbc:mysql://" +
					host + ":" + port + "/" + db + "?autoReconnect=true&useSSL=true", user, passwd);
			this.pool.add(conn);
		}
		

	}



	@Override
	public Connection getConnection() throws SQLException, FileNotFoundException, IOException {
		Connection conn = pool.poll();
		
		if(conn == null) {
			createConnections();
			conn = pool.poll(); 
		}
		System.out.println(pool.size());
		return conn;
	}



	@Override
	public void closeConnections() throws SQLException {
		for (int i = 0; i < pool.size(); i++)
			pool.poll().close();
	}

	@Override
	public void putConnection(Connection conn) {
		
		pool.add(conn);
	} 
}
