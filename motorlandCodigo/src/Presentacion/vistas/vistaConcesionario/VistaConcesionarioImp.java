package Presentacion.vistas.vistaConcesionario;

import java.util.List;

import javax.swing.JOptionPane;


import Negocio.concesionario.Concesionario;
import Presentacion.comandos.listadecomandos.ListaComandosJPA;
import Presentacion.controlador.Context;

public class VistaConcesionarioImp extends VistaConcesionario {

	private ConcesionarioGUI vConcesionario;
	
	public VistaConcesionarioImp() {
		vConcesionario = new ConcesionarioGUI();
	}
	
	@Override
	public void update(Context contexto) {
		String mensaje;
		int tipo; 
		if(contexto.getEvent() == ListaComandosJPA.VISTA_MENU_CONCESIONARIO)
			vConcesionario.setVisible(true);
		
		else if(contexto.getEvent() == ListaComandosJPA.CERRAR_VISTA_CONCESIONARIO)
			vConcesionario.setVisible(false);
		
		else if(contexto.getEvent() == ListaComandosJPA.MOSTRAR_ALTA_CONCESIONARIO) {
			switch((int) contexto.getEvent()) {
			case -1:
				mensaje = "El concesionario ya existe.";
				tipo = JOptionPane.ERROR_MESSAGE;
			break;
			case -2:
				mensaje = "Concesionario dado de baja se vuelve a dar de alta";
				tipo = JOptionPane.INFORMATION_MESSAGE;
			break;
			default:
				mensaje = "El concesionario se ha dado de alta con éxito! ";
				tipo = JOptionPane.INFORMATION_MESSAGE;
			break;
			}
			JOptionPane.showMessageDialog(vConcesionario, mensaje, "Alta concesionario", tipo);
		}
		else if(contexto.getEvent() == ListaComandosJPA.MOSTRAR_BAJA_CONCESIONARIO) {
			switch((int) contexto.getData()) {
			case -1:
				mensaje = "El concesionario no existe.";
				tipo = JOptionPane.ERROR_MESSAGE;
				break;
			case -2:
				mensaje = "El concesionario ya está dado de baja.";
				tipo = JOptionPane.ERROR_MESSAGE;
			break;
			default:
				mensaje = "El concesionario se ha dado de baja con éxito! ";
				tipo = JOptionPane.INFORMATION_MESSAGE;
			break;
			}
			JOptionPane.showMessageDialog(vConcesionario, mensaje, "Baja concesionario", tipo);
		}
		else if(contexto.getEvent() == ListaComandosJPA.MOSTRAR_MODIFICA_CONCESIONARIO) {
			switch((int) contexto.getData()) {
			case -1:
				mensaje = "El concesionario no existe.";
				tipo = JOptionPane.ERROR_MESSAGE;
			break;
			case -2:
				mensaje = "El concesionario se encuentra inactivo.";
				tipo = JOptionPane.ERROR_MESSAGE;
			break;
			case -3:
				mensaje = "Ya existe un concesionario con ese nombre. ";
				tipo = JOptionPane.ERROR_MESSAGE;
			break;
			case -4:
				mensaje = "Ya existe un concesionario con esa dirección";
				tipo = JOptionPane.ERROR_MESSAGE;
			break;
			default:
				mensaje = "El concesionario se ha modificado con éxito! ";
				tipo = JOptionPane.INFORMATION_MESSAGE;
			break;
			}
			JOptionPane.showMessageDialog(vConcesionario, mensaje, "Modifica concesionario", tipo);
		}
		else if(contexto.getEvent() == ListaComandosJPA.MOSTRAR_CONSULTA_CONCESIONARIO) {
			Concesionario res = (Concesionario) contexto.getData();
			
			if(res != null) {
				vConcesionario.muestra(res.toString());
			}
			else {
				JOptionPane.showMessageDialog(vConcesionario, "El concesionario no existe.", "Consulta concesionario",
						JOptionPane.ERROR_MESSAGE);
			}
		}
		else if(contexto.getEvent() == ListaComandosJPA.MOSTRAR_LISTA_CONCESIONARIOS) {
			@SuppressWarnings("unchecked")
			List<Concesionario> l = (List<Concesionario>) contexto.getData();
			
			if(l != null) {
				for (Concesionario c : l)
					vConcesionario.muestra(c.toString());
			}
			else {
				JOptionPane.showMessageDialog(vConcesionario, "No hay concesionarios.", "Lista concesionarios",
						JOptionPane.INFORMATION_MESSAGE);
			}
		}
		else if(contexto.getEvent() == ListaComandosJPA.MOSTRAR_AGREGA_CONCESIONARIODEPARTAMENTO_CONCESIONARIO) {
			switch((int) contexto.getData()) {
				case -1:
					mensaje = "El concesionario no existe.";
					tipo = JOptionPane.ERROR_MESSAGE;
				break;
				case -2:
					mensaje = "El concesionario se encuentra inactivo.";
					tipo = JOptionPane.ERROR_MESSAGE;
				break;
				case -3:
					mensaje = "El departamento no existe.";
					tipo = JOptionPane.ERROR_MESSAGE;
				break;
				case -4:
					mensaje = "El departamento se encuentra dado de baja.";
					tipo = JOptionPane.ERROR_MESSAGE;
				break;
				case -5:
					mensaje = "El departamento ya se encuentra asignado a este concesionario";
					tipo = JOptionPane.ERROR_MESSAGE;
				break;
				default:
					mensaje = "Se ha asignado el departamento a este concesionario con éxito! ";
					tipo = JOptionPane.INFORMATION_MESSAGE;
				break;
			}
			JOptionPane.showMessageDialog(vConcesionario, mensaje, "Añade departamento",
					tipo);
		}
		else if(contexto.getEvent() == ListaComandosJPA.MOSTRAR_ELIMINA_CONCESIONARIODEPARTAMENTO_CONCESIONARIO) {
			switch((int) contexto.getData()) {
			case -1:
				mensaje = "El concesionario no existe.";
				tipo = JOptionPane.ERROR_MESSAGE; 
			break;
			case -2:
				mensaje = "El concesionario se encuentra inactivo.";
				tipo = JOptionPane.ERROR_MESSAGE;
			break;
			case -3:
				mensaje = "El departamento no existe.";
				tipo = JOptionPane.ERROR_MESSAGE;
			break;
			case -4:
				mensaje = "El departamento se encuentra dado de baja.";
				tipo = JOptionPane.ERROR_MESSAGE;
			break;
			case -5:
				mensaje = "No se le ha asignado ese departamento al concesionario";
				tipo = JOptionPane.ERROR_MESSAGE;
			break;
			default:
				mensaje = "El departamento ya no se encuentra asignado al concesionario! ";
				tipo = JOptionPane.INFORMATION_MESSAGE;
			}
			JOptionPane.showMessageDialog(vConcesionario, mensaje, "Elimina departamento",
					tipo);
		}
		else if(contexto.getEvent() == ListaComandosJPA.MOSTRAR_CALCULA_PRESUPUESTO_CONCESIONARIO) {
			double res = (double) contexto.getData();
			if(res < 0) {
				mensaje = "";
				tipo = 0;
				if(res == -1) {
					mensaje = "El concesionario no existe.";
					tipo = JOptionPane.ERROR_MESSAGE;
				}
				else if(res == -2) {
					mensaje = "El concesionario se encuentra inactivo";
					tipo = JOptionPane.ERROR_MESSAGE;
				}
				JOptionPane.showMessageDialog(vConcesionario, mensaje, "Elimina departamento",
						tipo);
			}
			else 
				vConcesionario.muestra("PRESUPUESTO TOTAL DE ESTE CONCESIONARIO: " + res);
		}
	}

}
