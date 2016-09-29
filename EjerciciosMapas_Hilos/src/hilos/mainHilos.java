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
public class mainHilos {
    public static void main(String[] args){
        Lavadero l1,l2,l3;
        
        l1 = new Lavadero("Camion", 20*1000);
        l2 = new Lavadero("twingo", 10*1000);
        l3 = new Lavadero("Toyota Padro", 15*1000);
        
        l1.start();
        l2.start();
        l3.start();
    }
}
