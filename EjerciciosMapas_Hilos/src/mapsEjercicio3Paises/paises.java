/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mapsEjercicio3Paises;

/**
 *
 * @author Dcadavid1
 */
import java.util.*;
public class paises {
    public static void main(String[] args) {
        
        //CREANDO DEPARTAMENTOS
        //Creando mapa de departamentos de Colombia
        Map<Integer, String> Colombia = new HashMap<>();        
        Colombia.put(471, "Bolivar");
        Colombia.put(472, "Santander");
        Colombia.put(473, "Meta");
        
        //Creando mapa departamendos de Chile
        Map<Integer, String> Chile = new HashMap<>();
        Chile.put(831, "Freirina");
        Chile.put(832, "Cauquenes");
        Chile.put(833, "Rancagua");
        
        //Creando mapa departamento de Venezuela
        Map<Integer, String> Venezuela = new HashMap<>();
        Venezuela.put(581, "Apure");
        Venezuela.put(582, "Carabobo");
        Venezuela.put(583, "Barina");
        
        //CREANDO PAISES
        //Creando mapa de paises
        Map<String, Map> paises = new HashMap<>();
        
        paises.put("58", Venezuela);
        paises.put("83", Chile);
        paises.put("47", Colombia);
        
        //Imprimiendo Datos
        System.out.println("En el mapa existe " + paises.size() + " elementos con los siguientes paises: "  + paises);
        System.out.println("");
        
        System.out.println("En total existen los siguientes departamentos:");
        
        Map<String,String> departamentos = null;
        for (String listDepartamentos: paises.keySet()) {
            departamentos = paises.get(listDepartamentos);
            
            System.out.println("" + departamentos);
            
        }
        System.out.println("");
        System.out.println("Verificando si el departamento de Cesar Se encuentra en el mapa de Colombia ");
        if(Colombia.containsValue("Cesar")){
            
        
        }else{
            Colombia.put(474, "Cesar");
            System.out.println("Departamento agregado.. Cambios del Mapa Colombia " + Colombia);
        }
        
        
       //Agregar automaticamente 4 departamentos a venezuela
       int i = 1;
       if (Venezuela.size() <= 7){
       
       do {
            i = i+1;
                
               Venezuela.put(583+i, "Departamento Add ") ;
        
        } while (Venezuela.size() < 7);
           System.out.println("Agregados 4 departamentos a venezuela + " + Venezuela);
        
       
       }else{
       
       }
        
        
        
       
    }
//     
//        
        
        
    }
    
