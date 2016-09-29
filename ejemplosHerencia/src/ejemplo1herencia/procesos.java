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
public class procesos {
    public void iniciar(){
    
    Humano adulto = new Humano();
    adulto.setnombre("Fredy");
    adulto.comer(adulto.getNombre());
    adulto.dormir();
    
        System.out.println("");
        
        Hombre padre = new Hombre();
        padre.setnombre("Nicolas");
        padre.comer(padre.getNombre());
        padre.dormir();
        padre.afeitarse();
        
        System.out.println("");
        
        Mujer madre = new Mujer();
        madre.setnombre("Gloria");
        madre.comer(madre.getNombre());
        madre.dormir();
        madre.maquillarse(madre.getNombre());
        
    
    }
}
