/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Persona;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;

/**
 *
 * @author José Quinde
 */
public class ControladorPersonadb {
    private BaseDeDatos db;

    public ControladorPersonadb() {
        db=new BaseDeDatos();
    }
    
    public void create(Persona p){
        SimpleDateFormat sd=new SimpleDateFormat("yyyy-MM-dd");        
        String fecha=sd.format(p.getFechaNacimiento());
        String sql="INSERT INTO \"PERSONA\" VALUES ('"
                                                    +p.getCedula()+"','"
                                                    +p.getNombres()+"','"
                                                    +p.getApellidos()+"',"
                                                    +p.getEdad()+",'"
                                                    +fecha+"','"
                                                    +p.getNumeroTelefono()+"',"
                                                    +p.getSalario()+")";
        db.conectar();
        try{
        Statement sta=db.getConexionDb().createStatement();
        sta.execute(sql);
        db.desconectar();
        }catch(SQLException ex){
            ex.printStackTrace();
        }
        
    }
    
    public void update(Persona p,String cedula){
        SimpleDateFormat sd=new SimpleDateFormat("yyyy-MM-dd");
        String fecha=sd.format(p.getFechaNacimiento());
        String sql= "UPDATE \"PERSONA\" SET " +                                                   
                                                "\"PER_NOMBRE\"='" +p.getNombres()+"',"+
                                                "\"PER_APELLIDO\"='" +p.getApellidos()+"',"+
                                                 "\"PER_EDAD\"="+p.getEdad()+","+
                                                  "\"PER_FECHA_NACIMIENTO\"='" +fecha+"',"+
                                                   "\"PER_CELULAR\"='"+p.getNumeroTelefono()+"',"+
                                                    "\"PER_SALARIO\"="+p.getSalario()
                +" WHERE"+" \"PER_CEDULA\"="+"'"+cedula+"'";
        System.out.println(sql);
         db.conectar();
        try{
        Statement sta=db.getConexionDb().createStatement();
        sta.execute(sql);
        db.desconectar();
        }catch(SQLException ex){
            ex.printStackTrace();
        }
                
    }
    public void delete(String cedula){
        String sql="DELETE FROM  \"PERSONA\" WHERE"+" \"PER_CEDULA\"= "+"'"+cedula+"'";
        System.out.println(sql);
         db.conectar();
        try{
        Statement sta=db.getConexionDb().createStatement();
        sta.execute(sql);
        db.desconectar();
        }catch(SQLException ex){
            ex.printStackTrace();
        }
    }
    
}
