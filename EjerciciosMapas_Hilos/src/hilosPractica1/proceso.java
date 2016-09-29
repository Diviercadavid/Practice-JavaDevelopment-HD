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
public class proceso extends Thread{
    
    private String Nom;
    private int val;
    private int Resul;
    
    public proceso (String Nombre, Integer Valor){
        
        Nom = Nombre;
       val = Valor;
       
        Resul = Valor * 168;
    
    }

  

    
    public void run(){
        for (int i = 0; i < Resul; i++) {
            
        }
        System.out.println("Nombre del proceso: " + Nom +" Valor del proceso: " + val + " Resultado : " + Resul);
    
    }
    
}
