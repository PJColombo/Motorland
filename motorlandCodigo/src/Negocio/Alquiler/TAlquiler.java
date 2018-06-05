/**
 * 
 */
package Negocio.Alquiler;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import Presentacion.vistas.vistaCalendario.DateLabelFormatter;



public class TAlquiler {

	private int id;
	private int idCliente;
	private Calendar fechaIni;
	private Calendar fechaFin;
	private double costeTotal;
	private String pago;
	private HashMap<Integer,TLineaAlquiler> listaAlquilados;
	private boolean activo;

	public TAlquiler() {}
	
	public TAlquiler(int id, int idCliente, Calendar fechaIni, Calendar fechaFin, double importeTotal,
			String pago, boolean activo){
		this.id = id;
		this.idCliente = idCliente;
		this.fechaIni = fechaIni; 
		this.fechaFin = fechaFin;
		this.costeTotal = importeTotal;
		this.pago = pago;
		this.listaAlquilados = new HashMap<>();
		this.activo = activo; 		
	}
	public TAlquiler(int id, int idCliente, Calendar fechaIni, Calendar fechaFin, double importeTotal,
			String pago, HashMap<Integer, TLineaAlquiler> listaAlquilados, boolean activo){
		this.id = id;
		this.idCliente = idCliente;
		this.fechaIni = fechaIni; 
		this.fechaFin = fechaFin;
		this.costeTotal = importeTotal;
		this.pago = pago;
		this.listaAlquilados = listaAlquilados;
		this.activo = activo; 		
	}
	public int getId() {
		return this.id;
	}
	
	public void setId(int id){
		this.id = id;
	}
	
	public int getIdCliente(){
		return this.idCliente;
	}
	
	public void setIdCliente(int idCliente){
		this.idCliente = idCliente;
	}
	public Calendar getFechaIni() {
		return this.fechaIni;
	}
	
	public void setFechaIni(Calendar fechaIni) {
		this.fechaIni = fechaIni;
	}
	
	public Calendar getFechaFin() {
		return this.fechaFin;
	}
	
	public void setFechaFin(Calendar fechaFin) {
		this.fechaFin = fechaFin;
	}
	
	public double getCosteTotal(){
		return this.costeTotal;
	}
	
	public void setCosteTotal(double costeTotal){
		this.costeTotal = costeTotal;
	}
	
	public String getPago(){
		return this.pago;
	}
	
	public void setPago(String pago){
		this.pago = pago;
	}
	
	public HashMap<Integer, TLineaAlquiler> getlistaAlquilados(){
		return this.listaAlquilados;
	}
	
	public void setlistaAlquilados(HashMap<Integer, TLineaAlquiler> listaAlquilados){
		this.listaAlquilados =listaAlquilados;
	}
	
	public void addTolistaAlquilados(int idVehiculo, TLineaAlquiler t){
		//reemplaza si ya existe el vehiculo. 
		this.listaAlquilados.put(idVehiculo, t);
	}
	
	public void removeFromlistaAlquilados(int idVehiculo){
		this.listaAlquilados.remove(idVehiculo);
	}
	public boolean getActivo() {
		return this.activo;
	}
	
	public void setActivo(boolean a) {
		this.activo = a;
	}
	
	public String getFechaIniLegible() {
		DateLabelFormatter dlf = new DateLabelFormatter(); 
		String fecha = ""; 
		try {
			fecha = dlf.valueToString(fechaIni);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		return fecha;
	}
	
	public String getFechaFinLegible() {
		DateLabelFormatter dlf = new DateLabelFormatter(); 
		String fecha = ""; 
		try {
			fecha = dlf.valueToString(fechaFin);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		return fecha;
	}
	
	public ArrayList<TLineaAlquiler> getListaLineasAlquiler(){
		ArrayList<TLineaAlquiler> l = new ArrayList<>();
		int id; 
		for (Map.Entry<Integer, TLineaAlquiler> entry : listaAlquilados.entrySet()) {
			id = entry.getKey();
		    TLineaAlquiler t = entry.getValue();
		    t.setIdVehiculo(id);
		    l.add(t);
		}
		return l; 
	}
	
	public void ponOrdenLineasAlquiler(Operacion op) {
		 Iterator<Entry<Integer, TLineaAlquiler>> it = listaAlquilados.entrySet().iterator();
		    while (it.hasNext()) {
		        it.next().getValue().setOperacion(op);
		        //it.remove(); // evita la ConcurrentModificationException
		    }
	}
	public String toString(){
		DateLabelFormatter dlf = new DateLabelFormatter();
		StringBuilder sb = new StringBuilder(); 
		sb.append("ALQUILER " + this.getId() + "\n");
		sb.append("\n");
		sb.append("CLIENTE: " + this.getIdCliente() + "\n");
		try {
			sb.append("FECHA INICIAL: " + dlf.valueToString(this.getFechaIni()) + "\n");
			sb.append("FECHA FINAL: " + dlf.valueToString(this.getFechaFin()) + "\n");
		}
		catch (ParseException e) {
			e.printStackTrace();
		}
		sb.append("IMPORTE TOTAL: " + this.getCosteTotal() + "\n");
		sb.append("METODO DE PAGO: " + this.getPago() + "\n");
		sb.append("ESTADO: ");
		if (this.getActivo())
			sb.append("ACTIVO");
		else
			sb.append("INACTIVO");
		sb.append("\n");
		sb.append("VEHÍCULOS ALQUILADOS: \n");
		int num = 1;
		Iterator<Entry<Integer, TLineaAlquiler>> it = this.listaAlquilados.entrySet().iterator();
		while (it.hasNext()) 
		{
			Map.Entry<Integer, TLineaAlquiler> t = (Map.Entry<Integer, TLineaAlquiler>) it.next();
			sb.append("\t" + num + ")  " + ": Vehiculo: " + t.getKey() + "  " + t.getValue().toString() + "\n");
			num++;
		}
		return sb.toString();
	}
}