/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;

/**
 *
 * @author torre
 */
public class AgregarVehiculoView extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(AgregarVehiculoView.class.getName());

    
    public AgregarVehiculoView() {
      initComponents();
        setLocationRelativeTo(null);
        txtKwh.setText("16");
        txtKwh.setEditable(false);
        
        cbSucursal.removeAllItems();
        for (domain.Sucursal s : data.Persistencia.getSucursales()) {
            cbSucursal.addItem(s.getCodigo());
        }
        cbSucursal.setSelectedIndex(-1);
        
        cbMarca.removeAllItems();
        for (domain.Marca m : data.Persistencia.getMarcas()) {
            cbMarca.addItem(m.getNombre());
        }
        cbMarca.setSelectedIndex(-1);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtPatente = new javax.swing.JTextField();
        txtModelo = new javax.swing.JTextField();
        txtAnio = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtCarga = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        cbTipo = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        cbSucursal = new javax.swing.JComboBox<>();
        btnGuardar = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtKmPorLitro = new javax.swing.JTextField();
        txtLitrosExtra = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtKwh = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        cbMarca = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        jLabel1.setText("Agregar Vehiculo");

        jLabel2.setText("Patente");

        jLabel3.setText("Marca");

        jLabel4.setText("Modelo");

        jLabel5.setText("Año Fab.");

        jLabel7.setText("Carga");

        jLabel8.setText("kg.");

        jLabel9.setText("(AA000AA o XXX123)");

        jLabel10.setText("Tipo");

        cbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Eléctrico", "Combustible" }));
        cbTipo.setSelectedIndex(-1);
        cbTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTipoActionPerformed(evt);
            }
        });

        jLabel11.setText("Sucursal");

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        jLabel12.setText("Solo vehiculos a combustible:");

        jLabel13.setText("Km x Lit");

        jLabel14.setText("Lts. Extra");

        jLabel15.setText("L");

        jLabel16.setText("km/l");

        jLabel17.setText("Solo vehiculos eléctricos:");

        jLabel18.setText("KWh");

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(221, 221, 221)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAnio, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbSucursal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtPatente, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel9))
                                    .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(cbMarca, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cbTipo, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(53, 53, 53)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtKwh, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel12)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(txtCarga, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(btnCancelar, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnGuardar)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel14)
                                                .addGap(15, 15, 15)
                                                .addComponent(txtLitrosExtra, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(txtKmPorLitro, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))))))))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtPatente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtCarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel12)
                    .addComponent(cbMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel13)
                    .addComponent(txtKmPorLitro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtLitrosExtra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15))
                .addGap(18, 18, 18)
                .addComponent(jLabel17)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(cbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(txtKwh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(cbSucursal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnCancelar))
                .addGap(63, 63, 63))
        );

        pack();
    }// </editor-fold>                        

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {                                           
   
        if (cbTipo.getSelectedIndex() == -1) {
            javax.swing.JOptionPane.showMessageDialog(this, "Por favor, seleccione un Tipo de vehículo.", "Dato faltante", javax.swing.JOptionPane.WARNING_MESSAGE);
            return; 
        }

        if (cbSucursal.getSelectedIndex() == -1) {
            javax.swing.JOptionPane.showMessageDialog(this, "Por favor, seleccione una Sucursal.", "Dato faltante", javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        if (cbMarca.getSelectedIndex() == -1) {
            javax.swing.JOptionPane.showMessageDialog(this, "Por favor, seleccione una Marca.", "Dato faltante", javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
        }

       
        String patente = txtPatente.getText().trim().toUpperCase();
        String modelo = txtModelo.getText().trim();


        
        if (modelo.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Por favor, ingrese el Modelo.", "Campos incompletos", javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
        }


        if (!patente.matches("^[A-Z]{3}\\d{3}$") && !patente.matches("^[A-Z]{2}\\d{3}[A-Z]{2}$")) {
            javax.swing.JOptionPane.showMessageDialog(this, "La patente debe tener el formato argentino: XXX111 o XX111XX.", "Ingrese una Patente válida", javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
        }

       
        try {
            
            int anio = Integer.parseInt(txtAnio.getText().trim());
            double carga = Double.parseDouble(txtCarga.getText().trim());

            
            String codSucursal = cbSucursal.getSelectedItem().toString();
            domain.Sucursal sucursalElegida = null;
            for (domain.Sucursal s : data.Persistencia.getSucursales()) {
                if (s.getCodigo().equals(codSucursal)) {
                    sucursalElegida = s;
                    break;
                }
            }
            
            String nombreMarca = cbMarca.getSelectedItem().toString();
            domain.Marca marcaElegida = null;
            for (domain.Marca m : data.Persistencia.getMarcas()) {
                if (m.getNombre().equals(nombreMarca)) {
                    marcaElegida = m;
                    break;
                }
            }
            
            String tipo = cbTipo.getSelectedItem().toString();

            if (tipo.equals("Eléctrico")) {
                double kwh = Double.parseDouble(txtKwh.getText().trim());
                domain.VehiculoElectrico ve = new domain.VehiculoElectrico(
                    patente, marcaElegida, modelo, anio, carga, sucursalElegida, kwh
                );
                data.Persistencia.agregarVehiculo(ve);

            } else {
                double kmLt = Double.parseDouble(txtKmPorLitro.getText().trim());
                double ltsEx = Double.parseDouble(txtLitrosExtra.getText().trim());
                domain.VehiculoCombustible vc = new domain.VehiculoCombustible(
                    patente, marcaElegida, modelo, anio, carga, sucursalElegida, kmLt, ltsEx
                );
                data.Persistencia.agregarVehiculo(vc);
            }

            javax.swing.JOptionPane.showMessageDialog(this, "Vehículo agregado con éxito", "Éxito", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            
            MenuPrincipalView menu = new MenuPrincipalView();
            menu.setVisible(true);
            this.dispose(); 

        } catch (NumberFormatException e) {
      
            javax.swing.JOptionPane.showMessageDialog(this, "Asegúrese de ingresar SOLO NÚMEROS en el Año de fabricación, la Carga y los valores de consumo (use punto para decimales).", "Error numérico", javax.swing.JOptionPane.ERROR_MESSAGE);
        }

    }                                          

    private void cbTipoActionPerformed(java.awt.event.ActionEvent evt) {                                       
        if (cbTipo.getSelectedItem() == null) {
            return;
        }
        String tipoSeleccionado = cbTipo.getSelectedItem().toString();
    
        if (tipoSeleccionado.equals("Eléctrico")) {
            
            txtKwh.setText("16"); 
            txtKwh.setEditable(false);

         
            txtKmPorLitro.setText("");
            txtKmPorLitro.setEditable(false);
            txtLitrosExtra.setText("");
            txtLitrosExtra.setEditable(false);
        } else if (tipoSeleccionado.equals("Combustible")) {
            
            txtKmPorLitro.setEditable(true);
            txtLitrosExtra.setEditable(true);

           
            txtKwh.setText("");
            txtKwh.setEditable(false);
        }
    }                                      

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {                                            
        MenuPrincipalView menu = new MenuPrincipalView();
        menu.setVisible(true);
        this.dispose();
    }                                        
    @SuppressWarnings("unchecked")

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(() -> new AgregarVehiculoView().setVisible(true));
    }
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JComboBox<String> cbMarca;
    private javax.swing.JComboBox<String> cbSucursal;
    private javax.swing.JComboBox<String> cbTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtAnio;
    private javax.swing.JTextField txtCarga;
    private javax.swing.JTextField txtKmPorLitro;
    private javax.swing.JTextField txtKwh;
    private javax.swing.JTextField txtLitrosExtra;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtPatente;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
