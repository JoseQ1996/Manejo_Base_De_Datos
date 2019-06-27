/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.edu.ups.controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jose Quinde
 */
public class BaseDeDatos {
    private Connection conexionDb;

    public BaseDeDatos() {
    }

    public Connection getConexionDb() {
        return conexionDb;
    }
    
    public void conectar(){
        String url="jdbc:postgresql://localhost:5432/MiBaseDeDatos";
        String user="postgres";
        String password="Flako031996";
        try {
            conexionDb=DriverManager.getConnection(url,user,password);
           if (conexionDb.isValid(5000)){
               System.out.println("Conexion Exitosa");
           }
        } catch (SQLException ex) {
            ex.printStackTrace();        
        }
    }
    public void desconectar(){
        try {
            if(conexionDb.isClosed()){
                conexionDb.close();
                System.out.println("Conexion Cerrada");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
}
