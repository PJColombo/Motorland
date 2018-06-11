
package Negocio.FactoriaSA;

import Negocio.Alquiler.ASAlquiler;
import Negocio.Cliente.ASCliente;
import Negocio.Vehiculo.ASVehiculo;
import Negocio.concesionario.ASConcesionario;
import Negocio.departamento.ASDepartamento;
import Negocio.empleado.ASEmpleado;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author Paulo Colombo
 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public abstract class ASFactory {
     private static ASFactory factoriaSA;

	public static synchronized ASFactory getInstance()
	{
		if (factoriaSA == null){
                    factoriaSA = new ASFactoryImp();
                }
		return factoriaSA;
	}


	public abstract ASVehiculo createSAVehiculo();
	public abstract ASCliente createSACliente();
	public abstract ASAlquiler createSAAlquiler();
	
	//JPA
	
	public abstract ASDepartamento createASDepartamento();
	public abstract ASEmpleado createASEmpleado();
	public abstract ASConcesionario createASConcesionario();
}