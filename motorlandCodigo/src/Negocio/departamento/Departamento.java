package Negocio.departamento;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Version;

@Entity
public class Departamento {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idDepartamento;
	
	@Version
	private Integer version;
}
