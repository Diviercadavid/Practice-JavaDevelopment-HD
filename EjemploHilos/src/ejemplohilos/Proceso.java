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
public class Proceso extends Thread{
 public Proceso (String msg){
 
 super(msg);
 
 }
 public void run(){
     
     
     for (int i = 0; i < 2; i++) {
         System.out.println();
     }
     
 }
    
}
