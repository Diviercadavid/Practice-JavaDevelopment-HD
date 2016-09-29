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
public class carroCamioneta extends carroPadre {

    
//    public void Informaciongeneral(){
//    
//    System.out.println("El Carro " + getNombre()+ " contiene 4 ruedas");
//    
//    }
    public void traccion(){
        System.out.println("El carro " + getNombre() + " tiene traccion de 4X4");
}    

    @Override
    public void informacionGeneral() {
        super.informacionGeneral(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
