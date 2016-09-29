/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplohilos;

/**
 *
 * @author Dcadavid1
 */
public class EjemploHilos {


    public static void main(String[] args) {
      
        Thread hilo = new Proceso("Proceso 1");
        Thread hilo2 = new Proceso("Proceso 2");
        
        hilo.start();
        hilo2.start();
        
    }
    
}
