package Negocio.departamento;

import java.util.Collection;

public interface ASDepartamento {
	public int altaDepartamento(Departamento d);
	public int bajaDepartamento(Integer id);
	public int modificaDepartamento(Departamento d);
	public Departamento consultaDepartamento(Integer id);
	public Collection<Departamento> listaDepartamento();
}
