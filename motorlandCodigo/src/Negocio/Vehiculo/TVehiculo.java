/**
 * 
 */
package Negocio.Vehiculo;


public class TVehiculo {
	private int id;
	private String modelo;
	private String matricula;
	private String color;
	private int numBaterias;
	private Boolean activo;
	private double coste;
	
	public TVehiculo() {}; 
	public TVehiculo(int id, String modelo, String matricula, String color, int numBaterias,double coste, boolean activo){
		this.id = id;
		this.modelo = modelo;
		this.matricula = matricula;
		this.color = color;
		this.numBaterias = numBaterias;
		this.coste= coste;
		this.activo = activo; 
	}
	public int getId(){
		return this.id;
	}
	
	public String getModelo(){
		return this.modelo;
	}
	
	public String getMatricula(){
		return this.matricula;
	}
	
	public String getColor(){
		return this.color;
	}
	
	public int getNumBaterias(){
		return this.numBaterias;
	}
	public double getCoste(){
		return this.coste;
	}
	
	public boolean getActivo(){
		return this.activo;
	}
	
	public void setModelo(String modelo){
		this.modelo = modelo;
	}
	
	public void setMatricula(String matricula){
		this.matricula = matricula;
	}
	
	public void setColor(String color){
		this.color = color;
	}
	
	public void setNumBaterias(int numBaterias){
		this.numBaterias = numBaterias;
	}
	
	public void setActivo(boolean activo){
		this.activo = activo;
	}
        public void setId(int id){
		this.id = id;
	}
    public void setCoste(double coste){
    		this.coste= coste;
    }
	@Override
	public String toString() {
		String s = ""; 
		s += "ID VEHÍCULO: " + id + "\n" +
			"MATRÍCULA: " + matricula + "\n" +
			"MODELO: " + modelo + "\n" +
			"COLOR: " + color + "\n" +
			"NÚM. BATERÍAS: " + numBaterias + "\n" +
			"COSTE: " + coste + "€ \n" +
			"ESTADO: ";
		s += (activo) ? "ACTIVO" : "INACTIVO";
		
		return s; 
	}
	
	@Override
	public boolean equals(Object o) {

		if(o == null)
			return false;
		
		if(o == this)
			return true;
		
		if(!(o instanceof TVehiculo))
			return false;
		
		TVehiculo v = (TVehiculo) o;
		
		if (this.id == v.getId())
			return true;
		else
			return false;
	}
    
    
}