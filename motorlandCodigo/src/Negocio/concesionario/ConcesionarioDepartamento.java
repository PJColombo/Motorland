package Negocio.concesionario;

import java.io.Serializable;
import javax.persistence.*;

import Negocio.departamento.Departamento;

/**
 * Entity implementation class for Entity: ConcesionarioDepartamento
 *
 */
@Entity
public class ConcesionarioDepartamento implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private ConcesionarioDepartamentoID concesionarioDepartamentoID; 
	
	@ManyToOne
	@MapsId("concesionarioID")
	@JoinColumn(name="idconcesionario")
	private Concesionario concesionario;
	
	@ManyToOne
	@MapsId("departamentoID")
	@JoinColumn(name="iddepartamento")
	private Departamento departamento;
	
	private double presupuesto; 
	
	@Version
	private int version;
	
	public ConcesionarioDepartamento() {
		super();
	}
	
	public ConcesionarioDepartamento(Concesionario concesionario, Departamento departamento, double presupuesto) {
		this.concesionario = concesionario; 
		this.departamento = departamento;
	}

	public Concesionario getConcesionario() {
		return concesionario;
	}

	public void setConcesionario(Concesionario concesionario) {
		this.concesionario = concesionario;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public Double getPresupuesto() {
		return presupuesto;
	}

	public void setPresupuesto(Double presupuesto) {
		this.presupuesto = presupuesto;
	}

	@Override
	public String toString() {
		String s = "";
		
		s += "\t \t ID DEPARTAMENTO: " + concesionarioDepartamentoID.getDepartamentoID() + "\n" +
		"\t \t PRESUPUESTO: " + presupuesto + "\n";
		return s;
	}
	
	
	
}