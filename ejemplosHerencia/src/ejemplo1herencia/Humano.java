/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo1herencia;

/**
 *
 * @author Dcadavid1
 */
public class Humano {
    private String nombre; 

    public void comer(String nombre){
    
        System.out.println(nombre +" Esta comiendo desde la clase humano");
    }
    
    public void dormir(){
        System.out.println(nombre +" Esta durmiendo desde la clase humano");
    
    }
    
    public void setnombre(String nombre){
    this.nombre=nombre;
    
    }
    public String getNombre(){
    return nombre;
    }
}
