/**
 * 
 */
package Negocio.Vehiculo;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author Paulo Colombo
 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class TCoche extends TVehiculo {
	public TCoche(int id, String modelo, String matricula, String color,
			int numBaterias, double coste, boolean activo, int puertas, boolean gps) {
		super(id, modelo, matricula, color, numBaterias, coste, activo);
		this.puertas = puertas;
		this.gps = gps; 
	}

	private int puertas;
	private boolean gps;
	
	public void setPuertas(int p) {
		this.puertas = p;
	}

	public int getPuertas(){
		return this.puertas;
	}
	
    
     public boolean getGps(){
		return this.gps;
	}
	
    public void setnumGps(boolean gps){
            this.gps = gps;
    }
    public String toString(){
    	String s = "";
    	s += "COCHE " + "\n" +
    	"PUERTAS: " + puertas + "\n" +
    	"GPS: ";
    	s += gps ? "SI \n" : "NO \n";
    	s += super.toString();
		return s;
	}
}
    
     