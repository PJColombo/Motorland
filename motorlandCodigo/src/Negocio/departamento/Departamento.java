package Negocio.departamento;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Version;

import Negocio.concesionario.ConcesionarioDepartamento;
import Negocio.empleado.Empleado;
import javax.persistence.Table;

@Entity
@Table(schema = "motorlanddb")
@NamedQueries({
		
	@NamedQuery(name = "Departamento.findByid", query = "SELECT d FROM Departamento d WHERE d.iddepartamento = :id"),
		
	@NamedQuery(name = "Departamento.findByNombre", query = "SELECT d FROM Departamento d WHERE d.nombre = :nombre"),
	
	@NamedQuery(name = "Departamento.findAll", query = "SELECT d FROM Departamento d") 
})
public class Departamento {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer iddepartamento;
	
	@Version
	private Integer version;
	
	private String nombre; 
	private boolean activo;
	
	@OneToMany(mappedBy="departamento")
	private Collection<Empleado> empleados;
	
	/*Como el mappedBy se encuentra aqui. Departamento es el poseedor de la relacion
	 * Si se elimina un concesionario de un departamento, estos se desvinculan. 
	 */
	/*@ManyToMany(mappedBy="departamentos")
	private Collection<Concesionario> concesionarios; */
	
	@OneToMany(mappedBy="departamento")
	private Collection<ConcesionarioDepartamento> concesionariosDepartamentos;
	
	public Departamento() {
		empleados = new ArrayList<>();
		concesionariosDepartamentos = new ArrayList<>();
		activo = true; 
	}
	
	public Departamento(int id, String nombre) {
		empleados = new ArrayList<>();
		concesionariosDepartamentos = new ArrayList<>();
		this.iddepartamento = id;
		this.nombre = nombre;
		this.activo = true;
	}
	public Departamento(String nombre) {
		empleados = new ArrayList<>();
		concesionariosDepartamentos = new ArrayList<>();
		this.nombre = nombre;
		this.activo = true;
	}
	
	
	public Integer getId() {
		return iddepartamento;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public boolean isActivo() {
		return activo;
	}
	public void setActivo(boolean activo) {
		this.activo = activo;
	}
	
	public Collection<Empleado> getEmpleados() {
		return empleados;
	}

	public void agregaEmpleado(Empleado e) {
		this.empleados.add(e);
	}
	
	public void eliminaEmpleado(Empleado e) {
		this.empleados.remove(e);
	}
	
	public Collection<ConcesionarioDepartamento> getConcesionariosDepartamentos() {
		return concesionariosDepartamentos;
	}

	public void agregaConcesionarioDepartamento(ConcesionarioDepartamento cd) {
		this.concesionariosDepartamentos.add(cd);
	}
	
	public void eliminaConcesionarioDepartamento(ConcesionarioDepartamento cd) {
		this.concesionariosDepartamentos.remove(cd);
	}

	@Override
	public String toString() {
		String s = "ID: " + iddepartamento + "\n"
				+ "NOMBRE: " + nombre + "\n"
				+ "ESTADO: ";
		if(activo)
			s += "ACTIVO " + "\n";
		else
			s += "INACTIVO " + "\n";
		s+= "EMPLEADOS: " + "\n";
		if(empleados.isEmpty())
			s += "No hay empleados. " + "\n";
		else {
			for (Empleado e : empleados) {
				s += "\t -ID EMPLEADO : " + e.getId() + "\n"
				+ "\t NOMBRE: " + e.getNombre() + "\n"
				+ "\t DNI: " + e.getDni();
			}
		}
		if(concesionariosDepartamentos.isEmpty())
			s += "No hay concesionarios. " + "\n";
		else {
			for (ConcesionarioDepartamento cd : concesionariosDepartamentos) {
				s += "\t -ID Concesionario: " + cd.getConcesionario() + "\n"
						+ "\t PRESUPUESTO: " + cd.getPresupuesto() + "\n";
			}
		}
		
		s += "\n";
		return s;
	}
	
	
}