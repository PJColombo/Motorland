package Presentacion.comandos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import Integración.query.Query;

public class CommandFactoryCargaDinamicaImp extends CommandFactory {

	@Override
	public Command getCommand(int event) {
		FileInputStream fis;
		Properties propQueries = new Properties();
		String className; 
		ClassLoader loader = Thread.currentThread().getContextClassLoader();
		Command command = null;
		try {
			fis = new FileInputStream(new File("config/comandos.properties"));
			propQueries.load(fis);
			className = propQueries.getProperty("" + event);
			if(className != null) {
				Class<?> c = loader.loadClass(className);
				Class.forName(className);
				command = (Command) c.newInstance();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return command;
	}

}
