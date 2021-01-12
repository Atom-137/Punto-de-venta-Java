/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectopuntodeventa;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import packageconexion.conexion;

/**
 *
 * @author Administrator
 */
public class JPMetodoPago extends javax.swing.JPanel {

    /**
     * Creates new form JPMetodoPago
     */
    public JPMetodoPago() {
        initComponents();
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jBCancelarMetodoPago = new javax.swing.JButton();
        jBAceptarMetodoPago = new javax.swing.JButton();
        jTFNombreMetodoPago = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTADescripcionMetodoPago = new javax.swing.JTextArea();

        setBackground(java.awt.Color.white);
        setForeground(java.awt.Color.black);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectopuntodeventa/logo.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, -10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel2.setForeground(java.awt.Color.black);
        jLabel2.setText("Metodos de pago");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 30, -1, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setForeground(java.awt.Color.black);
        jLabel3.setText("Nombre");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, -1, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setForeground(java.awt.Color.black);
        jLabel4.setText("Descripcion");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 250, -1, -1));

        jBCancelarMetodoPago.setBackground(java.awt.Color.red);
        jBCancelarMetodoPago.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jBCancelarMetodoPago.setForeground(java.awt.Color.black);
        jBCancelarMetodoPago.setText("Cancelar");
        jBCancelarMetodoPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCancelarMetodoPagoActionPerformed(evt);
            }
        });
        add(jBCancelarMetodoPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 390, -1, -1));

        jBAceptarMetodoPago.setBackground(java.awt.Color.green);
        jBAceptarMetodoPago.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jBAceptarMetodoPago.setForeground(java.awt.Color.black);
        jBAceptarMetodoPago.setText("Acpetar");
        jBAceptarMetodoPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAceptarMetodoPagoActionPerformed(evt);
            }
        });
        add(jBAceptarMetodoPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 390, -1, -1));

        jTFNombreMetodoPago.setBackground(java.awt.Color.white);
        jTFNombreMetodoPago.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jTFNombreMetodoPago.setForeground(java.awt.Color.black);
        add(jTFNombreMetodoPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 140, 280, -1));

        jTADescripcionMetodoPago.setBackground(java.awt.Color.white);
        jTADescripcionMetodoPago.setColumns(20);
        jTADescripcionMetodoPago.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jTADescripcionMetodoPago.setForeground(java.awt.Color.black);
        jTADescripcionMetodoPago.setRows(5);
        jScrollPane1.setViewportView(jTADescripcionMetodoPago);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 240, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jBAceptarMetodoPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAceptarMetodoPagoActionPerformed
        // TODO add your handling code here:
        
        
        PreparedStatement consulta;
        ResultSet resultado;
        
         String nombre = jTFNombreMetodoPago.getText();
        String descripcion = jTADescripcionMetodoPago.getText();
       //********************************************************
       //VALIDACION
        if (nombre.trim().equals("")){
            
            JOptionPane.showMessageDialog(null, "Debe ingresar un nombre","ERROR",2);
            
            
        }else if (descripcion.trim().equals("")){
            JOptionPane.showMessageDialog(null, "Debe ingresar una descripcion","ERROR",2);
            
            
        }
        //****************************************************************************************
        else {
            
             try {
            String query = "INSERT INTO metodopago(nombre,descripcion) VALUES ('"+nombre+"','"+descripcion+"')";
            
            consulta = conexion.getConection().prepareStatement(query);
            consulta.executeUpdate();
            jTFNombreMetodoPago.setText("");
            jTADescripcionMetodoPago.setText("");
            
            
            
            }catch(SQLException excepcion){

                System.out.println(excepcion.toString());
            }
        }

        
    }//GEN-LAST:event_jBAceptarMetodoPagoActionPerformed

    private void jBCancelarMetodoPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCancelarMetodoPagoActionPerformed
        // TODO add your handling code here:
        
        jTFNombreMetodoPago.setText("");
        jTADescripcionMetodoPago.setText("");
            
    }//GEN-LAST:event_jBCancelarMetodoPagoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAceptarMetodoPago;
    private javax.swing.JButton jBCancelarMetodoPago;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTADescripcionMetodoPago;
    private javax.swing.JTextField jTFNombreMetodoPago;
    // End of variables declaration//GEN-END:variables
}
