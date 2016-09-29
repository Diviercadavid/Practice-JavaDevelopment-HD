

package listassimples;

import java.util.*;



/**
 *
 * @author Dcadavid1
 */
public class ListasSimples {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    List<Object> ejemploLista;
    
        ejemploLista = new ArrayList<>();
        
        ejemploLista.add("Divier");
        ejemploLista.add(78);
        ejemploLista.add("Joaquin");
        ejemploLista.add("Andrea");
        ejemploLista.add(56);
       
        
        for (int i = 0; i < ejemploLista.size(); i++) {
            
        System.out.println(ejemploLista.subList(i, i+1)); 
              
        }
        
        ejemploLista.remove(1);
        ejemploLista.remove(3);
        System.out.println(ejemploLista);
        
    }
    
    
}
