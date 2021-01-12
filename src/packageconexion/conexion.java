/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packageconexion;

import java.sql.Connection;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.SQLException;
import java.util.logging.Logger;
import java.util.logging.Level;

/**
 *
 * @author Administrator
 */
public class conexion {
    
    private static String servername="localhost";
    private static String username="root";
    private static String dbname="proyectojava";
    private static Integer portnumber=3306;
    private static String password="";
    
    public static Connection getConection(){
        
        Connection conexion = null;
        MysqlDataSource datasource= new MysqlDataSource();
        
        datasource.setServerName(servername);
        datasource.setUser(username);
        datasource.setPassword(password);
        datasource.setDatabaseName(dbname);
        datasource.setPortNumber(portnumber);
        
        try {
            //System.out.println("conexion exitosa");
            conexion=datasource.getConnection();
            
        }catch(SQLException ex){
            
            Logger.getLogger("Obtener conexion: "+ conexion.class.getName()).log(Level.SEVERE,null,ex);
            //System.out.println("conexion fallida");
        }
        
        return conexion;
        
        
    }
    
    
}
