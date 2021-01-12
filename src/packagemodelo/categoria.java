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
public class categoria {
    private int idcategoria;
    private String nombre;
    
    public int getIdcategoria() {
        return idcategoria;
    }

    public void setIdcategoria(int idcategoria) {
        this.idcategoria = idcategoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
   
    public Vector<categoria> mostrarCategorias(){
        
        PreparedStatement stcategoria;
        ResultSet rscategoria;
        
        String querycategoria="SELECT idcategoria,nombre FROM categoria ";
        
        Vector<categoria> datosCategoria = new Vector<categoria>();
        
        categoria datos = null;
        try{
            stcategoria= conexion.getConection().prepareStatement(querycategoria);
            rscategoria = stcategoria.executeQuery();
            
            datos = new categoria();
            
            datos.setIdcategoria(0);
            datos.setNombre("Seleccione una opción ");
            datosCategoria.add(datos);
            
            while(rscategoria.next()){
                datos = new categoria();
                datos.setIdcategoria(rscategoria.getInt("idcategoria"));
                datos.setNombre(rscategoria.getString("nombre"));
                datosCategoria.add(datos);
            }
            
            
            
        }catch(SQLException ex){
            
            System.out.println(ex.toString());
            
        }
        
         
        return datosCategoria;
    }
    
    public String toString(){
        
        return this.nombre;
    }
   
    
    
}
