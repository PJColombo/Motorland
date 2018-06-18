
package Presentacion.comandos;


public abstract class CommandFactory {
	
	private static CommandFactory commandFactory;

	public static CommandFactory getInstance() {
		if (commandFactory == null)
			//commandFactory = new CommandFactoryImp();
			commandFactory = new CommandFactoryCargaDinamicaImp();
		return commandFactory;
	}

	public abstract Command getCommand(int event);
}