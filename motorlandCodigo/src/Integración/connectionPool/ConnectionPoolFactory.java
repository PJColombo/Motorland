package Integración.connectionPool;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

public abstract class ConnectionPoolFactory {
	
	private final String RUTA_FICHERO = "config/db_info";
	
	private static ConnectionPoolFactory conPoolFactory;
	
	public static synchronized ConnectionPoolFactory getInstance() {
		
		if (conPoolFactory == null)
			conPoolFactory = new ConnectionPoolFactoryImp(); 
		
		return conPoolFactory; 
	}
	
	protected abstract void createConnections() throws SQLException, FileNotFoundException, IOException;
	
	public abstract Connection getConnection() throws SQLException, FileNotFoundException, IOException;
	
	public abstract void closeConnections() throws SQLException;
	
	public abstract void putConnection(Connection conn); 
	
	
	protected Properties cargaProperties() throws FileNotFoundException, IOException {
		Properties propDB = new Properties();
		FileInputStream fis = new FileInputStream(new File(RUTA_FICHERO));
		propDB.load(fis);
		return propDB;
	}

}
