package Negocio.empleado;

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
   
	public EmpleadoFijo(int antiguedad) {
		this.antiguedad = antiguedad;
	}

	public int getAntiguedad() {
		return antiguedad;
	}

	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}
	
	
	
}