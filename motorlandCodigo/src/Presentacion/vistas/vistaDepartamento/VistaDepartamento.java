package Presentacion.vistas.vistaDepartamento;

import Presentacion.controlador.Context;

public abstract class VistaDepartamento {

	private static VistaDepartamento instance; 
	
	public static VistaDepartamento getInstance() {
		// begin-user-code
		// TODO Apéndice de método generado automáticamente
			if (instance == null){
				instance = new VistaDepartamentoImp();
			}
			return instance;
	}
	
	public abstract void update(Context contexto);
}
