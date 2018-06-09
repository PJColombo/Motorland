package Negocio.concesionario;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: ConcesionarioDepartamentoID
 *
 */
@Embeddable
public class ConcesionarioDepartamentoID implements Serializable {

	
	private static final long serialVersionUID = 1L;
	private int concesionarioID;
	private int departamentoID;
	
	public ConcesionarioDepartamentoID() {
		super();
	}
   
	public ConcesionarioDepartamentoID(int concesionarioID, int departamentoID) {
		this.concesionarioID = concesionarioID;
		this.departamentoID = departamentoID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + concesionarioID;
		result = prime * result + departamentoID;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ConcesionarioDepartamentoID other = (ConcesionarioDepartamentoID) obj;
		if (concesionarioID != other.concesionarioID)
			return false;
		if (departamentoID != other.departamentoID)
			return false;
		return true;
	}

	
	
	
}