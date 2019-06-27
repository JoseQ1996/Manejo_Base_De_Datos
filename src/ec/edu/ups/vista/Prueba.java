/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.edu.ups.vista;

import ec.edu.ups.controlador.ControladorPersonadb;
import ec.edu.ups.modelo.Persona;
import java.util.Date;

/**
 *
 * @author José Quinde
 */
public class Prueba {
    public static void main(String[] args) {
        Persona p=new Persona("0107551012", "CARLOS SEBASTIAN","CONDOR PADILLA",19,"0991352595",new java.util.Date(),200.35);
        ControladorPersonadb db=new ControladorPersonadb();
        db.update(p, "0102072442");
                
    }
}
