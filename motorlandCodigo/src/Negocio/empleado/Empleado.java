package Negocio.empleado;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Version;

import Negocio.departamento.Departamento;
import javax.persistence.NamedQuery;
import javax.persistence.NamedQueries;

@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "tipo_empleado")
@Entity
@NamedQueries({ 
	@NamedQuery(name = "Empleado.findById", query = "SELECT e FROM Empleado e WHERE e.idempleado = :id"),
		
	@NamedQuery(name = "Empleado.findByDni", query = "SELECT e FROM Empleado e WHERE e.dni = :dni"),
	
	@NamedQuery(name = "Empleado.findAll", query = "SELECT e FROM Empleado e")
})
public class Empleado {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	protected Integer idempleado;
	
	@Version
	protected Integer version;
	
	protected String nombre;
	protected String dni;
	protected String domicilio;
	protected String cuenta;
	protected boolean activo;
	
	@ManyToOne
	@JoinColumn(name="departamento")
	private Departamento departamento;
	
	public Empleado() {
		
	}
	
	public Empleado(String dni, String nombre, String domicilio, String cuenta, Departamento departamento, boolean activo) {
		this.dni = dni;
		this.nombre = nombre;
		this.domicilio = domicilio;
		this.cuenta = cuenta;
		this.departamento = departamento;
		this.activo = activo;
	}
	public Empleado(int id, String dni, String nombre, String domicilio, String cuenta, Departamento departamento,
			boolean activo) {
		this.idempleado = id;
		this.dni = dni;
		this.nombre = nombre;
		this.domicilio = domicilio;
		this.cuenta = cuenta;
		this.departamento = departamento;
		this.activo = activo;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getDomicilio() {
		return domicilio;
	}
	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}
	public String getCuenta() {
		return cuenta;
	}
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}
	public boolean isActivo() {
		return activo;
	}
	public void setActivo(boolean activo) {
		this.activo = activo;
	}
	public Integer getId() {
		return idempleado;
	}
	public Departamento getDepartamento() {
		return departamento;
	}
	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}
	
	
}