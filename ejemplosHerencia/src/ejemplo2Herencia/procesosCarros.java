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
public class procesosCarros extends carroPadre{

    public void iniciar(){
        // Creando carro normal
        carroPadre SprintGT = new carroPadre();
        SprintGT.setNombre("Sprint GT");
        SprintGT.setMotor("Motor de velocidad 70% ");
        SprintGT.setDimenciones("Length	150.0 in (4,00 mm) | Width	90.5 in (2,250 mm)");
        SprintGT.setColor("Azul");
        SprintGT.informacionGeneral();

        System.out.println("");

        //Creando carro de carreras!
        carroCarreras viper = new carroCarreras();
        viper.setNombre("VIPER GT");
        viper.setColor("Negro");
        viper.setDimenciones("Length	175.1 in (4,450 mm) | Width	75.7 in (1,920 mm)");
        viper.setMotor("Motor de velocidad (El mas rapido)");
        viper.informacionGeneral();
        viper.turbo();
        viper.suspencion();

        System.out.println("");
        //Creando Carro furgoneta 
        carroFurgoneta Furgo2016 = new carroFurgoneta();
        Furgo2016.setNombre("Furgonet2016");
        Furgo2016.setMotor("Motor de velocidad 50%");
        Furgo2016.setDimenciones("Length	175.1 in (4,450 mm) | Width	75.7 in (1,920 mm)");
        Furgo2016.setColor("Gris");
        Furgo2016.informacionGeneral();
        Furgo2016.capacidad();

        System.out.println("");
        // Creando Carro Camioneta
        carroCamioneta Hilux = new carroCamioneta();
        Hilux.setNombre("Hiluz 2017");
        Hilux.setMotor("Motor de velocidad de 60");
        Hilux.setDimenciones("Length	250.0 in (5,840 mm) | Width	80.7 in (2,980 mm)");
        Hilux.setColor("Negro");
        Hilux.informacionGeneral();
        Hilux.traccion();
    }
}
