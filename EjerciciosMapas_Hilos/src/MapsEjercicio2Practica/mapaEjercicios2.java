/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MapsEjercicio2Practica;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class mapaEjercicios2 {
    public static void main(String[] args){
        List<String> listaTelefonosCesar = new ArrayList<>();
        listaTelefonosCesar.add("3106379801");
        listaTelefonosCesar.add("3106379802");
        listaTelefonosCesar.add("3106379803");
        
        List<String> listaTelefonosDivier = new ArrayList<>();
        listaTelefonosDivier.add("3205679897");
        listaTelefonosDivier.add("3205679898");
        listaTelefonosDivier.add("3205679899");
        
        Map<String,List<String>> mapa = new HashMap<>();
        mapa.put("Cesar", listaTelefonosCesar);
        mapa.put("Diver", listaTelefonosDivier);
        
        List<String> listaInterna = null;
        
        for(String user : mapa.keySet()){
            listaInterna = mapa.get(user);
            
            if(user.equals("Cesar")){
                listaInterna.set(0, "3222222222");
                listaInterna.add("38888888");
            }else{
                listaInterna.add("3555555555");
            }
            mapa.put(user, listaInterna);
        }
        
        if(mapa.containsKey("Sebastian")){
            System.out.println("ohhhh continene a sebatian");
        }else if(!mapa.containsKey("Diver")){
            List<String> interna = mapa.get("Divier");
            interna.add("3123454566");
            mapa.put("Diver", interna);
        }else if(mapa.containsKey("Cesar")){
            List<String> interna = mapa.get("Cesar"); 
            for(String telefono : interna){
                telefono = telefono + " :D";
                System.out.println("telefono: " + telefono);
            }
            
            System.out.println("lista normal: "+listaInterna);
        }
    }
}
