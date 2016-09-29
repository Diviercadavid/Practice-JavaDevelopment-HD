/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilosPractica3;

/**
 *
 * @author Dcadavid1
 */
public class semaforo {

    public static void main(String[] args) {

        procesoSemaforo hilo1, hilo2, hilo3;

        hilo1 = new procesoSemaforo("Amarillo", 10*100);

        hilo2 = new procesoSemaforo("Rojo", 1*100);
        
        hilo3 = new procesoSemaforo("Verde", 20*100);

        hilo1.start();
        hilo2.start();
        hilo3.start();
        
    }
}
