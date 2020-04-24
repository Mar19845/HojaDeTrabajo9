import java.util.HashMap;
import java.util.Map;
/**
 * @author Laura Tamath
 * @author Juan Marroquin
 * 
 */
public class Factory {
     public Factory() {
    }
    public static Map<String, String[]> obtenerMap(String opcion){
        switch (opcion){
            case "1":
                return new HashMap<>();
            case "2":
                //return new HashMap<>();
                //poner el splay tree
           
            default:
                return null;
        }
    }
}
