package Presentacion.vistas.vistaConcesionario;

import Presentacion.controlador.Context;


public abstract class VistaConcesionario {
	
	private static VistaConcesionario instance; 
	
	public static VistaConcesionario getInstance() {
		// begin-user-code
		// TODO Apéndice de método generado automáticamente
			if (instance == null){
				instance = new VistaConcesionarioImp();
			}
			return instance;
	}
	
	public abstract void update(Context contexto);
}
