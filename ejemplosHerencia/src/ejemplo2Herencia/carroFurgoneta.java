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
public class carroFurgoneta extends carroPadre{
    
    
    public void capacidad(){
    
        System.out.println("El Carro " + getNombre() +"Tiene capacidad de 741 KG" );
    
//        carroPadre inf = new carroPadre();
//        inf.informacionGeneral();
//        
        }
        
    @Override
    public void informacionGeneral() {
        super.informacionGeneral(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
