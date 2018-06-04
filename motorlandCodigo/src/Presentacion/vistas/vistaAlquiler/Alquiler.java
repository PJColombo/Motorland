package Presentacion.vistas.vistaAlquiler;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;



import Negocio.Alquiler.TAlquiler;
import Presentacion.comandos.listadecomandos.ListaComandos;
import Presentacion.controlador.Controller;
import Presentacion.vistas.VistaAlquilerEmergente.AlquilerEmergente;

@SuppressWarnings("serial")
public class Alquiler extends javax.swing.JFrame {

    /**
     * Creates new form Alquiler
     */
    public Alquiler() {
    	this.setIconImage(new ImageIcon(getClass().getResource("/Imagenes/MotorLand.png")).getImage());
    	this.setTitle("Men� Alquiler");
        initComponents();
        this.jCheckBoxEfectivo.setSelected(true);
    	this.jCheckBoxActivo.setSelected(true);
    	this.jTextAreaAlquileres.setEnabled(false);
    	this.jTextFieldImporte.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldIdAlquiler = new javax.swing.JTextField();
        jTextFieldIdCliente = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldFechaInicioDia = new javax.swing.JTextField();
        jTextFieldFechaInicioMes = new javax.swing.JTextField();
        jTextFieldFechaInicioAno = new javax.swing.JTextField();
        jTextFieldFechaFinDia = new javax.swing.JTextField();
        jTextFieldFechaFinMes = new javax.swing.JTextField();
        jTextFieldFechaFinAno = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaAlquileres = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        jCheckBoxEfectivo = new javax.swing.JCheckBox();
        jCheckBoxTarjeta = new javax.swing.JCheckBox();
        jLabel10 = new javax.swing.JLabel();
        jCheckBoxActivo = new javax.swing.JCheckBox();
        jCheckBoxDesactivo = new javax.swing.JCheckBox();
        jLabel11 = new javax.swing.JLabel();
        jTextFieldImporte = new javax.swing.JTextField();
        jButtonAltaAlquiler = new javax.swing.JButton();
        jButtonBajaAlquiler = new javax.swing.JButton();
        jButtonModificarAlquiler = new javax.swing.JButton();
        jButtonListaAlquiler = new javax.swing.JButton();
        jButtonConsultarAlquiler = new javax.swing.JButton();
        jButtonVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Id alquiler");

        jLabel2.setText("Id cliente");

        jTextFieldIdAlquiler.setText("");

        jTextFieldIdCliente.setText("");

        jLabel3.setText("Fecha inicio");

        jLabel4.setText("Fecha fin");

        jTextFieldFechaInicioDia.setText("");

        jTextFieldFechaInicioMes.setText("");

        jTextFieldFechaInicioAno.setText("");

        jTextFieldFechaFinDia.setText("");

        jTextFieldFechaFinMes.setText("");

        jTextFieldFechaFinAno.setText("");

        jLabel5.setText("Dia");

        jLabel6.setText("Mes");

        jLabel7.setText("A�o");

        jLabel8.setText("Alquileres");

        jTextAreaAlquileres.setColumns(20);
        jTextAreaAlquileres.setRows(5);
        jScrollPane1.setViewportView(jTextAreaAlquileres);

        jLabel9.setText("Metodo de pago");

        jCheckBoxEfectivo.setText("Efectivo");
        jCheckBoxEfectivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxEfectivoActionPerformed(evt);
            }
        });

        jCheckBoxTarjeta.setText("Tarjeta");
        jCheckBoxTarjeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxTarjetaActionPerformed(evt);
            }
        });

        jLabel10.setText("Estado");

        jCheckBoxActivo.setText("Activo");
        jCheckBoxActivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxActivoActionPerformed(evt);
            }
        });

        jCheckBoxDesactivo.setText("Desactivado");
        jCheckBoxDesactivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxDesactivoActionPerformed(evt);
            }
        });

        jLabel11.setText("Importe");

        jTextFieldImporte.setText(" ");

        jButtonAltaAlquiler.setText("Alta alquiler");
        jButtonAltaAlquiler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAltaAlquilerActionPerformed(evt);
            }
        });

        jButtonBajaAlquiler.setText("Baja alquiler");
        jButtonBajaAlquiler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBajaAlquilerActionPerformed(evt);
            }
        });

        jButtonModificarAlquiler.setText("Modificar alquiler");
        jButtonModificarAlquiler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModificarAlquilerActionPerformed(evt);
            }
        });

        jButtonListaAlquiler.setText("Lista");
        jButtonListaAlquiler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListaAlquilerActionPerformed(evt);
            }
        });

        jButtonConsultarAlquiler.setText("Consultar");
        jButtonConsultarAlquiler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsultarAlquilerActionPerformed(evt);
            }
        });

        jButtonVolver.setText("Volver");
        jButtonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(99, 99, 99)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jCheckBoxTarjeta)
                                .addComponent(jCheckBoxEfectivo))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel8)
                                .addComponent(jLabel2)))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldIdAlquiler)
                            .addComponent(jTextFieldIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldFechaFinDia)
                            .addComponent(jTextFieldFechaInicioDia, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel5)))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextFieldFechaFinMes, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldFechaFinAno, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldFechaInicioMes, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jTextFieldFechaInicioAno)))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonAltaAlquiler)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonBajaAlquiler)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonModificarAlquiler)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonListaAlquiler)
                        .addGap(0, 0, 0)
                        .addComponent(jButtonConsultarAlquiler))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jCheckBoxActivo))
                        .addGap(104, 104, 104)
                        .addComponent(jLabel11)
                        .addGap(34, 34, 34)
                        .addComponent(jTextFieldImporte, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jCheckBoxDesactivo)
                    .addComponent(jButtonVolver))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jTextFieldIdAlquiler, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextFieldIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextFieldFechaInicioDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldFechaInicioMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldFechaInicioAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTextFieldFechaFinDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldFechaFinMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldFechaFinAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(27, 27, 27)
                .addComponent(jLabel8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(jCheckBoxEfectivo)
                        .addGap(18, 18, 18)
                        .addComponent(jCheckBoxTarjeta))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBoxActivo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jTextFieldImporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBoxDesactivo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAltaAlquiler)
                    .addComponent(jButtonBajaAlquiler)
                    .addComponent(jButtonModificarAlquiler)
                    .addComponent(jButtonListaAlquiler)
                    .addComponent(jButtonConsultarAlquiler))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jButtonVolver)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonBajaAlquilerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBajaAlquilerActionPerformed
    	if(this.jTextFieldIdAlquiler.getText().isEmpty()){
    		JOptionPane.showMessageDialog(null,"Fallo al dar de baja, rellena el campo idVehiculo");
    	}

    	else{
	   		//int id =Integer.parseInt(jTextFieldIdVehiculo.getText());
	    	//Controller.getInstance().run(ListaComandos.NEGOCIOBAJAVEHICULO, id);

    	}
    }//GEN-LAST:event_jButtonBajaAlquilerActionPerformed

    private void jCheckBoxEfectivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxEfectivoActionPerformed
    	if(this.jCheckBoxTarjeta.isSelected())
    		this.jCheckBoxTarjeta.setSelected(false);
    }//GEN-LAST:event_jCheckBoxEfectivoActionPerformed

    private void jCheckBoxTarjetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxTarjetaActionPerformed
    	if(this.jCheckBoxEfectivo.isSelected())
    		this.jCheckBoxEfectivo.setSelected(false);
    }//GEN-LAST:event_jCheckBoxTarjetaActionPerformed

    private void jCheckBoxActivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxActivoActionPerformed
    	if(this.jCheckBoxDesactivo.isSelected())
    		this.jCheckBoxDesactivo.setSelected(false);
    }//GEN-LAST:event_jCheckBoxActivoActionPerformed

    private void jCheckBoxDesactivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxDesactivoActionPerformed
    	if(this.jCheckBoxActivo.isSelected())
    		this.jCheckBoxActivo.setSelected(false);
    }//GEN-LAST:event_jCheckBoxDesactivoActionPerformed

    private void jButtonAltaAlquilerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAltaAlquilerActionPerformed
        boolean vacio = this.jTextFieldFechaInicioDia.getText().isEmpty();
        int l = jTextFieldFechaInicioDia.getText().length();
    	if(this.jTextFieldIdCliente.getText().isEmpty() || this.jTextFieldFechaFinDia.getText().isEmpty() || this.jTextFieldFechaFinMes.getText().isEmpty() || this.jTextFieldFechaFinAno.getText().isEmpty() 
           || this.jTextFieldFechaInicioDia.getText().isEmpty() || this.jTextFieldFechaInicioMes.getText().isEmpty() || this.jTextFieldFechaInicioAno.getText().isEmpty()){
     			JOptionPane.showMessageDialog(null,"Error al dar de alta, faltan campos por rellenar");	
        }
    	else {
	        //crear calendar con tres ints
	        Calendar cIni = GregorianCalendar.getInstance();
	        cIni.set(Integer.parseInt(this.jTextFieldFechaInicioAno.getText()),Integer.parseInt(this.jTextFieldFechaInicioMes.getText()),Integer.parseInt(this.jTextFieldFechaInicioDia.getText()));
	       
	        Calendar cFin = GregorianCalendar.getInstance();
	        cFin.set(Integer.parseInt(this.jTextFieldFechaFinAno.getText()),Integer.parseInt(this.jTextFieldFechaFinMes.getText()),Integer.parseInt(this.jTextFieldFechaFinDia.getText()));
	       
	        TAlquiler t = new TAlquiler(-1, Integer.parseInt(this.jTextFieldIdCliente.getText()),cIni, cFin, -1, this.jCheckBoxTarjeta.isSelected(),this.jCheckBoxActivo.isSelected());
	        
	        Controller.getInstance().run(ListaComandos.VISTAMENUALTAALQUILEREMERGENTE, t);
    	}
    }//GEN-LAST:event_jButtonAltaAlquilerActionPerformed

    private void jButtonModificarAlquilerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificarAlquilerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonModificarAlquilerActionPerformed

    private void jButtonListaAlquilerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListaAlquilerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonListaAlquilerActionPerformed

    private void jButtonConsultarAlquilerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsultarAlquilerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonConsultarAlquilerActionPerformed

    private void jButtonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverActionPerformed
    	Controller.getInstance().run(ListaComandos.VISTAMENUPRINCIPAL, null);
    	this.setVisible(false);
    }//GEN-LAST:event_jButtonVolverActionPerformed

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
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Alquiler.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Alquiler.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Alquiler.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Alquiler.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Alquiler().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAltaAlquiler;
    private javax.swing.JButton jButtonBajaAlquiler;
    private javax.swing.JButton jButtonConsultarAlquiler;
    private javax.swing.JButton jButtonListaAlquiler;
    private javax.swing.JButton jButtonModificarAlquiler;
    private javax.swing.JButton jButtonVolver;
    private javax.swing.JCheckBox jCheckBoxActivo;
    private javax.swing.JCheckBox jCheckBoxDesactivo;
    private javax.swing.JCheckBox jCheckBoxEfectivo;
    private javax.swing.JCheckBox jCheckBoxTarjeta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaAlquileres;
    private javax.swing.JTextField jTextFieldFechaFinAno;
    private javax.swing.JTextField jTextFieldFechaFinDia;
    private javax.swing.JTextField jTextFieldFechaFinMes;
    private javax.swing.JTextField jTextFieldFechaInicioAno;
    private javax.swing.JTextField jTextFieldFechaInicioDia;
    private javax.swing.JTextField jTextFieldFechaInicioMes;
    private javax.swing.JTextField jTextFieldIdAlquiler;
    private javax.swing.JTextField jTextFieldIdCliente;
    private javax.swing.JTextField jTextFieldImporte;
    
    private AlquilerEmergente emergente;
    // End of variables declaration//GEN-END:variables
}
