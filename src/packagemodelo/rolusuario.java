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
public class rolusuario {
    
    
    private int idrol;
    private String nombre;

    public int getIdrol() {
        return idrol;
    }

    public void setIdrol(int idrol) {
        this.idrol = idrol;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
    public Vector<rolusuario> mostrarRoles(){
        
        PreparedStatement strol;
        ResultSet rsrol;
        
        
        String queryrol = "SELECT idrol,nombre FROM rol";
        
        Vector<rolusuario> datosrol = new Vector<rolusuario>();
        
        rolusuario datos = null;
        
        try {
            strol=conexion.getConection().prepareStatement(queryrol);
            
            rsrol = strol.executeQuery();
            
            datos = new rolusuario();
            
            datos.setIdrol(0);
            datos.setNombre("Elija un rol");
            
            datosrol.add(datos);
            
            
            while(rsrol.next()){
                datos = new rolusuario();
                datos.setIdrol(rsrol.getInt("idrol"));
                datos.setNombre(rsrol.getString("nombre"));
                datosrol.add(datos);

            }
            
            
            
        }catch(SQLException ex){
            
            System.out.println(ex.toString());
            
           
        }
        
        return datosrol;
    }
    
     public String toString(){
        
        return this.nombre;
    }
    
    
}
