package Presentacion.vistas.vistaEmpleado;

import java.util.List;

import javax.swing.JOptionPane;

import Negocio.FactoriaSA.ASFactory;
import Negocio.empleado.Empleado;
import Presentacion.comandos.listadecomandos.ListaComandosJPA;
import Presentacion.controlador.Context;

public class VistaEmpleadoImp extends VistaEmpleado {

	public VistaEmpleadoImp() {
		vEmpleado = new EmpleadoGUI();
	}
	
	private EmpleadoGUI vEmpleado;
	@Override
	public void update(Context contexto) {
		String mensaje;
		int tipo;
		
		if(contexto.getEvent() == ListaComandosJPA.VISTA_MENU_EMPLEADO) {
			vEmpleado.setVisible(true);
		}
		else if(contexto.getEvent() == ListaComandosJPA.CERRAR_VISTA_EMPLEADO) {
			vEmpleado.setVisible(false);
		}
		else if(contexto.getEvent() == ListaComandosJPA.MOSTRAR_ALTA_EMPLEADO) {
			switch((int) contexto.getData()) {
				case -1:
					mensaje = "El departamento del empleado no existe.";
					tipo = JOptionPane.ERROR_MESSAGE;
				break;
				case -2:
					mensaje = "El departamento del empleado se encuentra inactivo";
					tipo = JOptionPane.ERROR_MESSAGE;
				break;
				case -3:
					mensaje = "Ya existe un empleado con ese DNI.";
					tipo = JOptionPane.ERROR_MESSAGE;
				break;
				case -4:
					mensaje = "Empleado inactivo se ha vuelto a activar.";
					tipo = JOptionPane.INFORMATION_MESSAGE;
				break;
				default:
					mensaje = "Empleado dado de alta con éxito! ";
					tipo = JOptionPane.INFORMATION_MESSAGE;
				break;
			}
			JOptionPane.showMessageDialog(vEmpleado, mensaje, "Alta empleado",
					tipo);
		}
		else if(contexto.getEvent() == ListaComandosJPA.MOSTRAR_BAJA_EMPLEADO) {
			switch((int) contexto.getData()) {
				case -1:
					mensaje = "El empleado no existe.";
					tipo = JOptionPane.ERROR_MESSAGE;
				break;
				case -2:
					mensaje = "El empleado ya está dado de baja.";
					tipo = JOptionPane.ERROR_MESSAGE;
				break;
				default:
					mensaje = "Empleado dado de baja con éxito! ";
					tipo = JOptionPane.INFORMATION_MESSAGE;
				break;
			}
			JOptionPane.showMessageDialog(vEmpleado, mensaje, "Baja empleado",
					tipo);
		}
		else if(contexto.getEvent() == ListaComandosJPA.MOSTRAR_MODIFICA_EMPLEADO) {
			switch((int) contexto.getData()) {
				case -1:
					mensaje = "El empleado no existe.";
					tipo = JOptionPane.ERROR_MESSAGE;
				break;
				case -2:
					mensaje = "El empleado se encuentra inactivo.";
					tipo = JOptionPane.ERROR_MESSAGE;
				break;
				case -3:
					mensaje = "El nuevo departamento no existe.";
					tipo = JOptionPane.ERROR_MESSAGE;
				break;
				case -4:
					mensaje = "El nuevo departamento se encuentra inactivo";
					tipo = JOptionPane.ERROR_MESSAGE;
				break;
				case -5:
					mensaje = "La nueva fecha inicial es mayor que la fecha final del empleado";
					tipo = JOptionPane.ERROR_MESSAGE;
				break;
				case -6:
					mensaje = "La nueva fecha final es menor que la fecha inicial del empleado";
					tipo = JOptionPane.ERROR_MESSAGE;
				break;
				case -7:
					mensaje = "El tipo de empleado que se quiere modificar es diferente al guardado en la base de datos.";
					tipo = JOptionPane.ERROR_MESSAGE;
				break;
				case -8:
					mensaje = "Ya existe un empleado con ese DNI.";
					tipo = JOptionPane.ERROR_MESSAGE;
				default:
					mensaje = "Empleado modificado con éxito! ";
					tipo = JOptionPane.INFORMATION_MESSAGE;
				break;
			}
			JOptionPane.showMessageDialog(vEmpleado, mensaje, "Modifica empleado",
					tipo);
		}
		else if(contexto.getEvent() == ListaComandosJPA.MOSTRAR_CONSULTA_EMPLEADO) {
			Empleado e = (Empleado) contexto.getData();
			
			if(e != null) {
				vEmpleado.muestra(e.toString());
			}
			else
				JOptionPane.showMessageDialog(vEmpleado, "El empleado no existe.", "Consulta empleado",
						JOptionPane.ERROR_MESSAGE);
		}
		else if(contexto.getEvent() == ListaComandosJPA.MOSTRAR_LISTA_EMPLEADOS) {
			List<Empleado> l;
			
			l = (List<Empleado>) ASFactory.getInstance().createASEmpleado().listaEmpleados();
			
			if(l == null) {
				JOptionPane.showMessageDialog(vEmpleado, "No hay empleados para mostrar.", "Muestra empleado",
						JOptionPane.INFORMATION_MESSAGE);
			}
			else {
				for (Empleado empleado : l)
					vEmpleado.muestra(empleado.toString());
			}
		}
	}

}
