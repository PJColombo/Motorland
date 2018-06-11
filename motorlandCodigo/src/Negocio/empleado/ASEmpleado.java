package Negocio.empleado;

import java.util.Collection;

public interface ASEmpleado {
	
	public int altaEmpleado(Empleado e);
	public int bajaEmpleado(int id);
	public int modificaEmpleado(Empleado e);
	public Empleado consultaEmpleado(int id);
	public Collection<Empleado> listaEmpleados(); 
}
