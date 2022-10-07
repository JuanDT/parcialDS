package Vista;

import Controlador.Controlador;
import java.util.List;
import javax.swing.JOptionPane;

public class VentanaGestionUsuario extends javax.swing.JFrame {

    VentanaUsuarios ventana;
    Controlador gestionUsuario;
    
    public VentanaGestionUsuario(VentanaUsuarios ventana, Controlador gestionUsuario) {
        this.ventana = ventana;
        this.gestionUsuario = gestionUsuario;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtContraseña = new javax.swing.JTextField();
        txtCedula = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("                                                      Gestión Usuarios");

        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        btnBuscar.setText("Buscar");
        btnBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarMouseClicked(evt);
            }
        });
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnModificar.setText("Modificar");
        btnModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnModificarMouseClicked(evt);
            }
        });
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarMouseClicked(evt);
            }
        });

        jLabel6.setText("contraseña");

        jLabel2.setText("cedula");

        jLabel3.setText("Nombre");

        jLabel4.setText("Apellido");

        jLabel5.setText("Correo");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(168, 168, 168)
                .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(91, Short.MAX_VALUE)
                .addComponent(btnBuscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnModificar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEliminar)
                .addGap(75, 75, 75))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(10, 10, 10)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(8, 8, 8)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel5))
                                    .addGap(45, 45, 45)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtCorreo, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txtApellido)))))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addGap(39, 39, 39)
                            .addComponent(txtContraseña)))
                    .addGap(10, 10, 10)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 273, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscar)
                    .addComponent(btnModificar)
                    .addComponent(btnEliminar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRegresar)
                .addGap(12, 12, 12))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(58, 58, 58)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(24, 24, 24)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(29, 29, 29)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(27, 27, 27)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(27, 27, 27)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(59, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseClicked
        String cedula = txtCedula.getText();
        String correo = txtCorreo.getText();

        if (!cedula.equals("")) {

            List<String> usuario = gestionUsuario.buscarCedula(cedula);
            if (!usuario.get(0).equals("")) {
                txtCedula.setEnabled(false);
                  txtCorreo.setEnabled(false);
                cargarInformacion(usuario);
            } else {
                limpiar();
                JOptionPane.showMessageDialog(this, "No se encuentra");
            }
        }else if(!correo.equals("")) {
            List<String> usuario = gestionUsuario.buscarCedula(correo);
            if (!usuario.get(3).equals("")) {
                txtCorreo.setEnabled(false);
                txtCedula.setEnabled(false);
                cargarInformacion(usuario);
            } else {
                limpiar();
                JOptionPane.showMessageDialog(this, "No se encuentra");
            }
            
        }else{
            JOptionPane.showMessageDialog(this, "Ingrese dato a buscar");
        }
    }//GEN-LAST:event_btnBuscarMouseClicked

    private void btnModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificarMouseClicked
         String cedula = txtCedula.getText();
        String nombre = txtNombre.getText();
        String apellido = txtApellido.getText() ;
        String correo = txtCorreo.getText();
        String contraseña = txtContraseña.getText();

        if (gestionUsuario.modificar(cedula, nombre, apellido, correo,contraseña)) {
            JOptionPane.showMessageDialog(this, "Modificado exitosamente");
            limpiar();
           
        } else {
            JOptionPane.showMessageDialog(this, "Error al modificar");
        }
    }//GEN-LAST:event_btnModificarMouseClicked

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseClicked
        String cedula = txtCedula.getText();
        String correo = txtCorreo.getText();

        if(!cedula.equals("")){
        if (gestionUsuario.eliminarCedula(cedula)) {
            JOptionPane.showMessageDialog(this, "Eliminado exitosamente");
            limpiar();
            
        } else {
            JOptionPane.showMessageDialog(this, "Error al eliminar");
        }
        }else if(!correo.equals("")){
            if (gestionUsuario.eliminarCorreo(correo)) {
            JOptionPane.showMessageDialog(this, "Eliminado exitosamente");
            limpiar();
            
        } else {
            JOptionPane.showMessageDialog(this, "Error al eliminar");
        }
        }
    }//GEN-LAST:event_btnEliminarMouseClicked

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        // TODO add your handling code here:
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
        ventana.listar();

        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    
       public void limpiar(){
        txtNombre.setText("");
       txtApellido.setText("");
       txtCedula.setText("");
       txtCorreo.setText("");
       txtContraseña.setText("");
    }
    
       
       public void cargarInformacion(List<String> temp) {
        txtCedula.setText(temp.get(0));
        txtNombre.setText(temp.get(1));
        txtApellido.setText(temp.get(2));
        txtCorreo.setText(temp.get(3));
        txtContraseña.setText(temp.get(4));

    }
       
//    public static void main(String args[]) {
//        <editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Windows".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(VentanaGestionDeuda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(VentanaGestionDeuda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(VentanaGestionDeuda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(VentanaGestionDeuda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        </editor-fold>
//        </editor-fold>
//        </editor-fold>
//        </editor-fold>
//
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new VentanaGestionDeuda().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtContraseña;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables

}
