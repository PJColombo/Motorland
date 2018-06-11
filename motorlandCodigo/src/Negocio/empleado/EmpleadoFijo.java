package Negocio.empleado;

import Negocio.departamento.Departamento;
import Negocio.empleado.Empleado;
import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: EmpleadoFijo
 *
 */
@Entity

public class EmpleadoFijo extends Empleado implements Serializable {

	
	private static final long serialVersionUID = 1L;

	private int antiguedad;
	
	public EmpleadoFijo() {
		super();
	}
   
	
	public EmpleadoFijo(String dni, String nombre, String domicilio, String cuenta, Departamento departamento, boolean activo, int antiguedad) {
		super(dni, nombre, domicilio, cuenta, departamento, activo);
		this.antiguedad = antiguedad;
	}

	public EmpleadoFijo(int id, String dni, String nombre, String domicilio, String cuenta, Departamento departamento,
			boolean activo, int antiguedad) {
		super(id, dni, nombre, domicilio, cuenta, departamento, activo);
		this.antiguedad = antiguedad;
	}


	public int getAntiguedad() {
		return antiguedad;
	}

	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}
	
	
	
}