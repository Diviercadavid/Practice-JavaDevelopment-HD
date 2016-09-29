/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejemplo2ArrayList;

import java.util.*;

public class Ejemplo2ArrayList {
    
    public static void main(String[] args) {
    ArrayList<String> paises = new ArrayList<>();
    paises.add("Venezuela");
    paises.add("Argentina");
    paises.add("Colombia");
    paises.add("Mexico");
    paises.add("Chile");
    
        System.out.println("Lista Inicial de paises: " + paises);
        
        paises.remove(0);
        paises.remove(3);
        
        System.out.println("");
        System.out.println("Eliminados 2 paises: " + paises);
        
        
        System.out.println("");
        System.out.println("Pais Selecionado en la posicion 1: " + paises.get(1));
        
        
        paises.set(0, "Peru");
        System.out.println("");
        System.out.println("Cambiando de Argentina a Peru " + paises);        
        
    }
    
    
    
    
}
