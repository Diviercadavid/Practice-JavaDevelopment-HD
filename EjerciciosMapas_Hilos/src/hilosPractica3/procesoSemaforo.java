/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilosPractica3;


    

public class procesoSemaforo extends Thread{
    
    private String color;
    private int tiempo;
    
    public procesoSemaforo(String color, Integer tiempo ){
    this.color = color;
    this.tiempo = tiempo;
    
    }
    
    public void run(){
    
        try {
            sleep(tiempo);
        
        }
        catch(InterruptedException e){
        
        }
        System.out.println(color);
    }

    
}