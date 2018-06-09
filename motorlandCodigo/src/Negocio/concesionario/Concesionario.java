package Negocio.concesionario;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Version;


@Entity
public class Concesionario {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idconcesionario;
	
	@Version
	private Integer version;
	
	private String nombre;
	private String direccion;
	private boolean activo;
	
	/*@ManyToMany
	private Collection<Departamento> departamentos;*/
	
	@OneToMany(mappedBy="concesionario")
	private Collection<ConcesionarioDepartamento> concesionariosDepartamentos;
	
	public Concesionario() {
		concesionariosDepartamentos = new ArrayList<>();
		activo = true;
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
	
}