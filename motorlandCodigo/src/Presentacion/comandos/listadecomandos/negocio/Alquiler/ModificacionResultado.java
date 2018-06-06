package Presentacion.comandos.listadecomandos.negocio.Alquiler;

import Negocio.Alquiler.TAlquiler;

public class ModificacionResultado {
	private int res;
	private TAlquiler tAlquiler;
	public int getRes() {
		return res;
	}
	
	public ModificacionResultado(int res, TAlquiler t) {
		this.res = res;
		this.tAlquiler = t; 
	}
	public void setRes(int res) {
		this.res = res;
	}
	public TAlquiler gettAlquiler() {
		return tAlquiler;
	}
	public void settAlquiler(TAlquiler tAlquiler) {
		this.tAlquiler = tAlquiler;
	} 
	
	
}
