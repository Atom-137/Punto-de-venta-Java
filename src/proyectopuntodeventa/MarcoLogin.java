
package proyectopuntodeventa;

import javax.swing.JFrame;


public class MarcoLogin extends JFrame {
    
    
    
    public MarcoLogin(){
        //Establecer tamaño
       // setSize(500,600);
        //agregar titulo 
        //ubicacion, ancho alto 
        //LOGIN Y MENU
     setBounds(300,100,740,400);
     //RESTO DEL PROGRAMA
      
        //INICIAR EN VENTANA COMPLETA (Resto del programa
        //setExtendedState(MAXIMIZED_BOTH);
        setTitle("Iniciar Sesion");
        //setVisible(true);
        //Terminar el programa cuando se cierra la ventana
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //No se puede cambiar el tamaño
        //setResizable(false);
        
      JPLogin login = new JPLogin();
       
       add(login);
       
      // JPMenu Menu = new JPMenu();
     // add(Menu);
      //GESTIONAR PROVEEDOR
      //JPGestionarProveedores proveedores = new JPGestionarProveedores();
      //add(proveedores);
       //JPProducto producto = new JPProducto();
       //add (producto);
       
       //LISTA PROVEEDORES
       //JPListaProveedores listadoProveedores = new JPListaProveedores();
      // add (listadoProveedores);
      //LISTA CLIENTES
      //JPListadoClientes listadoClientes = new JPListadoClientes();
      //add(listadoClientes);
      //GESTIONAR CLIENTE
      //JPGestionarClientes gestionarClientes = new JPGestionarClientes();
      
      //add (gestionarClientes);
      
      
        
    }
    
}
