
package ejemploarraylist;

import java.util.ArrayList;

public class EjemploArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Declaramos Array
        ArrayList<String> cadenas;
        String resultado = "";
        
        //Creamos instancias 
        cadenas = new ArrayList<>();
        
        //Indica "Capacidad del Array" libera memoria
        cadenas.ensureCapacity(5);
        

        //Agregar elementos
        cadenas.add("Hola ");
        cadenas.add("Como ");
        cadenas.add("Estas ");
        cadenas.add("Que ");
        cadenas.add("Haces? ");
        
        
        for (int i = 0; i < cadenas.size(); i++) {
            resultado = resultado + cadenas.get(i);
            
        }
        cadenas.add(1, "Divier " );
        System.out.println(resultado);
        System.out.println("Contenido de la cadena" + cadenas);
    }
    
}
