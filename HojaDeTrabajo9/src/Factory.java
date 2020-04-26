
import java.util.HashMap;
import java.util.Map;

/**
 * @author Laura Tamath
 * @author Juan Marroquin
 *
 */
public class Factory<K extends Comparable<K>, V> {

    Arbol implement;

    public Factory() {
    }

    public InterfaceHDT9 getFactory(String tipo) {
        if ("1".equals(tipo)) {
            //Es un hash map
            return new Hash<K, V>();
        }
        if("2".equals(tipo)) {
            //Es un splay tree
            return new Hash<K, V>();
        }
        else{
             return null;
        }
    }
}
