package Negocio.empleado;

import Negocio.departamento.Departamento;
import Negocio.empleado.Empleado;
import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: EmpleadoTemporal
 *
 */
@Entity

public class EmpleadoTemporal extends Empleado implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	@Temporal(TemporalType.DATE)
	private Date fechaIni;
	@Temporal(TemporalType.DATE)
	private Date fechaFin; 
	
	public EmpleadoTemporal() {
		super();
	}

	public EmpleadoTemporal(Date fechaIni, Date fechaFin) {
		this.fechaIni = fechaIni;
		this.fechaFin = fechaFin; 
	}
	
	public EmpleadoTemporal(String dni, String nombre, String domicilio, String cuenta, Departamento departamento, boolean activo, Date fechaIni, Date fechaFin) {
		super(dni, nombre, domicilio, cuenta, departamento, activo);
		this.fechaIni = fechaIni;
		this.fechaFin = fechaFin;
	}
	
	public EmpleadoTemporal(int id, String dni, String nombre, String domicilio, String cuenta,
			Departamento departamento, boolean activo, Date fechaI, Date fechaF) {
		super(id, dni, nombre, domicilio, cuenta, departamento, activo);
		this.fechaIni = fechaI;
		this.fechaFin = fechaF;
	}

	public Date getFechaIni() {
		return fechaIni;
	}

	public void setFechaIni(Date fechaIni) {
		this.fechaIni = fechaIni;
	}

	public Date getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}
   
}