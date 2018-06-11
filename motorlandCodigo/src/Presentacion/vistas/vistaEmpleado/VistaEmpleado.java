package Presentacion.vistas.vistaEmpleado;

import Presentacion.controlador.Context;


public abstract class VistaEmpleado {
	private static VistaEmpleado instance; 
	
	public static VistaEmpleado getInstance() {
		// begin-user-code
		// TODO Ap�ndice de m�todo generado autom�ticamente
			if (instance == null){
				instance = new VistaEmpleadoImp();
			}
			return instance;
	}
	
	public abstract void update(Context contexto);
}
