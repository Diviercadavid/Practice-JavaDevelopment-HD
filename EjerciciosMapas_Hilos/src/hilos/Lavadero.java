/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilos;

/**
 *
 * @author THEINGRO
 */
public class Lavadero extends Thread {

    private String nombre;
    private Integer tiempo;
    
    public Lavadero(String n, Integer t) {
        nombre = n;
        tiempo = t;
    }
    
    public void run() {
        
        try {
            sleep(tiempo);
        } catch (InterruptedException e) {
        }
        
        
        System.out.println("Terminado: "+nombre+" tiempo: "+tiempo);
    }
    
}
