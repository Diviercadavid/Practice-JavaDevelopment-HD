/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilosPractica1;

/**
 *
 * @author Dcadavid1
 */
public class hilos {
    public static void main(String[] args) {
        
        proceso Hilo1 = new proceso("Paso 1", 1562865234);
        
        proceso Hilo2 = new proceso("Paso 2", 1);
        
        proceso Hilo3 = new proceso("Paso 3", 1000);
        
         
        
        
        Hilo1.start();
        Hilo2.start();
        Hilo3.start();
        
    }
    
    
}
