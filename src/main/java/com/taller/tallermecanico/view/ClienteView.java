
package com.taller.tallermecanico.view;

import com.taller.tallermecanico.dao.ClienteDao;
import com.taller.tallermecanico.model.Cliente;
import javax.swing.JOptionPane;

/**
 * Ventana de gestión de clientes para crear y gestionar registros de clientes.
 * Esta ventana proporciona una interfaz de formulario para ingresar información del cliente
 * (nombre, teléfono, vehículo) e incluye validación para la entrada del número de teléfono.
 * 
 * @author rafaelvales
 */
public class ClienteView extends javax.swing.JFrame {

    /**
     * Crea una nueva instancia de ClienteView e inicializa los componentes de la interfaz gráfica.
     * Configura la validación de entrada para restringir el campo de teléfono solo a entrada numérica.
     */
    public ClienteView() {
        initComponents();
        TFInputTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
    @Override
    public void keyTyped(java.awt.event.KeyEvent evt) {
        char c = evt.getKeyChar();
        if (!Character.isDigit(c) && c != '\b') {
            evt.consume(); 
        }
    }
});
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TFInputTelefono = new javax.swing.JTextField();
        TFInputNombre = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        Vehiculo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestor de Cliente");

        jLabel1.setText("Nombre:");

        jLabel2.setText("Telefono:");

        TFInputTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFInputTelefonoActionPerformed(evt);
            }
        });

        TFInputNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFInputNombreActionPerformed(evt);
            }
        });

        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Listar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Cancelar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Menu");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel3.setText("Vehiculo:");

        Vehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VehiculoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addGap(18, 18, 18)
                            .addComponent(Vehiculo))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(TFInputNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(TFInputTelefono))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(TFInputNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TFInputTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Vehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton1)
                    .addComponent(jButton4))
                .addGap(59, 59, 59))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Maneja el evento de acción para el campo de texto del nombre.
     * Actualmente no se realiza ninguna acción.
     *
     * @param evt el evento de acción que activó este método
     */
    private void TFInputNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFInputNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFInputNombreActionPerformed

    /**
     * Maneja el evento de acción para el campo de texto del teléfono.
     * Actualmente no se realiza ninguna acción.
     *
     * @param evt el evento de acción que activó este método
     */
    private void TFInputTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFInputTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFInputTelefonoActionPerformed

    /**
     * Maneja el evento de acción para el botón de listar.
     * Abre la vista de lista de clientes y cierra la ventana actual.
     *
     * @param evt el evento de acción que activó este método
     */
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    new ListaClienteView().setVisible(true);   
    this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * Maneja el evento de acción para el botón de cancelar.
     * Solicita confirmación al usuario antes de salir de la aplicación.
     *
     * @param evt el evento de acción que activó este método
     */
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
int confirm = JOptionPane.showConfirmDialog(
        this,
        "¿Estás seguro de que querés salir de la aplicación?",
        "Salir",
        JOptionPane.YES_NO_OPTION
    );

    if (confirm == JOptionPane.YES_OPTION) {
        System.exit(0); 
    }       // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * Maneja el evento de acción para el botón de menú.
     * Regresa a la vista del menú principal y cierra la ventana actual.
     *
     * @param evt el evento de acción que activó este método
     */
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       MainView main = new MainView();
        main.setVisible(true);
        this.dispose(); 
    }//GEN-LAST:event_jButton4ActionPerformed

    /**
     * Maneja el evento de acción para el botón de guardar.
     * Valida los campos de entrada, crea un nuevo objeto cliente y lo guarda en la base de datos.
     * Muestra mensajes de éxito o error según corresponda y limpia el formulario en caso de éxito.
     *
     * @param evt el evento de acción que activó este método
     */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String nombre = TFInputNombre.getText();
    String telefono = TFInputTelefono.getText();
    String vehiculo = Vehiculo.getText();

    if (nombre.isEmpty() || vehiculo == null || vehiculo.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Debe completar el nombre y el vehículo.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }
    if (!telefono.matches("\\d+")) {
    JOptionPane.showMessageDialog(this, "El teléfono solo debe contener números.", "Error", JOptionPane.ERROR_MESSAGE);
    return;
}

    Cliente cliente = new Cliente();
    cliente.setNombre(nombre);
    cliente.setTelefono(telefono);
    cliente.setVehiculo(vehiculo);

    ClienteDao.guardarCliente(cliente);

    JOptionPane.showMessageDialog(this, " Cliente guardado correctamente.");
    
    
    TFInputNombre.setText("");
    TFInputTelefono.setText("");
    Vehiculo.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * Maneja el evento de acción para el campo de texto del vehículo.
     * Actualmente no se realiza ninguna acción.
     *
     * @param evt el evento de acción que activó este método
     */
    private void VehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VehiculoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_VehiculoActionPerformed

    
    /**
     * Método principal para lanzar la ventana ClienteView.
     * Configura el aspecto Nimbus y muestra la ventana de gestión de clientes.
     *
     * @param args los argumentos de línea de comandos (no se utilizan)
     */
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ClienteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClienteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClienteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClienteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClienteView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TFInputNombre;
    private javax.swing.JTextField TFInputTelefono;
    private javax.swing.JTextField Vehiculo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
