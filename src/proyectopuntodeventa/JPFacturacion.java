/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectopuntodeventa;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import packageconexion.conexion;
import packagemodelo.metodopago;

/**
 *
 * @author Administrator
 */
public class JPFacturacion extends javax.swing.JPanel {

    /**
     * Creates new form JPFacturacion
     */ 
    
        PreparedStatement st;
        ResultSet rs;
        //VARIABLES PARA DETALLE FACTURA Y FACTURA
        String nombreProducto;
        int existenciaProducto;
        double precioVentaProducto;
        
        //*****************************************
        //VARIABLE PARA GUARDAR EL ID DEL USUARIO LOGEADO Y EL ID DEL CLIENTE
        
        JPLogin obtenerid = new JPLogin();
      
        int idusuario;
      
        int idCliente;
        //***************************************************
        DefaultTableModel dfmDetalleFactura = new DefaultTableModel();
        
        int idfact=generarNumeroFactura()+1;
          
    public JPFacturacion() {
        initComponents();
        //MOSTRAR METODOS DE PAGO
        metodopago metodosdepago = new metodopago();
        DefaultComboBoxModel modelopago = new DefaultComboBoxModel(metodosdepago.mostrarMetodosPago());
        jCBMetodoPago.setModel(modelopago);
        //*************************************
        //MOSTRAR FECHA 
        Calendar today = Calendar.getInstance();
        int dia= today.get(Calendar.DAY_OF_MONTH);
        int mes = today.get(Calendar.MONTH)+1;
        int anio = today.get(Calendar.YEAR);
        String diaa = String.valueOf(dia);
        String mess= String.valueOf(mes);
        String anioo = String.valueOf(anio);
        jTFFechaFactura.setText(diaa+"/ " + mess +"/ "+anioo);
        //****************************************************************
        //TABLA AL INICIO
        jTDetallesFactura.setModel(dfmDetalleFactura);
        dfmDetalleFactura.setColumnIdentifiers(new Object[] {"NUMERO","CODIGO","DESCRIPCION","CANTIDAD","PRECIO","TOTAL"});
        //*******************************************************************************************
        //Nombre de quien atendio
        idusuario=obtenerid.getIduser();
        String nomUsuario= nombreusuario();
//        jTFNombreUsuario.setText(nomUsuario);
       
     
       
       //numero de factura
       jTFFacturaNo.setText("00000000"+String.valueOf(idfact));
       
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
        jTFFacturaNo = new javax.swing.JTextField();
        jTFFechaFactura = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTFNITClienteFactura = new javax.swing.JTextField();
        jTFNombreClienteFactura = new javax.swing.JTextField();
        jTFDireccionClienteFactura = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jTFSubtotalFactura = new javax.swing.JTextField();
        jTFIvaFactura = new javax.swing.JTextField();
        jTFTotalPagarFactura = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jBCancelarFactura = new javax.swing.JButton();
        jBIGenerarVenta = new javax.swing.JButton();
        jCBMetodoPago = new javax.swing.JComboBox<>();
        jBBuscarCliente = new javax.swing.JButton();
        jTFCodigoProducto = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jBBuscarProducto = new javax.swing.JButton();
        jTFNombreProducto = new javax.swing.JTextField();
        jBAgregarProducto = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jTFExistencia = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jSCantidadProducto = new javax.swing.JSpinner();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTDetallesFactura = new javax.swing.JTable();

        setBackground(java.awt.Color.white);
        setForeground(java.awt.Color.black);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectopuntodeventa/logo.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 0, 250, 200));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(java.awt.Color.black);
        jLabel2.setText("Ferreteria RASH");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, -1, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setForeground(java.awt.Color.black);
        jLabel3.setText("Zona 1, Quetzaltenango, Guatemala");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, -1, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setForeground(java.awt.Color.black);
        jLabel4.setText("NIT 32154864");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, -1, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setForeground(java.awt.Color.black);
        jLabel5.setText("Tel. 77664578 - 45678954");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, -1, -1));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setForeground(java.awt.Color.red);
        jLabel6.setText("Factura No.");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 20, -1, -1));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel7.setForeground(java.awt.Color.black);
        jLabel7.setText("Fecha");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 60, -1, -1));

        jTFFacturaNo.setEditable(false);
        jTFFacturaNo.setBackground(java.awt.Color.white);
        jTFFacturaNo.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jTFFacturaNo.setForeground(java.awt.Color.black);
        add(jTFFacturaNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 20, 150, -1));

        jTFFechaFactura.setEditable(false);
        jTFFechaFactura.setBackground(java.awt.Color.white);
        jTFFechaFactura.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jTFFechaFactura.setForeground(java.awt.Color.black);
        add(jTFFechaFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 60, 150, -1));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel8.setForeground(java.awt.Color.black);
        jLabel8.setText("INGRESAR CLIENTE");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 130, -1, -1));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel9.setForeground(java.awt.Color.black);
        jLabel9.setText("NIT");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 170, -1, -1));

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel10.setForeground(java.awt.Color.black);
        jLabel10.setText("Nombre");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 210, -1, -1));

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel11.setForeground(java.awt.Color.black);
        jLabel11.setText("Direccion");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 260, -1, -1));

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel12.setForeground(java.awt.Color.black);
        jLabel12.setText("Metodo de pago");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 300, -1, -1));

        jTFNITClienteFactura.setBackground(java.awt.Color.white);
        jTFNITClienteFactura.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jTFNITClienteFactura.setForeground(java.awt.Color.black);
        add(jTFNITClienteFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 160, 210, -1));

        jTFNombreClienteFactura.setEditable(false);
        jTFNombreClienteFactura.setBackground(java.awt.Color.white);
        jTFNombreClienteFactura.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jTFNombreClienteFactura.setForeground(java.awt.Color.black);
        add(jTFNombreClienteFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 210, 210, -1));

        jTFDireccionClienteFactura.setEditable(false);
        jTFDireccionClienteFactura.setBackground(java.awt.Color.white);
        jTFDireccionClienteFactura.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jTFDireccionClienteFactura.setForeground(java.awt.Color.black);
        add(jTFDireccionClienteFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 260, 210, -1));

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel13.setForeground(java.awt.Color.black);
        jLabel13.setText("Subtotal");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 450, -1, -1));

        jLabel14.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel14.setForeground(java.awt.Color.black);
        jLabel14.setText("IVA");
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 490, -1, -1));

        jLabel15.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel15.setForeground(java.awt.Color.black);
        jLabel15.setText("TOTAL A PAGAR");
        add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 530, -1, -1));

        jTFSubtotalFactura.setEditable(false);
        jTFSubtotalFactura.setBackground(java.awt.Color.white);
        jTFSubtotalFactura.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jTFSubtotalFactura.setForeground(java.awt.Color.black);
        add(jTFSubtotalFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 440, 120, -1));

        jTFIvaFactura.setEditable(false);
        jTFIvaFactura.setBackground(java.awt.Color.white);
        jTFIvaFactura.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jTFIvaFactura.setForeground(java.awt.Color.black);
        add(jTFIvaFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 480, 120, -1));

        jTFTotalPagarFactura.setEditable(false);
        jTFTotalPagarFactura.setBackground(java.awt.Color.white);
        jTFTotalPagarFactura.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jTFTotalPagarFactura.setForeground(java.awt.Color.black);
        add(jTFTotalPagarFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 520, 120, -1));

        jLabel16.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel16.setForeground(java.awt.Color.black);
        jLabel16.setText("Vuelve pronto :)");
        add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 650, -1, -1));

        jBCancelarFactura.setBackground(java.awt.Color.red);
        jBCancelarFactura.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jBCancelarFactura.setForeground(java.awt.Color.black);
        jBCancelarFactura.setText("Cancelar");
        add(jBCancelarFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 580, -1, -1));

        jBIGenerarVenta.setBackground(java.awt.Color.green);
        jBIGenerarVenta.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jBIGenerarVenta.setForeground(java.awt.Color.black);
        jBIGenerarVenta.setText("Generar Venta");
        jBIGenerarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBIGenerarVentaActionPerformed(evt);
            }
        });
        add(jBIGenerarVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 580, -1, -1));

        jCBMetodoPago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(jCBMetodoPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 300, 210, -1));

        jBBuscarCliente.setText("BUSCAR");
        jBBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarClienteActionPerformed(evt);
            }
        });
        add(jBBuscarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 160, -1, -1));

        jTFCodigoProducto.setBackground(java.awt.Color.white);
        jTFCodigoProducto.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jTFCodigoProducto.setForeground(java.awt.Color.black);
        jTFCodigoProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFCodigoProductoActionPerformed(evt);
            }
        });
        add(jTFCodigoProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 310, 170, -1));

        jLabel18.setBackground(java.awt.Color.white);
        jLabel18.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel18.setForeground(java.awt.Color.black);
        jLabel18.setText("CODIGO DEL PRODUCTO:");
        add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, -1, -1));

        jBBuscarProducto.setBackground(java.awt.Color.green);
        jBBuscarProducto.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jBBuscarProducto.setForeground(java.awt.Color.black);
        jBBuscarProducto.setText("Buscar");
        jBBuscarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarProductoActionPerformed(evt);
            }
        });
        add(jBBuscarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 310, -1, -1));

        jTFNombreProducto.setEditable(false);
        jTFNombreProducto.setBackground(java.awt.Color.white);
        jTFNombreProducto.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jTFNombreProducto.setForeground(java.awt.Color.black);
        add(jTFNombreProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 360, 280, 40));

        jBAgregarProducto.setBackground(java.awt.Color.orange);
        jBAgregarProducto.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jBAgregarProducto.setForeground(java.awt.Color.black);
        jBAgregarProducto.setText("Agregar Producto");
        jBAgregarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAgregarProductoActionPerformed(evt);
            }
        });
        add(jBAgregarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 360, 190, 40));

        jLabel19.setBackground(java.awt.Color.white);
        jLabel19.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel19.setForeground(java.awt.Color.black);
        jLabel19.setText("Nombre:");
        add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 90, -1));

        jLabel20.setBackground(java.awt.Color.white);
        jLabel20.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel20.setForeground(java.awt.Color.black);
        jLabel20.setText("Existencia:");
        add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, -1, -1));

        jTFExistencia.setEditable(false);
        jTFExistencia.setBackground(java.awt.Color.white);
        jTFExistencia.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jTFExistencia.setForeground(java.awt.Color.black);
        add(jTFExistencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 400, 280, -1));

        jLabel21.setBackground(java.awt.Color.white);
        jLabel21.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel21.setForeground(java.awt.Color.black);
        jLabel21.setText("Cantidad: ");
        add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 370, -1, -1));

        jSCantidadProducto.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        add(jSCantidadProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 360, 80, -1));

        jTDetallesFactura.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTDetallesFactura);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, 870, 200));
    }// </editor-fold>//GEN-END:initComponents

   
    public String nombreusuario(){
        
       
        String nombre="";
        String apellido="";
                
        try {
            String query = "SELECT * FROM usuario WHERE idusuario='"+idusuario+"'";
            st=conexion.getConection().prepareStatement(query);
            rs=st.executeQuery();
            
            if(rs.next()){
                nombre=rs.getString("nombre");
                apellido = rs.getString("apellido");
            }
            
            
        }catch(SQLException ex){
            System.out.println(ex.toString());
            
        }
        
      
     return nombre+" "+apellido;   
    }
    
    
    public int generarNumeroFactura(){
        int idfactura=0;
        try{
            String query = "SELECT * FROM `factura`";
            st=conexion.getConection().prepareStatement(query);
            rs=st.executeQuery();
            
            if(rs.last()){
                idfactura=rs.getInt("idfactura");
            }
               
        }catch(SQLException ex){
            System.out.println(ex.toString());
            
        }
        
        return idfactura;
    }
    public void generarTotal(){
        
        //GENERAR SUBTOTAL,IVA,TOTAL,
        double subtotal=0;
        
        for(int i=0; i<jTDetallesFactura.getRowCount();i++){
                double totaldetallefactura=Double.parseDouble(jTDetallesFactura.getValueAt(i, 5).toString());
                subtotal+=totaldetallefactura;
                
        }
        jTFSubtotalFactura.setText(String.valueOf(subtotal));
        //IVA
        double iva= Math.round(subtotal*0.12);
        double total= subtotal+iva;
        //*******************************************************
        //MOSTRARLOS EN LOS TEXTFIELD
        jTFSubtotalFactura.setText(String.valueOf(subtotal));
        jTFIvaFactura.setText(String.valueOf(iva));
        jTFTotalPagarFactura.setText(String.valueOf(total));
        
        //***************
        
        String fecha=jTFFechaFactura.getText();
        int usuario_idusuario=idusuario;
        int cliente_idcliente=idCliente;
        metodopago metodospago = (metodopago) jCBMetodoPago.getSelectedItem();
        int metodopago_idmetodopago=metodospago.getIdmetodopago();
        
   }
    
    private void jBBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarClienteActionPerformed
        // TODO add your handling code here:
        
        //PreparedStatement st;
        //ResultSet rs;
        String nombre;
        String apellido;
        String direccion;
        
        String nitcliente= jTFNITClienteFactura.getText();
        String querynitcliente="SELECT * FROM cliente WHERE nit='"+nitcliente+"'";
        
        try {
            
            st = conexion.getConection().prepareStatement(querynitcliente);
            rs= st.executeQuery();
            
            if(rs.next()){
                
                nombre= rs.getString("nombre");
                direccion = rs.getString("direccion");
                apellido = rs.getString("apellido");
                jTFNombreClienteFactura.setText(nombre+" "+apellido);
                jTFDireccionClienteFactura.setText(direccion);
                idCliente=rs.getInt("idcliente");
                
            }
            
            else{
                
                JOptionPane.showMessageDialog(null,"ERROR\n CLIENTE NO ENCONTRADO\n"+"Debe crear el cliente","INFO",2);
            }
        }catch(SQLException ex){
            System.out.println(ex.toString());
            
        }

    }//GEN-LAST:event_jBBuscarClienteActionPerformed

    private void jTFCodigoProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFCodigoProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFCodigoProductoActionPerformed

    private void jBAgregarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAgregarProductoActionPerformed
        // TODO add your handling code here:
        
        
        int numero = 1;
       
        String codigoProducto=jTFCodigoProducto.getText();
        String descripcion=jTFNombreProducto.getText();
        int cantidad=(int)jSCantidadProducto.getValue();
        double precio=precioVentaProducto;
        double total= cantidad*precio;
        
       
        for(int i=0; i<jTDetallesFactura.getRowCount();i++){
           
            numero+=1;
             
       }
        dfmDetalleFactura.addRow(new Object[]{numero,codigoProducto,descripcion,cantidad,precio,total});
        
        generarTotal();  
        
          
         
         
    }//GEN-LAST:event_jBAgregarProductoActionPerformed

    private void jBBuscarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarProductoActionPerformed
        // TODO add your handling code here:
        
        String idproducto = jTFCodigoProducto.getText();
                
        try{
            String queryBuscarProducto="SELECT * FROM producto WHERE idproducto = '"+idproducto+"'";
            st = conexion.getConection().prepareStatement(queryBuscarProducto);
            rs = st.executeQuery();
            
            if (rs.next()){
                
                nombreProducto = rs.getString("nombre");
                existenciaProducto = rs.getInt("existencia");
                precioVentaProducto = rs.getDouble("precioventa");
                jTFNombreProducto.setText(nombreProducto);
                String existenciaMostrar = String.valueOf(existenciaProducto);
                jTFExistencia.setText(existenciaMostrar);
                
                
            }else {
                JOptionPane.showMessageDialog(null,"Este producto no existe\n Debe crearlo en la seccion productos","Info",2);
            }
            
            
            
        }catch(SQLException ex){
            
            System.out.println(ex.toString());
        }
        
    }//GEN-LAST:event_jBBuscarProductoActionPerformed

    private void jBIGenerarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBIGenerarVentaActionPerformed
        // TODO add your handling code here:
            //generarFactura();
            //generarDetalleFactura();
            
            jTFCodigoProducto.setText("");
            jTFNITClienteFactura.setText("");
            jTFNombreProducto.setText("");
            jTFExistencia.setText("");
            jTFNombreClienteFactura.setText("");
            jTFDireccionClienteFactura.setText("");
            jSCantidadProducto.setValue(0);
            jTFSubtotalFactura.setText("");
            jTFIvaFactura.setText("");
            jTFTotalPagarFactura.setText("");
            jTFFacturaNo.setText("00000000"+String.valueOf(idfact+1));
            //BORRAR DATOS DE LA TABLA
            dfmDetalleFactura.setRowCount(0);
           
             //********************************************
           
            
            
            
                   
    }//GEN-LAST:event_jBIGenerarVentaActionPerformed

    public void generarDetalleFactura(){
            
                int idproducto;
                int idfactu;
                int cantidad;
                double precio;
                double total;
            for(int i=0; i<jTDetallesFactura.getRowCount();i++){
                
                idproducto= Integer.parseInt(jTDetallesFactura.getValueAt(i, 1).toString());
                idfactu=generarNumeroFactura();
                cantidad= Integer.parseInt(jTDetallesFactura.getValueAt(i, 3).toString());
                precio= Double.parseDouble(jTDetallesFactura.getValueAt(i, 4).toString());
                total= Double.parseDouble(jTDetallesFactura.getValueAt(i, 5).toString());
                
            
                
           
              try {
                String query = "INSERT INTO detallefactura(producto_idproducto,factura_idfactura,cantidad,precio,total) "
                        + "VALUES('"+idproducto+"','"+idfactu+"','"+cantidad+"','"+precio+"','"+total+"')";
                
                st=conexion.getConection().prepareStatement(query);
                st.executeUpdate();
    
                
                
            }catch(SQLException ex){
                System.out.println(ex.toString());
            }
                         }
        
           
    
    }
    public void generarFactura(){
            String fecha=jTFFechaFactura.getText();
            String subtotal=jTFSubtotalFactura.getText();
            String iva = jTFIvaFactura.getText();
            String total = jTFTotalPagarFactura.getText();
            int idus= idusuario;
            int idclient= idCliente; 
            metodopago metodosPago = (metodopago) jCBMetodoPago.getSelectedItem();
            int idmetodopago=  metodosPago.getIdmetodopago();
           //ENVIAR A LA TABLA FACTURA
            try{
                String query = "INSERT INTO factura(fecha,subtotal,iva,total,usuario_idusuario,cliente_idcliente,metodopago_idmetodopago)"
                        + "VALUES ('"+fecha+"','"+subtotal+"','"+iva+"','"+total+"','"+idus+"','"+idclient+"','"+idmetodopago+"')";
                
                st=conexion.getConection().prepareStatement(query);
                st.executeUpdate();
                     
            }catch(SQLException ex){
                
                System.out.println(ex.toString());
            }
    }
    
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAgregarProducto;
    private javax.swing.JButton jBBuscarCliente;
    private javax.swing.JButton jBBuscarProducto;
    private javax.swing.JButton jBCancelarFactura;
    private javax.swing.JButton jBIGenerarVenta;
    private javax.swing.JComboBox<String> jCBMetodoPago;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSpinner jSCantidadProducto;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTDetallesFactura;
    private javax.swing.JTextField jTFCodigoProducto;
    private javax.swing.JTextField jTFDireccionClienteFactura;
    private javax.swing.JTextField jTFExistencia;
    private javax.swing.JTextField jTFFacturaNo;
    private javax.swing.JTextField jTFFechaFactura;
    private javax.swing.JTextField jTFIvaFactura;
    private javax.swing.JTextField jTFNITClienteFactura;
    private javax.swing.JTextField jTFNombreClienteFactura;
    private javax.swing.JTextField jTFNombreProducto;
    private javax.swing.JTextField jTFSubtotalFactura;
    private javax.swing.JTextField jTFTotalPagarFactura;
    // End of variables declaration//GEN-END:variables
}
