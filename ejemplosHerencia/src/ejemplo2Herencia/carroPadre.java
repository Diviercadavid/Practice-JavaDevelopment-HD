/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo2Herencia;

public class carroPadre {
    private String nombre;
    private String dimenciones;
    private String color;
    private String motor;

    public void ruedas() {

    
    }
    public void informacionGeneral(){
        System.out.println("El Carro " + getNombre()+ " contiene 4 ruedas");
        
        System.out.println("El Carro " + nombre + " tiene las siguientes dimenciones: " + dimenciones);
        
        System.out.println("El Carro " + nombre + " es de color " + color);
        
        System.out.println("El Carro " + nombre + " esta equipado con el motor " + motor);
    
    }
   
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDimenciones() {
        return dimenciones;
    }

    public void setDimenciones(String dimenciones) {
        this.dimenciones = dimenciones;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

}
