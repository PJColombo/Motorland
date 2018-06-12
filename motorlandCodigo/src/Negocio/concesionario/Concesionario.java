package Negocio.concesionario;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Version;
import javax.persistence.NamedQuery;
import javax.persistence.NamedQueries;



@Entity
@NamedQueries({
		
	@NamedQuery(name = "Concesionario.findById", query = "SELECT c FROM Concesionario c WHERE c.idconcesionario = :id"),
		
	@NamedQuery(name = "Concesionario.findByNombre", query = "SELECT c FROM Concesionario c WHERE c.nombre = :nombre"),
	
	@NamedQuery(name = "Concesionario.findByDireccion", query = "SELECT c FROM Concesionario c WHERE c.direccion = :direccion"),
	
	@NamedQuery(name = "Concesionario.findAll", query = "SELECT c FROM Concesionario c") 
})
public class Concesionario {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idconcesionario;
	
	@Version
	private Integer version;
	
	private String nombre;
	private String direccion;
	private boolean activo;
	
	@OneToMany(mappedBy="concesionario")
	private Collection<ConcesionarioDepartamento> concesionariosDepartamentos;
	
	public Concesionario() {
		concesionariosDepartamentos = new ArrayList<>();
		activo = true;
	}
	
	public Concesionario(int id, String nombre, String direccion) {
		this.idconcesionario = id;
		this.nombre = nombre;
		this.direccion = direccion;
		this.concesionariosDepartamentos = new ArrayList<>();
		this.activo = true;
	}
	public Concesionario(String nombre, String direccion) {
		concesionariosDepartamentos = new ArrayList<>();
		this.nombre = nombre;
		this.direccion = direccion;
		this.activo = true;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}

	public Collection<ConcesionarioDepartamento> getConcesionariosDepartamentos() {
		return concesionariosDepartamentos;
	}

	public void setConcesionariosDepartamentos(Collection<ConcesionarioDepartamento> concesionariosDepartamentos) {
		this.concesionariosDepartamentos = concesionariosDepartamentos;
	}

	public Integer getIdConcesionario() {
		return idconcesionario;
	}
	
	public void agregaConcesionarioDepartamento(ConcesionarioDepartamento cd) {
		this.concesionariosDepartamentos.add(cd);
	}
	
	public void eliminaConcesionarioDepartamento(ConcesionarioDepartamento cd) {
		this.concesionariosDepartamentos.remove(cd);
	}

	@Override
	public String toString() {
		String s = "";
		
		s += "ID: " + idconcesionario + "\n" +
				"NOMBRE: " + nombre + "\n" +
				"DIRECCIÓN: " + direccion + "\n" +
				"ESTADO: ";
		s += (activo) ? "ACTIVO" : "INACTIVO";
		s += "\n";
		s += "DEPARTAMENTOS: " + "\n";
		if(concesionariosDepartamentos.isEmpty())
			s += "\t No hay departamentos actualmente." + "\n";
		else {
			for (ConcesionarioDepartamento cd : concesionariosDepartamentos)
				s += "\t" + cd.toString();
		}
		
		return s;
	}
	
	
}