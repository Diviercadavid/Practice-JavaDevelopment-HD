/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Maps;
import java.util.*;
/**
 *
 * @author Dcadavid1
 */



public class mapsEjemplo {
    
   public static void main(String[] args) {
       Map<String, Empleado> personal = new HashMap<String, Empleado>();
       
       personal.put("169", new Empleado("DC"));
        } 
}

    class Empleado{
      public Empleado (String n){
      nombre=n;
      sueldo = 2000;
      }
      public String toString(){
         
      return "[Nombre = " + nombre + ", sueldo= " + sueldo + "]";
      }
      
    private String nombre;
    private double sueldo;
    
    }
