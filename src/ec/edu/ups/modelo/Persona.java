/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.edu.ups.modelo;

import javax.swing.JOptionPane;

/**
 *
 * @author José Quinde
 */
public class Persona {
    //Declaracion variables
   private String cedula;
   private String nombres;
   private String apellidos;
   private int edad;

    /**
     * Constructor vacio
     */
    public Persona() {
    }

    /**
     * Constructor con todos los datos
     */
    public Persona(String cedula, String nombres, String apellidos, int edad) {
        this.cedula = cedula;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula)throws Exception {
        //Valida que se ingrese 10 digitos
        if(cedula.length()==10){
            //Valida el numero de cedula
            if(ValidacionCedula.validacion(cedula)==true){
                this.cedula = cedula;
            }
            else{
                throw new Exception("Ingrese un numero de cedula correcto");
            }
            
        }
        else{
            throw new Exception("Ingrese un numero de cedula de 10 digitos");
        }
        
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres)throws Exception{  
        int cont=0;
    for (int i = 0; i <nombres.length ();i++) { 
        char c = nombres.charAt (i); 
        //Controla que no ingresen numeros en el nombre
       if(c=='1'||c=='2'||c=='3'||c=='4'||c=='5'||c=='6'||c=='7'||c=='8'||c=='9'||c=='0'){
          throw new Exception("Error al ingresar el Nombre----Ingrese solo letras y no numeros");
       }
       if(c==' '){
           cont++;                
       }
    }
    //Controla que se ingrese dos nombres
    if(cont==1){
      this.nombres = nombres;   
    }else{          
          throw new Exception("Se debe ingresar los dos Nombres");
       }
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos)throws Exception {      
         int cont=0;
    for (int i = 0; i <apellidos.length ();i++) { 
        char c = apellidos.charAt (i); 
        //Controla que no ingresen numeros en el apellido
       if(c=='1'||c=='2'||c=='3'||c=='4'||c=='5'||c=='6'||c=='7'||c=='8'||c=='9'||c=='0'){
          throw new Exception("Error al ingresar el Apellido----Ingrese solo letras y no numeros");
       }
       if(c==' '){
           cont++;                
       }
    }
    //Controla que se ingrese dos apellidos
    if(cont==1){
       this.apellidos = apellidos; 
    }else{          
          throw new Exception("Se debe ingresar los dos Apellidos");
       }
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona\n" + 
                "Cedula=" + cedula + 
                "\nNombres=" + nombres + 
                "\nApellidos=" + apellidos + 
                "\nEdad=" + edad ;
    }

    
   
}
