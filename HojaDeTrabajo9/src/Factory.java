import java.util.HashMap;
import java.util.Map;
/**
 * @author Laura Tamath
 * @author Juan Marroquin
 * 
 */
public class Factory<E> {
    Arbol implement;
     public Factory() {
    }
    public Arbol getTree(String entry) {
    // seleccion de la implementacion a utilizar:
        
        if(entry.equals("HashMap"))
        {
         //   implement =  new HashMap<>();
        }else if(entry.equals("Splay Tree"))
        {
            implement = new SplayTree<>();
        }
        
        return implement;      
   }
}
