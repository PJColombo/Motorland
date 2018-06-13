/**
 * 
 */
package Presentacion.vistas.vistaAlquiler;

import java.util.ArrayList;

import javax.swing.JOptionPane;


import Negocio.Alquiler.TAlquiler;
import Presentacion.comandos.listadecomandos.ListaComandos;
import Presentacion.controlador.Context;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author Paulo Colombo
 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class VistaMenuAlquilerImp extends VistaMenuAlquiler {
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private AlquilerGUI vAlquiler;
	
	public VistaMenuAlquilerImp(){
		vAlquiler= new AlquilerGUI();
	}

	@Override
	public void update(Context contexto) {
		if(contexto.getEvent() == ListaComandos.VISTAMENUALQUILER){
			vAlquiler.setVisible(true);
		}
		else if(contexto.getEvent() == ListaComandos.CERRAR_ALTA_ALQUILER_EMERGENTE){
			
			switch((int)contexto.getData()){
				case -1:
					JOptionPane.showMessageDialog(vAlquiler, "No se ha podido dar de alta el alquiler",
							"Error alta alquiler", JOptionPane.ERROR_MESSAGE);
					break;
				default:
					JOptionPane.showMessageDialog(vAlquiler, "El alquiler se ha dado de alta con éxito!.",
							"Alta alquiler", JOptionPane.INFORMATION_MESSAGE);
					break;
			}
			vAlquiler.limpiaCampos();
		}
		else if(contexto.getEvent() == ListaComandos.ERROR_ALTA_ALQUILER) {
			JOptionPane.showMessageDialog(vAlquiler, "El ID del cliente no existe.",
					"Alta alquiler", JOptionPane.ERROR_MESSAGE);
		}
		else if(contexto.getEvent() == ListaComandos.MOSTRARBAJAALQUILER){
			String titulo = "Error baja alquiler";
			switch((int) contexto.getData()) {
				case -1:
					JOptionPane.showMessageDialog(vAlquiler, "El alquiler no existe.", 
							titulo, JOptionPane.ERROR_MESSAGE);
					break;
				case -2:
					JOptionPane.showMessageDialog(vAlquiler, "Error al dar de alta alquiler.", 
							titulo, JOptionPane.ERROR_MESSAGE);
					break;
				case -3:
					JOptionPane.showMessageDialog(vAlquiler, "El alquiler ya esta dado de baja", 
							titulo, JOptionPane.ERROR_MESSAGE);
					break;
				default:
					JOptionPane.showMessageDialog(vAlquiler, "Alquiler dado de baja con éxito.", "Baja alquiler", JOptionPane.INFORMATION_MESSAGE);
					break;
			}
		}
		else if(contexto.getEvent() == ListaComandos.MOSTRARBUSCARALQUILER){
			TAlquiler t = (TAlquiler) contexto.getData();
			if (t != null) {
				vAlquiler.muestraAlquileres(t);
			}
			else
				JOptionPane.showMessageDialog(vAlquiler, "El alquiler no existe.", "Consulta alquiler", JOptionPane.ERROR_MESSAGE);
							
		}
		else if(contexto.getEvent() == ListaComandos.MOSTRARMODIFICARALQUILER){
			switch((int) contexto.getData()) {
			
				case -1:
					JOptionPane.showMessageDialog(vAlquiler, "Hubo un problema al intentar actualizar el alquiler.", "Modificar alquiler",
							JOptionPane.ERROR_MESSAGE);
					vAlquiler.setExitoInicioModificar(false);
					break;
				case -2:
					JOptionPane.showMessageDialog(vAlquiler, "El id del cliente no existe.", "Modificar alquiler",
							JOptionPane.ERROR_MESSAGE);
					vAlquiler.setExitoInicioModificar(false);
					break;
				case -3:
					JOptionPane.showMessageDialog(vAlquiler, "La nueva fecha del alquiler solapa con otros alquileres existentes.", "Modificar alquiler",
							JOptionPane.ERROR_MESSAGE);
					vAlquiler.setExitoInicioModificar(false);
					break;
				default:
					JOptionPane.showMessageDialog(vAlquiler, "Alquiler actualizado con éxito.", "Modificar alquiler",
							JOptionPane.INFORMATION_MESSAGE);
					vAlquiler.setExitoInicioModificar(false);
					vAlquiler.limpiaCampos();
					vAlquiler.setVisible(true);
					break;
			}
		
		}
		else if(contexto.getEvent() == ListaComandos.MOSTRARLISTAALQUILER){
			@SuppressWarnings("unchecked")
			ArrayList<TAlquiler> lista = (ArrayList<TAlquiler>) contexto.getData();
			if(lista == null)
				JOptionPane.showMessageDialog(vAlquiler, "No hay alquileres para listar.", "Lista alquileres", JOptionPane.INFORMATION_MESSAGE);
			else {
				TAlquiler[] listaConFormato = new TAlquiler[lista.size()];
				lista.toArray(listaConFormato);
				vAlquiler.muestraAlquileres(listaConFormato);
			}

				
		
		}
		else if(contexto.getEvent() == ListaComandos.CERRAR_VISTA_ALQUILER_EMERGENTE) {
			vAlquiler.limpiaCampos();
			vAlquiler.setVisible(true);
		}
		else if(contexto.getEvent() == ListaComandos.CERRAR_VISTA_ALQUILER) {
			vAlquiler.setVisible(false);
		}
		else if(contexto.getEvent() == ListaComandos.PREPARA_VISTA_MENU_MODIFICAR_ALQUILER_EMERGENTE) {
			vAlquiler.setExitoInicioModificar(true);
		}
		else if(contexto.getEvent() == ListaComandos.VISTA_MENU_MODIFICAR_ALQUILER_EMERGENTE) {
			vAlquiler.setVisible(false);
		}
	}
}