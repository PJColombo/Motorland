package Presentacion.vistas.vistaDepartamento;

import Presentacion.controlador.Context;

public abstract class VistaDepartamento {

	private static VistaDepartamento instance; 
	
	public static VistaDepartamento getInstance() {
		// begin-user-code
		// TODO Ap�ndice de m�todo generado autom�ticamente
			if (instance == null){
				instance = new VistaDepartamentoImp();
			}
			return instance;
	}
	
	public abstract void update(Context contexto);
}
