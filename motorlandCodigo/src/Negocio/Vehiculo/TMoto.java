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
public class TMoto extends TVehiculo {
	private boolean baul;
	
	public TMoto(int id, String modelo, String matricula, String color,
			int numBaterias, boolean activo,double importe, boolean baul) {
		super(id, modelo, matricula, color, numBaterias,importe, activo);
		this.baul = baul; 
	}
	

	 public boolean getBaul(){
		return this.baul;
	}
		
	 public void setnumGps(boolean baul){
	    this.baul = baul;
	 }
	 public String toString(){
		String s = "";
		s += "MOTO " + "\n" +
		"BAUL: ";
		s += baul ? "SI \n" : "NO \n";
		s += super.toString();
		return s;
	}
}