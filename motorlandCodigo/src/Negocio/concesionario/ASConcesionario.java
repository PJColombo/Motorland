package Negocio.concesionario;

import java.util.Collection;

public interface ASConcesionario {
	
	public int altaConcesionario(Concesionario c);
	public int bajaConcesionario(int id);
	public int modificaConcesionario(Concesionario c);
	public Concesionario consultaConcesionario(int id); 
	public Collection<Concesionario> listaConcesionarios();
}
