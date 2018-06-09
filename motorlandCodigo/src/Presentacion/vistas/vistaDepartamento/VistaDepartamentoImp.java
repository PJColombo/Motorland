package Presentacion.vistas.vistaDepartamento;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import Negocio.departamento.Departamento;
import Presentacion.comandos.listadecomandos.ListaComandosJPA;
import Presentacion.controlador.Context;

public class VistaDepartamentoImp extends VistaDepartamento {

	private DepartamentoGUI vDepartamento; 
	
	public VistaDepartamentoImp() {
		vDepartamento = new DepartamentoGUI();
	}
	@Override
	public void update(Context contexto) {
		String mensaje;
		int tipo; 
		if(contexto.getEvent() == ListaComandosJPA.VISTA_MENU_DEPARTAMENTO) {
			vDepartamento.setVisible(true);
		}
		else if(contexto.getEvent() == ListaComandosJPA.MOSTRAR_ALTA_DEPARTAMENTO) {
			switch((int) contexto.getData()) {
				case -1:
					JOptionPane.showMessageDialog(vDepartamento, "Ya existe un departamento con ese nombre", "Alta departamento",
							JOptionPane.ERROR_MESSAGE);
				break;
				case -2:
					JOptionPane.showMessageDialog(vDepartamento, "Departamento existente inactivo. Se ha activado nuevamente", "Alta departamento",
							JOptionPane.INFORMATION_MESSAGE);
				default:
					JOptionPane.showMessageDialog(vDepartamento, "Departamento creado con éxito! ", "Alta departamento",
							JOptionPane.INFORMATION_MESSAGE);
					break;
			}
		}
		else if(contexto.getEvent() == ListaComandosJPA.MOSTRAR_BAJA_DEPARTAMENTO) { 
			switch((int) contexto.getData()) {
				case -1:
					mensaje = "El departamento que se intenta dar de baja no existe.";
					tipo = JOptionPane.ERROR_MESSAGE;

				break;
				case -2:
					mensaje = "El departamento ya está dado de baja.";
					tipo = JOptionPane.ERROR_MESSAGE;
				break;
				default:
					mensaje = "El departamento se ha dado de baja con éxito!";
					tipo = JOptionPane.INFORMATION_MESSAGE;
				break;
			}
			
			JOptionPane.showMessageDialog(vDepartamento, mensaje,
					"Baja departamento", tipo);
		}
		else if(contexto.getEvent() == ListaComandosJPA.MOSTRAR_MODIFICA_DEPARTAMENTO) {
			switch((int) contexto.getData()) {
				case -1:
					mensaje = "El departamento que se quiere modificar no existe.";
					tipo = JOptionPane.ERROR_MESSAGE;
				break;
				case -2:
					mensaje = "El departamento se encuentra inactivo. No se puede modificar";
					tipo = JOptionPane.ERROR_MESSAGE;
				break;
				case -3:
					mensaje = "Ya existe un departamento con ese nombre. No se puede modificar";
					tipo = JOptionPane.ERROR_MESSAGE;
				break;
				default:
					mensaje = "El departamento se ha modificado con éxito! ";
					tipo = JOptionPane.INFORMATION_MESSAGE;
				break;
			}
			JOptionPane.showMessageDialog(vDepartamento, mensaje,
					"Modifica departamento", tipo);
		}
		else if(contexto.getEvent() == ListaComandosJPA.MOSTRAR_CONSULTA_DEPARTAMENTO) {
			Departamento d = (Departamento) contexto.getData();
			
			if(d != null) {
				vDepartamento.muestra(d.toString());
			}
			else {
				mensaje = "El departamento no existe.";
				tipo = JOptionPane.ERROR_MESSAGE;
				JOptionPane.showMessageDialog(vDepartamento, mensaje,
						"Modifica departamento", tipo);
			}
			
		}
		else if(contexto.getEvent() == ListaComandosJPA.MOSTRAR_LISTA_DEPARTAMENTOS) {
			List<Departamento> l = (List<Departamento>) contexto.getData();
			
			if(l != null) {
				for (Departamento d : l)
					vDepartamento.muestra(d.toString());
			}
			else {
				mensaje = "No hay departamentos para mostrar.";
				tipo = JOptionPane.INFORMATION_MESSAGE;
				JOptionPane.showMessageDialog(vDepartamento, mensaje,
						"Lista departaments", tipo);
			}
			
		}
		else if(contexto.getEvent() == ListaComandosJPA.CERRAR_VISTA_DEPARTAMENTO) {
			vDepartamento.setVisible(false);
		}
	}

}
