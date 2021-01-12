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
public class JPBorrarUsuario extends javax.swing.JPanel {

    /**
     * Creates new form JPBorrarUsuario
     */
    
           PreparedStatement st;
           ResultSet rs;
           int idUsuario;
    public JPBorrarUsuario() {
        initComponents();
     
        
         //MOSTRAR TABLA USUARIOS
        try {
            String query="SELECT * FROM usuario";
            st= conexion.getConection().prepareStatement(query);
            rs = st.executeQuery();
            
            DefaultTableModel dfmusuarios = new DefaultTableModel();
    
            jTUsuarios.setModel(dfmusuarios);
            
            dfmusuarios.setColumnIdentifiers(new Object[] {"ID","NOMBRE","APELLIDO","DIRECCION","TELEFONO","CARGO","USUARIO","CONTRASEÑA","CORREO ELECTRONICO","CUI"});
            
            while(rs.next()){
                
                dfmusuarios.addRow(new Object[] {rs.getInt("idusuario"),rs.getString("nombre"),rs.getString("apellido"),rs.getString("direccion"),rs.getString("telefono"),rs.getString("cargo"),rs.getString("usuario"),rs.getString("contrasenia"),rs.getString("correoelectronico"),rs.getString("cui")});
                
            }
            
        } catch(SQLException ex){
            
            System.out.println(ex.toString());
        }
       //**************************************************** 
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
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTTNombreUsuarioBorrar = new javax.swing.JTextField();
        jTFApellidoUsuarioBorrar = new javax.swing.JTextField();
        jTFDireccionUsuarioBorrar = new javax.swing.JTextField();
        jTFTelefonoUsuarioBorrar = new javax.swing.JTextField();
        jTFCargoUsuarioBorrar = new javax.swing.JTextField();
        jTFUsuarioUsuarioBorrar = new javax.swing.JTextField();
        jTFContraseñaUsuarioBorrar = new javax.swing.JTextField();
        jTFCorreoUsuarioBorrar = new javax.swing.JTextField();
        jTFCuiUsuarioBorrar = new javax.swing.JTextField();
        jBCancelarUsuariosBorrar = new javax.swing.JButton();
        jBAceptarUsuariosBorrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTUsuarios = new javax.swing.JTable();

        setBackground(java.awt.Color.white);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setForeground(java.awt.Color.black);
        jLabel1.setText("Borrar Usuario");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 0, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectopuntodeventa/logo.png"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, -60, 240, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setForeground(java.awt.Color.black);
        jLabel3.setText("Nombre");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 150, -1, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setForeground(java.awt.Color.black);
        jLabel4.setText("Apellido");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 230, -1, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setForeground(java.awt.Color.black);
        jLabel5.setText("Direccion");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 310, -1, -1));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setForeground(java.awt.Color.black);
        jLabel6.setText("Telefono ");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 390, -1, -1));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel7.setForeground(java.awt.Color.black);
        jLabel7.setText("Cargo");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 460, -1, -1));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel8.setForeground(java.awt.Color.black);
        jLabel8.setText("Usuario");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 150, -1, -1));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel9.setForeground(java.awt.Color.black);
        jLabel9.setText("Contraseña");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 230, -1, -1));

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel10.setForeground(java.awt.Color.black);
        jLabel10.setText("Correo electronico");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 320, -1, -1));

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel11.setForeground(java.awt.Color.black);
        jLabel11.setText("CUI");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 390, -1, -1));

        jTTNombreUsuarioBorrar.setBackground(java.awt.Color.white);
        jTTNombreUsuarioBorrar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jTTNombreUsuarioBorrar.setForeground(java.awt.Color.black);
        add(jTTNombreUsuarioBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 180, 250, 30));

        jTFApellidoUsuarioBorrar.setBackground(java.awt.Color.white);
        jTFApellidoUsuarioBorrar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jTFApellidoUsuarioBorrar.setForeground(java.awt.Color.black);
        add(jTFApellidoUsuarioBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 270, 250, -1));

        jTFDireccionUsuarioBorrar.setBackground(java.awt.Color.white);
        jTFDireccionUsuarioBorrar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jTFDireccionUsuarioBorrar.setForeground(java.awt.Color.black);
        add(jTFDireccionUsuarioBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 350, 250, -1));

        jTFTelefonoUsuarioBorrar.setBackground(java.awt.Color.white);
        jTFTelefonoUsuarioBorrar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jTFTelefonoUsuarioBorrar.setForeground(java.awt.Color.black);
        add(jTFTelefonoUsuarioBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 420, 250, -1));

        jTFCargoUsuarioBorrar.setBackground(java.awt.Color.white);
        jTFCargoUsuarioBorrar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jTFCargoUsuarioBorrar.setForeground(java.awt.Color.black);
        add(jTFCargoUsuarioBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 490, 250, -1));

        jTFUsuarioUsuarioBorrar.setBackground(java.awt.Color.white);
        jTFUsuarioUsuarioBorrar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jTFUsuarioUsuarioBorrar.setForeground(java.awt.Color.black);
        add(jTFUsuarioUsuarioBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 180, 250, -1));

        jTFContraseñaUsuarioBorrar.setBackground(java.awt.Color.white);
        jTFContraseñaUsuarioBorrar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jTFContraseñaUsuarioBorrar.setForeground(java.awt.Color.black);
        add(jTFContraseñaUsuarioBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 270, 260, -1));

        jTFCorreoUsuarioBorrar.setBackground(java.awt.Color.white);
        jTFCorreoUsuarioBorrar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jTFCorreoUsuarioBorrar.setForeground(java.awt.Color.black);
        add(jTFCorreoUsuarioBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 350, 260, -1));

        jTFCuiUsuarioBorrar.setBackground(java.awt.Color.white);
        jTFCuiUsuarioBorrar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jTFCuiUsuarioBorrar.setForeground(java.awt.Color.black);
        add(jTFCuiUsuarioBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 420, 270, -1));

        jBCancelarUsuariosBorrar.setBackground(java.awt.Color.red);
        jBCancelarUsuariosBorrar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jBCancelarUsuariosBorrar.setForeground(java.awt.Color.black);
        jBCancelarUsuariosBorrar.setText("Cancelar");
        jBCancelarUsuariosBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCancelarUsuariosBorrarActionPerformed(evt);
            }
        });
        add(jBCancelarUsuariosBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 550, -1, -1));

        jBAceptarUsuariosBorrar.setBackground(java.awt.Color.green);
        jBAceptarUsuariosBorrar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jBAceptarUsuariosBorrar.setForeground(java.awt.Color.black);
        jBAceptarUsuariosBorrar.setText("Aceptar");
        jBAceptarUsuariosBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAceptarUsuariosBorrarActionPerformed(evt);
            }
        });
        add(jBAceptarUsuariosBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 550, -1, -1));

        jTUsuarios.setModel(new javax.swing.table.DefaultTableModel(
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
        jTUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTUsuariosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTUsuarios);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 660, 510));
    }// </editor-fold>//GEN-END:initComponents

    private void jTUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTUsuariosMouseClicked
        // TODO add your handling code here:
        int seleccionar = jTUsuarios.rowAtPoint(evt.getPoint());
        this.idUsuario = (int) jTUsuarios.getValueAt(seleccionar, 0);
        String nombre = (String) jTUsuarios.getValueAt(seleccionar,1);
        jTTNombreUsuarioBorrar.setText(nombre);
        String apellido = (String) jTUsuarios.getValueAt(seleccionar,2);
        jTFApellidoUsuarioBorrar.setText(apellido);
        String direccion = (String) jTUsuarios.getValueAt(seleccionar, 3);
        jTFDireccionUsuarioBorrar.setText(direccion);
        String telefono = (String) jTUsuarios.getValueAt(seleccionar, 4);
        jTFTelefonoUsuarioBorrar.setText(telefono);
        String cargo = (String) jTUsuarios.getValueAt(seleccionar, 5);
        jTFCargoUsuarioBorrar.setText(cargo);
        String usuario = (String) jTUsuarios.getValueAt(seleccionar, 6);
        jTFUsuarioUsuarioBorrar.setText(usuario);
        String contrasenia = (String) jTUsuarios.getValueAt(seleccionar, 7);
        jTFContraseñaUsuarioBorrar.setText(contrasenia);
        String correoelectronico = (String)jTUsuarios.getValueAt(seleccionar,8);
        jTFCorreoUsuarioBorrar.setText(correoelectronico);
        String cuiusuario = (String) jTUsuarios.getValueAt(seleccionar, 9);
        jTFCuiUsuarioBorrar.setText(cuiusuario);

    }//GEN-LAST:event_jTUsuariosMouseClicked

    private void jBAceptarUsuariosBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAceptarUsuariosBorrarActionPerformed
        // TODO add your handling code here:
        
        try {
            String queryborrar = "DELETE FROM usuario WHERE idusuario='"+idUsuario+"'";
            
            st=conexion.getConection().prepareStatement(queryborrar);
            st.executeUpdate();
            JOptionPane.showMessageDialog(null, "El usuario fue borrado con éxito", "!Aviso!", 2);
             //MOSTRAR TABLA USUARIOS
             try {
            String query="SELECT * FROM usuario";
            st= conexion.getConection().prepareStatement(query);
            rs = st.executeQuery();
            
            DefaultTableModel dfmusuarios = new DefaultTableModel();
    
            jTUsuarios.setModel(dfmusuarios);
            
            dfmusuarios.setColumnIdentifiers(new Object[] {"ID","NOMBRE","APELLIDO","DIRECCION","TELEFONO","CARGO","USUARIO","CONTRASEÑA","CORREO ELECTRONICO","CUI"});
            
            while(rs.next()){
                
                dfmusuarios.addRow(new Object[] {rs.getInt("idusuario"),rs.getString("nombre"),rs.getString("apellido"),rs.getString("direccion"),rs.getString("telefono"),rs.getString("cargo"),rs.getString("usuario"),rs.getString("contrasenia"),rs.getString("correoelectronico"),rs.getString("cui")});
                
            }
            
        } catch(SQLException ex){
            
            System.out.println(ex.toString());
        }
       //**************************************************** 
            jTTNombreUsuarioBorrar.setText("");
            jTFApellidoUsuarioBorrar.setText("");
            jTFDireccionUsuarioBorrar.setText("");
            jTFTelefonoUsuarioBorrar.setText("");
            jTFCargoUsuarioBorrar.setText("");
            jTFUsuarioUsuarioBorrar.setText("");
            jTFContraseñaUsuarioBorrar.setText("");
            jTFCorreoUsuarioBorrar.setText("");
            jTFCuiUsuarioBorrar.setText("");
            
            
            
        }catch(SQLException ex){
            
            System.out.println(ex.toString());
        }
    }//GEN-LAST:event_jBAceptarUsuariosBorrarActionPerformed

    private void jBCancelarUsuariosBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCancelarUsuariosBorrarActionPerformed
        // TODO add your handling code here:
        
             jTTNombreUsuarioBorrar.setText("");
            jTFApellidoUsuarioBorrar.setText("");
            jTFDireccionUsuarioBorrar.setText("");
            jTFTelefonoUsuarioBorrar.setText("");
            jTFCargoUsuarioBorrar.setText("");
            jTFUsuarioUsuarioBorrar.setText("");
            jTFContraseñaUsuarioBorrar.setText("");
            jTFCorreoUsuarioBorrar.setText("");
            jTFCuiUsuarioBorrar.setText("");
    }//GEN-LAST:event_jBCancelarUsuariosBorrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAceptarUsuariosBorrar;
    private javax.swing.JButton jBCancelarUsuariosBorrar;
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
    private javax.swing.JTextField jTFApellidoUsuarioBorrar;
    private javax.swing.JTextField jTFCargoUsuarioBorrar;
    private javax.swing.JTextField jTFContraseñaUsuarioBorrar;
    private javax.swing.JTextField jTFCorreoUsuarioBorrar;
    private javax.swing.JTextField jTFCuiUsuarioBorrar;
    private javax.swing.JTextField jTFDireccionUsuarioBorrar;
    private javax.swing.JTextField jTFTelefonoUsuarioBorrar;
    private javax.swing.JTextField jTFUsuarioUsuarioBorrar;
    private javax.swing.JTextField jTTNombreUsuarioBorrar;
    private javax.swing.JTable jTUsuarios;
    // End of variables declaration//GEN-END:variables
}
