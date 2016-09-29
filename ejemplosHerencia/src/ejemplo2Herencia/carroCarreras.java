/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo2Herencia;

/**
 *
 * @author Dcadavid1
 */
public class carroCarreras extends carroPadre{
    
    public void turbo(){
    
        System.out.println("El carro " + getNombre() +" tiene turbo");
    
    }
    
    public void suspencion(){
    
        System.out.println("El carro " + getNombre() + " Tiene suspencion");
    }
    
    
}
