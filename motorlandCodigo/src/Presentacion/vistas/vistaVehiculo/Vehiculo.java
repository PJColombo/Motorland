package Presentacion.vistas.vistaVehiculo;

import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import  javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import  javax.swing.JFrame;
import  javax.swing.JLabel;
import  javax.swing.JOptionPane;
import  javax.swing.JPanel;
import  javax.swing.JTextArea;
import  javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.WindowConstants;
import javax.swing.border.BevelBorder;

import Negocio.Cliente.TCliente;
import Negocio.Vehiculo.TCoche;
import Negocio.Vehiculo.TMoto;
import Negocio.Vehiculo.TVehiculo;
import Presentacion.comandos.listadecomandos.ListaComandos;
import Presentacion.controlador.Controller;

/**
 *
 * @author usuario_local
 */

public class Vehiculo extends JFrame {

    /**
     * Creates new form Vehiculo
     */
    public Vehiculo() {
    	//this.setIconImage(new ImageIcon(getClass().getResource("/Imagenes/MotorLand.png")).getImage());
    	this.setTitle("Men� veh�culos");
        initComponents();
        jTextAreaList.setEnabled(false);
        jCheckBoxActivoBaul.setEnabled(false);
        this.jCheckBoxCoche.setSelected(true);
        this.jFormattedTextFieldAutonomia.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new JPanel();
        jLabel1 = new JLabel();
        jLabel2 = new JLabel();
        jLabel3 = new JLabel();
        jTextFieldIdVehiculo = new JTextField();
        jTextFieldMatricula = new JTextField();
        jTextFieldModelo = new  JTextField();
        jPanel2 = new  JPanel();
        jLabel4 = new  JLabel();
        jFormattedTextFieldNumBaterias = new  JTextField();
        jLabel5 = new  JLabel();
        jFormattedTextFieldColor = new  JTextField();
        jLabel6 = new  JLabel();
        jFormattedTextFieldAutonomia = new  JTextField();
        jPanel3 = new  JPanel();
        jCheckBoxGPS = new  JCheckBox();
        jLabel7 = new  JLabel();
        jTextFieldPuertas = new  JTextField();
        jTextAreaList = new  JTextArea();
        jButtonSalir = new  JButton();
        jPanel6 = new  JPanel();
        jButtonAnadir = new  JButton();
        jButtonBorrar = new  JButton();
        jButtonAutonomia = new  JButton();
        jButtonConsultar = new  JButton();
        jButtonModificar = new  JButton();
        jButtonListarVehiculo = new  JButton();
        jPanel4 = new  JPanel();
        jCheckBoxActivoBaul = new  JCheckBox();
        jPanel5 = new  JPanel();
        jCheckBoxActivo = new  JCheckBox();
        jCheckBoxDeshabilitado = new  JCheckBox();
        jPanel7 = new  JPanel();
        jCheckBoxMoto = new  JCheckBox();
        jCheckBoxCoche = new  JCheckBox();
        jLabel8 = new  JLabel();
        jTextFieldCoste = new  JTextField();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(BorderFactory.createTitledBorder(" ID Vehiculo"));

        jLabel1.setText("ID Vehiculo");

        jLabel2.setText("Matricula");

        jLabel3.setText("Modelo");

        GroupLayout jPanel1Layout = new  GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup( GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup( GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldIdVehiculo,  GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup( GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup( GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldMatricula)
                            .addComponent(jTextFieldModelo))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup( GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup( GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldIdVehiculo,  GroupLayout.PREFERRED_SIZE,  GroupLayout.DEFAULT_SIZE,  GroupLayout.PREFERRED_SIZE))
                .addPreferredGap( LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup( GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldMatricula,  GroupLayout.PREFERRED_SIZE,  GroupLayout.DEFAULT_SIZE,  GroupLayout.PREFERRED_SIZE))
                .addPreferredGap( LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup( GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldModelo,  GroupLayout.PREFERRED_SIZE,  GroupLayout.DEFAULT_SIZE,  GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jPanel2.setBorder( BorderFactory.createTitledBorder("Caracteristicas"));

        jLabel4.setText("Num. Baterias");

        jLabel5.setText("Color");

        jLabel6.setText("Km. Autonomia");

         GroupLayout jPanel2Layout = new  GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup( GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup( GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup( GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap( LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup( GroupLayout.Alignment.LEADING)
                            .addComponent(jFormattedTextFieldNumBaterias)
                            .addComponent(jFormattedTextFieldColor)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap( LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFormattedTextFieldAutonomia,  GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup( GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup( GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jFormattedTextFieldNumBaterias,  GroupLayout.PREFERRED_SIZE,  GroupLayout.DEFAULT_SIZE,  GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup( GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jFormattedTextFieldColor,  GroupLayout.PREFERRED_SIZE,  GroupLayout.DEFAULT_SIZE,  GroupLayout.PREFERRED_SIZE))
                .addPreferredGap( LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup( GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jFormattedTextFieldAutonomia,  GroupLayout.PREFERRED_SIZE,  GroupLayout.DEFAULT_SIZE,  GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel3.setBorder( BorderFactory.createTitledBorder("Coche"));

        jCheckBoxGPS.setText("GPS");
        jCheckBoxGPS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxGPSActionPerformed(evt);
            }
        });

        jLabel7.setText("Puertas");

         GroupLayout jPanel3Layout = new  GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup( GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup( GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap( LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldPuertas,  GroupLayout.PREFERRED_SIZE, 38,  GroupLayout.PREFERRED_SIZE))
                    .addComponent(jCheckBoxGPS))
                .addContainerGap( GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup( GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCheckBoxGPS)
                .addPreferredGap( LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup( GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextFieldPuertas,  GroupLayout.PREFERRED_SIZE,  GroupLayout.DEFAULT_SIZE,  GroupLayout.PREFERRED_SIZE))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        jButtonSalir.setText("Volver");
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });

        jPanel6.setBorder( BorderFactory.createBevelBorder(BevelBorder.RAISED));

        jButtonAnadir.setText("Anadir Vehiculo");
        jButtonAnadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAnadirActionPerformed(evt);
            }
        });

        jButtonBorrar.setText("Borrar Vehiculo");
        jButtonBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBorrarActionPerformed(evt);
            }
        });

        jButtonAutonomia.setText("Comprobar Autonomia");
        jButtonAutonomia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAutonomiaActionPerformed(evt);
            }
        });

        jButtonConsultar.setText("Consultar Vehiculo");
        jButtonConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsultarActionPerformed(evt);
            }
        });

        jButtonModificar.setText("Editar Vehiculo");
        jButtonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModificarActionPerformed(evt);
            }
        });

        jButtonListarVehiculo.setText("Listar Vehiculo");
        jButtonListarVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListarVehiculoActionPerformed(evt);
            }
        });

         GroupLayout jPanel6Layout = new  GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup( GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup( GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonAnadir,  GroupLayout.DEFAULT_SIZE,  GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonBorrar,  GroupLayout.DEFAULT_SIZE,  GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonAutonomia,  GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                    .addComponent(jButtonConsultar,  GroupLayout.DEFAULT_SIZE,  GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonModificar,  GroupLayout.DEFAULT_SIZE,  GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonListarVehiculo,  GroupLayout.Alignment.TRAILING,  GroupLayout.DEFAULT_SIZE,  GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup( GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonAnadir,  GroupLayout.PREFERRED_SIZE, 52,  GroupLayout.PREFERRED_SIZE)
                .addPreferredGap( LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonBorrar,  GroupLayout.PREFERRED_SIZE, 49,  GroupLayout.PREFERRED_SIZE)
                .addPreferredGap( LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonAutonomia,  GroupLayout.PREFERRED_SIZE, 55,  GroupLayout.PREFERRED_SIZE)
                .addPreferredGap( LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonConsultar,  GroupLayout.PREFERRED_SIZE, 48,  GroupLayout.PREFERRED_SIZE)
                .addPreferredGap( LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonModificar,  GroupLayout.PREFERRED_SIZE, 53,  GroupLayout.PREFERRED_SIZE)
                .addPreferredGap( LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonListarVehiculo,  GroupLayout.PREFERRED_SIZE, 53,  GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel4.setBorder( BorderFactory.createTitledBorder("Moto"));

        jCheckBoxActivoBaul.setText("Baul");
        jCheckBoxActivoBaul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxActivoBaulActionPerformed(evt);
            }
        });

         GroupLayout jPanel4Layout = new  GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup( GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jCheckBoxActivoBaul)
                .addGap(0, 57, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup( GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCheckBoxActivoBaul)
                .addContainerGap(79, Short.MAX_VALUE))
        );

        jPanel5.setBorder( BorderFactory.createTitledBorder("Estado Vehiculo"));

        jCheckBoxActivo.setText("Activo");
        jCheckBoxActivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxActivoActionPerformed(evt);
            }
        });

        jCheckBoxDeshabilitado.setText("Deshabilitado");
        jCheckBoxDeshabilitado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxDeshabilitadoActionPerformed(evt);
            }
        });

         GroupLayout jPanel5Layout = new  GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup( GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup( GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBoxActivo)
                    .addComponent(jCheckBoxDeshabilitado))
                .addContainerGap(124, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup( GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCheckBoxActivo)
                .addPreferredGap( LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBoxDeshabilitado)
                .addContainerGap( GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel7.setBorder( BorderFactory.createTitledBorder("Vehiculo"));

        jCheckBoxMoto.setText("Moto");
        jCheckBoxMoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMotoActionPerformed(evt);
            }
        });

        jCheckBoxCoche.setText("Coche");
        jCheckBoxCoche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxCocheActionPerformed(evt);
            }
        });

        jLabel8.setText("Coste:");

         GroupLayout jPanel7Layout = new  GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup( GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup( GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap( LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldCoste))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup( GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBoxMoto)
                            .addComponent(jCheckBoxCoche))
                        .addGap(0, 152, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup( GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCheckBoxMoto)
                .addPreferredGap( LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBoxCoche)
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup( GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextFieldCoste,  GroupLayout.PREFERRED_SIZE,  GroupLayout.DEFAULT_SIZE,  GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

         GroupLayout layout = new  GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup( GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup( GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1,  GroupLayout.PREFERRED_SIZE,  GroupLayout.DEFAULT_SIZE,  GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap( LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextAreaList))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup( GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel7,  GroupLayout.PREFERRED_SIZE,  GroupLayout.DEFAULT_SIZE,  GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel2,  GroupLayout.PREFERRED_SIZE,  GroupLayout.DEFAULT_SIZE,  GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap( LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup( GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel4,  GroupLayout.PREFERRED_SIZE,  GroupLayout.DEFAULT_SIZE,  GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap( LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel3,  GroupLayout.PREFERRED_SIZE,  GroupLayout.DEFAULT_SIZE,  GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel5,  GroupLayout.PREFERRED_SIZE,  GroupLayout.DEFAULT_SIZE,  GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap( LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel6,  GroupLayout.PREFERRED_SIZE,  GroupLayout.DEFAULT_SIZE,  GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonSalir)
                .addContainerGap( GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup( GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup( GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1,  GroupLayout.PREFERRED_SIZE,  GroupLayout.DEFAULT_SIZE,  GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextAreaList,  GroupLayout.PREFERRED_SIZE, 133,  GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup( GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap( LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup( GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel7,  GroupLayout.PREFERRED_SIZE,  GroupLayout.DEFAULT_SIZE,  GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap( LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel2,  GroupLayout.PREFERRED_SIZE,  GroupLayout.DEFAULT_SIZE,  GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup( GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel3,  GroupLayout.PREFERRED_SIZE,  GroupLayout.DEFAULT_SIZE,  GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel4,  GroupLayout.PREFERRED_SIZE,  GroupLayout.DEFAULT_SIZE,  GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap( LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel5,  GroupLayout.PREFERRED_SIZE,  GroupLayout.DEFAULT_SIZE,  GroupLayout.PREFERRED_SIZE)
                                .addGap(51, 51, 51))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jPanel6,  GroupLayout.PREFERRED_SIZE,  GroupLayout.DEFAULT_SIZE,  GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap( LayoutStyle.ComponentPlacement.RELATED,  GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonSalir)
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAnadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAnadirActionPerformed
    	 if(jTextFieldModelo.getText().isEmpty() || jTextFieldMatricula.getText().isEmpty() || jFormattedTextFieldNumBaterias.getText().isEmpty() || jFormattedTextFieldColor.getText().isEmpty() ){
     		JOptionPane.showMessageDialog(null,"Error al dar de alta, faltan campos por rellenar");
    	 }
	     else if(this.jCheckBoxCoche.isSelected()){
	    	 if(this.jTextFieldPuertas.getText().isEmpty()){
	    		 JOptionPane.showMessageDialog(null,"Error al dar de alta el coche, decide el n�mero de puertas");
	    	 }
	    	 else{
	    		TVehiculo t = new TCoche(-1, this.jTextFieldModelo.getText(), 
	    				this.jTextFieldMatricula.getText(),this.jFormattedTextFieldColor.getText(),
	    				Integer.parseInt(this.jFormattedTextFieldNumBaterias.getText()),Double.valueOf(this.jTextFieldCoste.getText()).doubleValue(),true, 
	    				Integer.parseInt(this.jTextFieldPuertas.getText()), this.jCheckBoxGPS.isSelected());
	 	      	Controller.getInstance().run(ListaComandos.NEGOCIOALTAVEHICULO, t); 
	 	      	this.limpiarComponentes();
	    	 }
	     }
	     else if(this.jCheckBoxMoto.isSelected()){
	    	JOptionPane.showMessageDialog(null,"Vamos a dar de alta una moto..");
	      	TMoto t = new TMoto(-1, jTextFieldModelo.getText(), jTextFieldMatricula.getText(), jFormattedTextFieldColor.getText(), Integer.parseInt(jFormattedTextFieldNumBaterias.getText()), true,Double.valueOf(this.jTextFieldCoste.getText()).doubleValue(), jCheckBoxActivoBaul.isSelected());
	      	Controller.getInstance().run(ListaComandos.NEGOCIOALTAVEHICULO, t);

	     }
    }
    
    //}//GEN-LAST:event_jButtonAnadirActionPerformed

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
    	Controller.getInstance().run(ListaComandos.VISTAMENUPRINCIPAL, null);
    	this.setVisible(false);
    }//GEN-LAST:event_jButtonSalirActionPerformed
    

    private void jButtonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificarActionPerformed
    	if(jTextFieldModelo.getText().isEmpty() || jTextFieldMatricula.getText().isEmpty() || jFormattedTextFieldNumBaterias.getText().isEmpty() || jFormattedTextFieldColor.getText().isEmpty() ){
	    		JOptionPane.showMessageDialog(null,"Error al dar de alta, faltan campos por rellenar");
	    }
	
		else {
			if(this.jCheckBoxMoto.isSelected()){
		    	JOptionPane.showMessageDialog(null,"Vamos a modificar una moto..");
		    	TMoto t = new TMoto(-1, jTextFieldModelo.getText(), jTextFieldMatricula.getText(), jFormattedTextFieldColor.getText(), Integer.parseInt(jFormattedTextFieldNumBaterias.getText()), true,Double.valueOf(this.jTextFieldCoste.getText()).doubleValue(), jCheckBoxActivoBaul.isSelected());
		       	Controller.getInstance().run(ListaComandos.NEGOCIOMODIFICARVEHICULO, t); 
			}
			else if(this.jCheckBoxCoche.isSelected()){
				JOptionPane.showMessageDialog(null,"Vamos a modificar un coche..");
	    		//public TCoche(int id, String modelo, String matricula, String color,int numBaterias, boolean activo, int puertas, boolean gps)
	    		TCoche t = new TCoche(-1, this.jTextFieldModelo.getText(), this.jTextFieldMatricula.getText(),
	    				this.jFormattedTextFieldColor.getText(),Integer.parseInt(this.jFormattedTextFieldNumBaterias.getText()),
	    				Double.valueOf(this.jTextFieldCoste.getText()).doubleValue(),true, Integer.parseInt(this.jTextFieldPuertas.getText()), 
	    				this.jCheckBoxGPS.isSelected());				
	    	   	Controller.getInstance().run(ListaComandos.NEGOCIOMODIFICARVEHICULO, t); 
			}
 	   

		}	
    }//GEN-LAST:event_jButtonModificarActionPerformed
    

    private void jButtonConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsultarActionPerformed
    	 // TODO add your handling code here:
    	if(jTextFieldIdVehiculo.getText().isEmpty()){
    		JOptionPane.showMessageDialog(null,"Fallo al consultar, rellena el campo idVehiculo");
    	}
  
    	else{
	    	int id = Integer.parseInt(jTextFieldIdVehiculo.getText());
	    	Controller.getInstance().run(ListaComandos.NEGOCIOBUSCARVEHICULO, id);
    	}
    }//GEN-LAST:event_jButtonConsultarActionPerformed
    

    private void jButtonAutonomiaActionPerformed(java.awt.event.ActionEvent evt) {
    	if(jTextFieldIdVehiculo.getText().isEmpty()){
    		JOptionPane.showMessageDialog(null,"Fallo al consultar, rellena el campo idVehiculo");
    	}
    	else{
    		int id = Integer.parseInt(jTextFieldIdVehiculo.getText());
    		Controller.getInstance().run(ListaComandos.NEGOCIOCOMPROBARAUTONOMIA, id);
    	}       
    }//GEN-LAST:event_jButtonAutonomiaActionPerformed
    

    private void jButtonBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBorrarActionPerformed
    	if(jTextFieldIdVehiculo.getText().isEmpty()){
    		JOptionPane.showMessageDialog(null,"Fallo al dar de baja, rellena el campo idVehiculo");
    	}

    	else{
	   		int id =Integer.parseInt(jTextFieldIdVehiculo.getText());
	    	Controller.getInstance().run(ListaComandos.NEGOCIOBAJAVEHICULO, id);

    	}
    }//GEN-LAST:event_jButtonBorrarActionPerformed
    

    private void jCheckBoxActivoBaulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxActivoBaulActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxActivoBaulActionPerformed
    

    private void jCheckBoxGPSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxGPSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxGPSActionPerformed
    

    private void jCheckBoxActivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxActivoActionPerformed
    	if(this.jCheckBoxDeshabilitado.isSelected())
    		this.jCheckBoxDeshabilitado.setSelected(false);
    }//GEN-LAST:event_jCheckBoxActivoActionPerformed
    

    private void jCheckBoxDeshabilitadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxDeshabilitadoActionPerformed
    	if(this.jCheckBoxActivo.isSelected())
    		this.jCheckBoxActivo.setSelected(false);
    }//GEN-LAST:event_jCheckBoxDeshabilitadoActionPerformed
    

    private void jCheckBoxMotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMotoActionPerformed
        if(this.jCheckBoxCoche.isSelected()){
        	this.jCheckBoxCoche.setSelected(false);
        	jCheckBoxActivoBaul.setEnabled(true);
            jCheckBoxGPS.setEnabled(false);
            jTextFieldPuertas.setEnabled(false);
            jCheckBoxGPS.setSelected(false);
            jTextFieldPuertas.setText("");
        	
        }
    }//GEN-LAST:event_jCheckBoxMotoActionPerformed
    

    private void jCheckBoxCocheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxCocheActionPerformed
    	 if(this.jCheckBoxMoto.isSelected()){
         	this.jCheckBoxMoto.setSelected(false);
         	jCheckBoxActivoBaul.setEnabled(false);
            jCheckBoxGPS.setEnabled(true);
            jTextFieldPuertas.setEnabled(true);
            jCheckBoxActivoBaul.setSelected(false);
         }
    }//GEN-LAST:event_jCheckBoxCocheActionPerformed
    

    private void jButtonListarVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListarVehiculoActionPerformed
    	Controller.getInstance().run(ListaComandos.NEGOCIOLISTAVEHICULO, null);
    }//GEN-LAST:event_jButtonListarVehiculoActionPerformed
    
    public void setLista(String s){
    	this.jTextAreaList.setText(s);
    }
    public void setComponentes(TVehiculo t){
    	this.jTextFieldMatricula.setText(t.getMatricula());
    	this.jTextFieldModelo.setText(t.getModelo());
    	this.jFormattedTextFieldNumBaterias.setText(Integer.toString(t.getNumBaterias()));
    	this.jFormattedTextFieldColor.setText(t.getColor());
    	if(t instanceof TMoto){
    		this.jCheckBoxMoto.setSelected(true);
    		this.jCheckBoxCoche.setSelected(false);
    		this.jCheckBoxActivo.setSelected(((TMoto) t).getActivo());
    		this.jCheckBoxActivoBaul.setSelected(((TMoto) t).getBaul());
    	}
    	else if (t instanceof TCoche){
    		this.jCheckBoxCoche.setSelected(true);
    		this.jCheckBoxMoto.setSelected(false);
    		this.jCheckBoxActivo.setSelected(((TCoche) t).getActivo());
    		this.jCheckBoxGPS.setSelected(((TCoche) t).getGps());
    		this.jTextFieldPuertas.setText(Integer.toString(((TCoche) t).getPuertas()));
    	}
    	//Comprobar si es coche o moto para rellenar los siguientes campos de baul gps y puertas bien
    	
        jCheckBoxActivo.setSelected(t.getActivo());
        jCheckBoxDeshabilitado.setSelected(!t.getActivo());
    }
   
    
    private void limpiarComponentes(){
    	this.jTextFieldIdVehiculo.setText("");
        this.jTextFieldModelo.setText("");
        this.jTextFieldMatricula.setText("");
        this.jTextFieldPuertas.setText("");
        this.jFormattedTextFieldColor.setText("");
        this.jFormattedTextFieldNumBaterias.setText("");
        jCheckBoxActivo.setSelected(false);
        jCheckBoxDeshabilitado.setSelected(false);
    }
    
    public void setAutonomia(int i){
    	this.jFormattedTextFieldAutonomia.setText(Integer.toString(i));
    }
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for ( UIManager.LookAndFeelInfo info :  UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                     UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Vehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch ( UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vehiculo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private  JButton jButtonAnadir;
    private  JButton jButtonAutonomia;
    private  JButton jButtonBorrar;
    private  JButton jButtonConsultar;
    private  JButton jButtonListarVehiculo;
    private  JButton jButtonModificar;
    private  JButton jButtonSalir;
    private  JCheckBox jCheckBoxActivo;
    private  JCheckBox jCheckBoxActivoBaul;
    private  JCheckBox jCheckBoxCoche;
    private  JCheckBox jCheckBoxDeshabilitado;
    private  JCheckBox jCheckBoxGPS;
    private  JCheckBox jCheckBoxMoto;
    private  JTextField jFormattedTextFieldAutonomia;
    private  JTextField jFormattedTextFieldColor;
    private  JTextField jFormattedTextFieldNumBaterias;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private  JLabel jLabel3;
    private  JLabel jLabel4;
    private  JLabel jLabel5;
    private  JLabel jLabel6;
    private  JLabel jLabel7;
    private  JLabel jLabel8;
    private  JPanel jPanel1;
    private  JPanel jPanel2;
    private  JPanel jPanel3;
    private  JPanel jPanel4;
    private  JPanel jPanel5;
    private  JPanel jPanel6;
    private  JPanel jPanel7;
    private  JTextField jTextFieldCoste;
    private  JTextField jTextFieldIdVehiculo;
    private  JTextArea jTextAreaList;
    private  JTextField jTextFieldMatricula;
    private  JTextField jTextFieldModelo;
    private JTextField jTextFieldPuertas;
    // End of variables declaration//GEN-END:variables
}