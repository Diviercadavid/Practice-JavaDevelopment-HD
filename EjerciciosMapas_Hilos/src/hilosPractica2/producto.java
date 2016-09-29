/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilosPractica2;

/**
 *
 * @author Dcadavid1
 */
public class producto extends Thread{
    private String nombre;
    private int procesos;
    public producto (String Nombre, Integer procesos){
    
        this.nombre = Nombre;
        this.procesos=procesos;
    
    }
    
    public void run(){
        
        for (int i = 0; i < procesos * 5; i++) {
            
            
            
            
        }
        System.out.println(this.nombre + " " + this.procesos);
        
    }
}
