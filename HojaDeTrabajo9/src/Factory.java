
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
        if (tipo == "1") {
            //Es un hash map
            return new Hash<>();
        }
        if(tipo == "2") {
            //Es un splay tree
            //return new Hash<>();
            return new SplayTree();
        }
        else{
             return null;
        }
    }

    Arbol getTree(String hashMap) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
