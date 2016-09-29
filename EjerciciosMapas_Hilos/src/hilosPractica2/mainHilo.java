/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilosPractica2;

import hilosPractica1.proceso;

/**
 *
 * @author Dcadavid1
 */
public class mainHilo {
    public static void main(String[] args) {
        
        producto Moto, Automovil, Bus;
        
        Moto = new producto("Moto", 3500);
        Automovil = new producto("Automovil ", 1500);
        Bus = new producto("Bus", 10000);
         Moto.start();
         Automovil.start();
         Bus.start();
        
        
    }
}
