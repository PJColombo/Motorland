package Presentacion.vistas.vistaVehiculo;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import Negocio.Vehiculo.TCoche;
import Negocio.Vehiculo.TMoto;
import Presentacion.comandos.listadecomandos.ListaComandos;
import Presentacion.controlador.Controller;

public class VehiculoGUI extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final String SEPARATOR = "--------------------------------------------------------------------------------------";
    /**
     * Creates new form VehiculoGUI
     */
    public VehiculoGUI() {
    	this.setIconImage(new ImageIcon(getClass().getResource("/Imagenes/MotorLand.png")).getImage());
    	this.setTitle("Men� veh�culos");
        initComponents();
    }

    public void muestra(String texto) {
    	vehiculoTA.append(texto);
    	vehiculoTA.append("\n" + SEPARATOR + "\n");
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        tipoBG = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cocheRB = new javax.swing.JRadioButton();
        motoRB = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        gpsCB = new javax.swing.JCheckBox();
        jLabel7 = new javax.swing.JLabel();
        puertasTF = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        baulCB = new javax.swing.JCheckBox();
        jLabel8 = new javax.swing.JLabel();
        idTF = new javax.swing.JTextField();
        bateriasTF = new javax.swing.JTextField();
        matriculaTF = new javax.swing.JTextField();
        modeloTF = new javax.swing.JTextField();
        colorTF = new javax.swing.JTextField();
        costeTF = new javax.swing.JTextField();
        limpiarB = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        vehiculoTA = new javax.swing.JTextArea();
        jPanel5 = new javax.swing.JPanel();
        altaB = new javax.swing.JButton();
        bajaB = new javax.swing.JButton();
        modificaB = new javax.swing.JButton();
        listaB = new javax.swing.JButton();
        consultaB = new javax.swing.JButton();
        autonomiaB = new javax.swing.JButton();
        vipB = new javax.swing.JButton();
        volverB = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setText("ID:");

        jLabel2.setText("Matricula:");

        jLabel3.setText("Modelo:");

        jLabel4.setText("N�m. Baterias:");

        jLabel5.setText("Color:");

        jLabel6.setText("Coste:");

        cocheRB.setText("Coche");

        motoRB.setText("Moto");

        tipoBG.add(cocheRB);
        cocheRB.setActionCommand("COCHE");
        cocheRB.setSelected(true);
        
        tipoBG.add(motoRB);
        motoRB.setActionCommand("MOTO");
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Coche"));

        gpsCB.setText("GPS");

        jLabel7.setText("N�m. Puertas:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(gpsCB)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(puertasTF, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(gpsCB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(puertasTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Moto"));

        baulCB.setText("Ba�l");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(baulCB)
                .addContainerGap(72, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(baulCB)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel8.setText("Tipo:");

        limpiarB.setText("Limpiar");
        limpiarB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(motoRB)
                            .addComponent(cocheRB))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(limpiarB, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel8)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel6))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(idTF, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(colorTF, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(costeTF, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel3))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(bateriasTF)
                                        .addComponent(matriculaTF)
                                        .addComponent(modeloTF, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 144, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(idTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(matriculaTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(modeloTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(bateriasTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(colorTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(costeTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cocheRB)
                    .addComponent(limpiarB))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(motoRB)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        vehiculoTA.setEditable(false);
        vehiculoTA.setColumns(20);
        vehiculoTA.setRows(5);
        jScrollPane1.setViewportView(vehiculoTA);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 357, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        altaB.setText("Alta veh�culo");
        altaB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                altaBActionPerformed(evt);
            }
        });

        bajaB.setText("Baja veh�culo");
        bajaB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bajaBActionPerformed(evt);
            }
        });

        modificaB.setText("Modifica veh�culo");
        modificaB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificaBActionPerformed(evt);
            }
        });

        listaB.setText("Lista veh�culos");
        listaB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaBActionPerformed(evt);
            }
        });

        consultaB.setText("Consulta veh�culo");
        consultaB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultaBActionPerformed(evt);
            }
        });

        autonomiaB.setText("Comprobar autonom�a");
        autonomiaB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                autonomiaBActionPerformed(evt);
            }
        });

        vipB.setBackground(new java.awt.Color(226, 226, 18));
        vipB.setText("Veh�culo VIP");
        vipB.setToolTipText("Muestra el veh�culo m�s alquilado.");
        vipB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vipBActionPerformed(evt);
            }
        });

        volverB.setText("Volver");
        volverB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(autonomiaB, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(listaB, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(altaB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bajaB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(modificaB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(consultaB, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(vipB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(volverB, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(vipB, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(altaB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bajaB)))
                .addGap(18, 18, 18)
                .addComponent(modificaB)
                .addGap(18, 18, 18)
                .addComponent(consultaB)
                .addGap(18, 18, 18)
                .addComponent(listaB)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(autonomiaB)
                    .addComponent(volverB))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>                        

    private void altaBActionPerformed(java.awt.event.ActionEvent evt) {  
    	String modelo = modeloTF.getText();
    	String matricula = matriculaTF.getText();
    	String color = colorTF.getText();
    	int baterias;
    	int puertas;
    	double coste;
    	if(modelo.isEmpty() || matricula.isEmpty() || bateriasTF.getText().isEmpty() ||
    			color.isEmpty() ){
     		JOptionPane.showMessageDialog(this,"Error al dar de alta, faltan campos por rellenar", "Alta veh�culo", JOptionPane.ERROR_MESSAGE);
    	 }
	     else if(cocheRB.isSelected()){
	    	 if(puertasTF.getText().isEmpty()){
	    		 JOptionPane.showMessageDialog(this,"Introduce el n�mero de puertas del coche", "Alta veh�culo", JOptionPane.ERROR_MESSAGE);
	    	 }
	    	 else{
	    		 try {
	    			 baterias = Integer.parseInt(bateriasTF.getText());
	    			 puertas = Integer.parseInt(puertasTF.getText());
	    			 coste = Double.valueOf(costeTF.getText()).doubleValue();
	    			
	    			 TCoche t = new TCoche(-1, modelo, matricula, color, baterias, coste, true, puertas, gpsCB.isSelected());
	 	      
	    			 Controller.getInstance().run(ListaComandos.NEGOCIOALTAVEHICULO, t); 
	    		 }
	    		 catch(NumberFormatException e) {
	    			 JOptionPane.showMessageDialog(this,"El formato de algunos campos es incorrecto. Asegurate de introducir n�meros donde se requiera.", 
	    					 "Alta veh�culo", JOptionPane.ERROR_MESSAGE);
	    		 }
	    		
	    	 }
	     }
	     else if(motoRB.isSelected()){
	    	 try {
    			 baterias = Integer.parseInt(bateriasTF.getText());
    			 coste = Double.valueOf(costeTF.getText()).doubleValue();
    			
    			 TMoto t = new TMoto(-1, modelo, matricula, color, baterias,
    					 true, coste, baulCB.isSelected());
    			 
    			 Controller.getInstance().run(ListaComandos.NEGOCIOALTAVEHICULO, t); 
    		 }
    		 catch(NumberFormatException e) {
    			 JOptionPane.showMessageDialog(this,"El formato de algunos campos es incorrecto. Asegurate de introducir n�meros donde se requiera.", 
    					 "Alta veh�culo", JOptionPane.ERROR_MESSAGE);
    		 }
	     }
    }                                     

    private void bajaBActionPerformed(java.awt.event.ActionEvent evt) {  
    	int id;
    	if(idTF.getText().isEmpty()) {
    		JOptionPane.showMessageDialog(this,"Introduzca el ID de un veh�culo.", 
					 "Baja veh�culo", JOptionPane.ERROR_MESSAGE);
    	}
    	else {
    		try {
    			id = Integer.parseInt(idTF.getText());
    			if(id > 0)
    				Controller.getInstance().run(ListaComandos.NEGOCIOBAJAVEHICULO, id);
    			else
    				throw new NumberFormatException();
    		}
    		catch(NumberFormatException e) {
    			JOptionPane.showMessageDialog(this,"El formato del campo ID es incorrecto.", 
   					 "Baja veh�culo", JOptionPane.ERROR_MESSAGE);
    		}
    	}
    }                                     

    private void modificaBActionPerformed(java.awt.event.ActionEvent evt) {                                          
    	String modelo = modeloTF.getText();
    	String matricula = matriculaTF.getText();
    	String color = colorTF.getText();
    	int baterias = 0;
    	double coste = 0;
    	int puertas = 0;
    	int id = 0;
    	if(modelo.isEmpty() && matricula.isEmpty() && bateriasTF.getText().isEmpty() && color.isEmpty()
    			&& puertasTF.getText().isEmpty() && costeTF.getText().isEmpty()){
    		JOptionPane.showMessageDialog(this,"Rellena al menos uno de los campos que quiera modificar.", 
					 "Modifica veh�culo", JOptionPane.ERROR_MESSAGE);
    	}
    	else if(idTF.getText().isEmpty()) {
    		JOptionPane.showMessageDialog(this,"Introduzca ID del veh�culo que quiere modificar.", 
					 "Modifica veh�culo", JOptionPane.ERROR_MESSAGE);
    	}
		else {
			try {
				id = Integer.parseInt(idTF.getText());
				if(id <= 0) 
					throw new NumberFormatException();
				if(!costeTF.getText().isEmpty())
					coste = Double.parseDouble(costeTF.getText());
				if(!bateriasTF.getText().isEmpty())
					baterias = Integer.parseInt(bateriasTF.getText());
				
				if(motoRB.isSelected()){					
					TMoto t = new TMoto(id, modelo, matricula, color, baterias, true , 
							coste, baulCB.isSelected());
						
					Controller.getInstance().run(ListaComandos.NEGOCIOMODIFICARVEHICULO, t); 
				}
				else if(cocheRB.isSelected()){
					if(!puertasTF.getText().isEmpty())
						puertas = Integer.parseInt(puertasTF.getText());
		    		TCoche t = new TCoche(id, modelo, matricula,
		    				color , baterias, coste, true, puertas, 
		    				gpsCB.isSelected());				
		    	   	Controller.getInstance().run(ListaComandos.NEGOCIOMODIFICARVEHICULO, t); 
				}
			   
			}
			catch(NumberFormatException e) {
				JOptionPane.showMessageDialog(this,"El formato de algunos campos es incorrecto. Asegurate de introducir n�meros donde se requiera.", 
    					 "Modifica veh�culo", JOptionPane.ERROR_MESSAGE);
			}
		}	
    }                                         

    private void consultaBActionPerformed(java.awt.event.ActionEvent evt) {                                          
    	if(idTF.getText().isEmpty())
    		JOptionPane.showMessageDialog(this,"Introduzca el ID del veh�culo", "Consulta veh�culo",
    				JOptionPane.ERROR_MESSAGE);
    	else{
    		try {
		    	int id = Integer.parseInt(idTF.getText());
		    	if(id > 0)
		    		Controller.getInstance().run(ListaComandos.NEGOCIOBUSCARVEHICULO, id);
		    	else
		    		throw new NumberFormatException();
    		}
    		catch(NumberFormatException e) {
    			JOptionPane.showMessageDialog(this,"El formato del campo ID es incorrecto.", 
   					 "Consulta veh�culo", JOptionPane.ERROR_MESSAGE);
    		}
    	}
    }                                         

    private void listaBActionPerformed(java.awt.event.ActionEvent evt) {                                       
    	Controller.getInstance().run(ListaComandos.NEGOCIOLISTAVEHICULO, null);
    }                                      

    private void autonomiaBActionPerformed(java.awt.event.ActionEvent evt) {                                           
    	if(idTF.getText().isEmpty()){
    		JOptionPane.showMessageDialog(null,"Fallo al consultar, rellena el campo idVehiculo");
    	}
    	else{
    		try {
	    		int id = Integer.parseInt(idTF.getText());
	    		Controller.getInstance().run(ListaComandos.NEGOCIOCOMPROBARAUTONOMIA, id);
    		}
    		catch (NumberFormatException e) {
    			JOptionPane.showMessageDialog(this,"El formato del campo ID es incorrecto.", 
      					 "Calcula autonom�a veh�culo", JOptionPane.ERROR_MESSAGE);
    		}
    	} 
    }                                          

    private void vipBActionPerformed(java.awt.event.ActionEvent evt) {    
    	Controller.getInstance().run(ListaComandos.NEGOCIO_VEHICULO_MAS_ALQUILADO, null);
    }                                    

    private void volverBActionPerformed(java.awt.event.ActionEvent evt) {    
    	Controller.getInstance().run(ListaComandos.CERRAR_VISTA_VEHICULO, null);
    }                                       

    private void limpiarBActionPerformed(java.awt.event.ActionEvent evt) {                                         
    	idTF.setText("");
    	modeloTF.setText("");
    	matriculaTF.setText("");
    	colorTF.setText("");
    	bateriasTF.setText("");
    	puertasTF.setText("");
    	baulCB.setSelected(false);
    	gpsCB.setSelected(false);
    	costeTF.setText("");
    	vehiculoTA.setText("");
    }                                        


    // Variables declaration - do not modify                     
    private javax.swing.JButton altaB;
    private javax.swing.JButton autonomiaB;
    private javax.swing.JButton bajaB;
    private javax.swing.JTextField bateriasTF;
    private javax.swing.JCheckBox baulCB;
    private javax.swing.JRadioButton cocheRB;
    private javax.swing.JTextField colorTF;
    private javax.swing.JButton consultaB;
    private javax.swing.JTextField costeTF;
    private javax.swing.JCheckBox gpsCB;
    private javax.swing.JTextField idTF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton limpiarB;
    private javax.swing.JButton listaB;
    private javax.swing.JTextField matriculaTF;
    private javax.swing.JTextField modeloTF;
    private javax.swing.JButton modificaB;
    private javax.swing.JRadioButton motoRB;
    private javax.swing.JTextField puertasTF;
    private javax.swing.ButtonGroup tipoBG;
    private javax.swing.JTextArea vehiculoTA;
    private javax.swing.JButton vipB;
    private javax.swing.JButton volverB;
    // End of variables declaration 
}
