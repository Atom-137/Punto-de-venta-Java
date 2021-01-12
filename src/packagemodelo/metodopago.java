/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packagemodelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import packageconexion.conexion;

/**
 *
 * @author Administrator
 */
public class metodopago {
    
    
    private int idmetodopago;
    private String nombre;

    public int getIdmetodopago() {
        return idmetodopago;
    }

    public void setIdmetodopago(int idmetodopago) {
        this.idmetodopago = idmetodopago;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

   
    
    
    public Vector<metodopago> mostrarMetodosPago(){
        
        PreparedStatement stmetodopago;
        ResultSet rsmetodopago;
        
        String querymetodopago = "SELECT idmetodopago,nombre FROM metodopago";
        
        Vector<metodopago> datospago = new Vector<metodopago>();
        
        metodopago datosmetodopago  = null;
        
          
        try {
          
            
            stmetodopago= conexion.getConection().prepareStatement(querymetodopago);
            rsmetodopago = stmetodopago.executeQuery();
            
            datosmetodopago = new metodopago();
            
            datosmetodopago.setIdmetodopago(0);
            datosmetodopago.setNombre("Seleccione un metodo de pago");
            
            datospago.add(datosmetodopago);
            
            while(rsmetodopago.next()){
                datosmetodopago = new metodopago();
                datosmetodopago.setIdmetodopago(rsmetodopago.getInt("idmetodopago"));
                datosmetodopago.setNombre(rsmetodopago.getString("nombre"));
                datospago.add(datosmetodopago);
                
            }
           
             
            
            
        }catch(SQLException ex){
            System.out.println(ex.toString());
        }
        
       
        
       return datospago; 
    }
    
     public String toString(){
        
        return this.nombre;
    }
    
}
