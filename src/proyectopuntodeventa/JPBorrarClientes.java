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
import javax.swing.table.DefaultTableModel;
import packageconexion.conexion;

/**
 *
 * @author Administrator
 */
public class JPBorrarClientes extends javax.swing.JPanel {

    /**
     * Creates new form JPBorrarClientes
     */
    
    PreparedStatement st;
    ResultSet rs;
    int idCliente;
    
    
    public JPBorrarClientes() {
        initComponents();
        //**MOSTRAR TABLA CLIENTES
        try {
            String query = "SELECT * FROM cliente";
            
            st= conexion.getConection().prepareStatement(query);
            rs = st.executeQuery();
            
            DefaultTableModel dfmcliente = new DefaultTableModel();
            
            jTClientes.setModel(dfmcliente);
            dfmcliente.setColumnIdentifiers(new Object[] {"ID","NOMBRE","APELLIDO", "NIT", "DIRECCION","TELEFONO"});

            while (rs.next()){
             
                
                dfmcliente.addRow(new Object[] {rs.getInt("idcliente"),rs.getString("nombre"),rs.getString("apellido"),rs.getString("nit"),rs.getString("direccion"),rs.getString("telefono")});
            }
            
        }catch(SQLException ex){
            
            System.out.println(ex.toString());
            
        }
        
        //*************************************************************************
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
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTFApellidoClienteBorrar = new javax.swing.JTextField();
        jTFNitClienteBorrarr = new javax.swing.JTextField();
        jTFDireccionClienteBorrar = new javax.swing.JTextField();
        jTFTelefonoClienteBorrar = new javax.swing.JTextField();
        jBCancelarClienteBorrar = new javax.swing.JButton();
        jBHechoClienteBorrar = new javax.swing.JButton();
        jTFNombreClienteBorrar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTClientes = new javax.swing.JTable();

        setBackground(java.awt.Color.white);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(java.awt.Color.black);
        jLabel1.setText("BORRAR CLIENTE");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 20, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectopuntodeventa/logo.png"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, -20, 300, 260));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel3.setForeground(java.awt.Color.black);
        jLabel3.setText("Nombre");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 40, -1, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel4.setForeground(java.awt.Color.black);
        jLabel4.setText("Apellido");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 130, -1, 30));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel5.setForeground(java.awt.Color.black);
        jLabel5.setText("NIT");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 220, -1, -1));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel6.setForeground(java.awt.Color.black);
        jLabel6.setText("Direccion");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 300, -1, -1));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel7.setForeground(java.awt.Color.black);
        jLabel7.setText("Telefono");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 390, -1, -1));

        jTFApellidoClienteBorrar.setBackground(java.awt.Color.white);
        jTFApellidoClienteBorrar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jTFApellidoClienteBorrar.setForeground(java.awt.Color.black);
        add(jTFApellidoClienteBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 170, 300, 40));

        jTFNitClienteBorrarr.setBackground(java.awt.Color.white);
        jTFNitClienteBorrarr.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jTFNitClienteBorrarr.setForeground(java.awt.Color.black);
        add(jTFNitClienteBorrarr, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 260, 300, 40));

        jTFDireccionClienteBorrar.setBackground(java.awt.Color.white);
        jTFDireccionClienteBorrar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jTFDireccionClienteBorrar.setForeground(java.awt.Color.black);
        add(jTFDireccionClienteBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 340, 310, 40));

        jTFTelefonoClienteBorrar.setBackground(java.awt.Color.white);
        jTFTelefonoClienteBorrar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jTFTelefonoClienteBorrar.setForeground(java.awt.Color.black);
        add(jTFTelefonoClienteBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 420, 310, 40));

        jBCancelarClienteBorrar.setBackground(java.awt.Color.red);
        jBCancelarClienteBorrar.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jBCancelarClienteBorrar.setForeground(java.awt.Color.black);
        jBCancelarClienteBorrar.setText("Cancelar");
        jBCancelarClienteBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCancelarClienteBorrarActionPerformed(evt);
            }
        });
        add(jBCancelarClienteBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 530, 170, 70));

        jBHechoClienteBorrar.setBackground(java.awt.Color.green);
        jBHechoClienteBorrar.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jBHechoClienteBorrar.setForeground(java.awt.Color.black);
        jBHechoClienteBorrar.setText("Hecho");
        jBHechoClienteBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBHechoClienteBorrarActionPerformed(evt);
            }
        });
        add(jBHechoClienteBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 530, 170, 70));

        jTFNombreClienteBorrar.setBackground(java.awt.Color.white);
        jTFNombreClienteBorrar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jTFNombreClienteBorrar.setForeground(java.awt.Color.black);
        add(jTFNombreClienteBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 80, 300, 40));

        jTClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTClientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTClientes);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 760, 470));
    }// </editor-fold>//GEN-END:initComponents

    private void jTClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTClientesMouseClicked
        // TODO add your handling code here:

         int seleccionar = jTClientes.rowAtPoint(evt.getPoint());
         this.idCliente = (int) jTClientes.getValueAt(seleccionar, 0);
         String nombre = (String) jTClientes.getValueAt(seleccionar, 1);
         jTFNombreClienteBorrar.setText(nombre);
         String apellido = (String) jTClientes.getValueAt(seleccionar,2);
         jTFApellidoClienteBorrar.setText(apellido);
         String nitCliente = (String) jTClientes.getValueAt(seleccionar, 3);
         jTFNitClienteBorrarr.setText(nitCliente);
         String direccion = (String) jTClientes.getValueAt(seleccionar,4);
         jTFDireccionClienteBorrar.setText(direccion);
         String telefono = (String) jTClientes.getValueAt(seleccionar, 5);
         jTFTelefonoClienteBorrar.setText(telefono);
      
    }//GEN-LAST:event_jTClientesMouseClicked

    private void jBHechoClienteBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBHechoClienteBorrarActionPerformed
        // TODO add your handling code here:
        
        try {
            String queryborrar = "DELETE FROM cliente WHERE idcliente ='"+idCliente+"'";
            
            st = conexion.getConection().prepareStatement(queryborrar);
            st.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "El clinete fue borrado con  éxito", "!Aviso!",2);
            
            jTFNombreClienteBorrar.setText("");
            jTFApellidoClienteBorrar.setText("");
            jTFNitClienteBorrarr.setText("");
            jTFDireccionClienteBorrar.setText("");
            jTFTelefonoClienteBorrar.setText("");
            
            //**MOSTRAR TABLA CLIENTES
        try {
            String query = "SELECT * FROM cliente";
            
            st= conexion.getConection().prepareStatement(query);
            rs = st.executeQuery();
            
            DefaultTableModel dfmcliente = new DefaultTableModel();
            
            jTClientes.setModel(dfmcliente);
            dfmcliente.setColumnIdentifiers(new Object[] {"ID","NOMBRE","APELLIDO", "NIT", "DIRECCION","TELEFONO"});

            while (rs.next()){
             
                
                dfmcliente.addRow(new Object[] {rs.getInt("idcliente"),rs.getString("nombre"),rs.getString("apellido"),rs.getString("nit"),rs.getString("direccion"),rs.getString("telefono")});
            }
            
        }catch(SQLException ex){
            
            System.out.println(ex.toString());
            
        }
        
        //*************************************************************************
            
            
            
            
        }catch(SQLException ex){
             System.out.println(ex.toString());
        }
    }//GEN-LAST:event_jBHechoClienteBorrarActionPerformed

    private void jBCancelarClienteBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCancelarClienteBorrarActionPerformed
        // TODO add your handling code here:
        
            jTFNombreClienteBorrar.setText("");
            jTFApellidoClienteBorrar.setText("");
            jTFNitClienteBorrarr.setText("");
            jTFDireccionClienteBorrar.setText("");
            jTFTelefonoClienteBorrar.setText("");
    }//GEN-LAST:event_jBCancelarClienteBorrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCancelarClienteBorrar;
    private javax.swing.JButton jBHechoClienteBorrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTClientes;
    private javax.swing.JTextField jTFApellidoClienteBorrar;
    private javax.swing.JTextField jTFDireccionClienteBorrar;
    private javax.swing.JTextField jTFNitClienteBorrarr;
    private javax.swing.JTextField jTFNombreClienteBorrar;
    private javax.swing.JTextField jTFTelefonoClienteBorrar;
    // End of variables declaration//GEN-END:variables
}
