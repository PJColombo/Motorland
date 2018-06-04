/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion.vistas.VistaAlquilerEmergente;

import java.util.ArrayList;

import Negocio.Alquiler.TAlquiler;
import Negocio.Vehiculo.TVehiculo;
import Presentacion.comandos.listadecomandos.ListaComandos;
import Presentacion.controlador.Controller;

/**
 *
 * @author Admin
 */
public class AlquilerEmergente extends javax.swing.JFrame {

    /**
     * Creates new form AlquilerEmergente
     */
	private TAlquiler alquiler;
	private double importeActual;
    public AlquilerEmergente(TAlquiler alquiler) {
        initComponents();
        this.alquiler = alquiler;
        this.importeActual = 0;
    }
    public AlquilerEmergente() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldImporte = new javax.swing.JTextField();
        jButtonAnadirAlquilerVehiculo = new javax.swing.JButton();
        jButtonDeshacerNegocioAlquilerVehiculo = new javax.swing.JButton();
        jButtonFinalizarAlquilerVehiculo = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jComboBoxListaVehiculos = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Vehiculos");

        jLabel2.setText("Importe");

        jTextFieldImporte.setText(" ");

        jButtonAnadirAlquilerVehiculo.setText("Annadir vehiculo");
        jButtonAnadirAlquilerVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAnadirAlquilerVehiculoActionPerformed(evt);
            }
        });

        jButtonDeshacerNegocioAlquilerVehiculo.setText("Deshacer negocio");
        jButtonDeshacerNegocioAlquilerVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeshacerNegocioAlquilerVehiculoActionPerformed(evt);
            }
        });

        jButtonFinalizarAlquilerVehiculo.setText("Finalizar Alquiler");
        jButtonFinalizarAlquilerVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFinalizarAlquilerVehiculoActionPerformed(evt);
            }
        });

        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jComboBoxListaVehiculos.setModel(new javax.swing.DefaultComboBoxModel<>(new TVehiculo[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxListaVehiculos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxListaVehiculosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jComboBoxListaVehiculos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(156, 156, 156)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jButtonDeshacerNegocioAlquilerVehiculo)
                                .addComponent(jButtonFinalizarAlquilerVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButtonAnadirAlquilerVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(26, 26, 26)
                                    .addComponent(jButtonCancelar)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldImporte, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(269, 269, 269))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2)
                                .addComponent(jComboBoxListaVehiculos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextFieldImporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addComponent(jButtonAnadirAlquilerVehiculo)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonDeshacerNegocioAlquilerVehiculo)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonFinalizarAlquilerVehiculo)
                        .addGap(25, 25, 25)
                        .addComponent(jButtonCancelar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void jButtonAnadirAlquilerVehiculoActionPerformed(java.awt.event.ActionEvent evt) {
    	int idVehiculo;
    	TVehiculo seleccionado;
    	
    	seleccionado = (TVehiculo) this.jComboBoxListaVehiculos.getSelectedItem();
       //Controller.getInstance().run(ListaComandos.NEGOCIOBUSCARVEHICULO, idVehiculo);
       double coste = 1;
       this.alquiler.addTolistaAlquilados(idVehiculo, seleccionado.getCoste());//precio
       this.jTextFieldImporte.setText(this.importeActual+= coste);
       
    }                                                             

    private void jButtonDeshacerNegocioAlquilerVehiculoActionPerformed(java.awt.event.ActionEvent evt) {                                                                       
        // TODO add your handling code here:
    }                                                                      

    private void jButtonFinalizarAlquilerVehiculoActionPerformed(java.awt.event.ActionEvent evt) {                                                                 
        // TODO add your handling code here:
    }                                                                

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {                                                
        // TODO add your handling code here:
    }                                               

    private void jComboBoxListaVehiculosActionPerformed(java.awt.event.ActionEvent evt) {                                                        
        ArrayList<TVehiculo> listaVehiculosDisponibles = new ArrayList<TVehiculo>();
        String mostrarLista = "";
        for(int i = 0; i < listaVehiculosDisponibles.size(); i++){
	        mostrarLista += listaVehiculosDisponibles.get(i).getId() + " ";
	        mostrarLista += listaVehiculosDisponibles.get(i).getMatricula() + " ";
	        mostrarLista += listaVehiculosDisponibles.get(i).getModelo()+ " ";
	        this.jComboBoxListaVehiculos.add;
        }
    }                                                       
    //vehiculo disponibles y el numero de clientes totales;
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
            java.util.logging.Logger.getLogger(AlquilerEmergente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AlquilerEmergente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AlquilerEmergente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AlquilerEmergente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AlquilerEmergente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButtonAnadirAlquilerVehiculo;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonDeshacerNegocioAlquilerVehiculo;
    private javax.swing.JButton jButtonFinalizarAlquilerVehiculo;
    private javax.swing.JComboBox<TVehiculo> jComboBoxListaVehiculos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextFieldImporte;
    // End of variables declaration                   
}
