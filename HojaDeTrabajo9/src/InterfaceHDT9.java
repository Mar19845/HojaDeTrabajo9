
/**
 * @author Laura Tamath 19365
 * @author Juan Marroquin
 * @param <Key>
 * clase que crea una interface entre el hash y el splay tree
 */
public interface InterfaceHDT9<K extends Comparable<K>, V> {
    /**
     * pre: El queue no esta vacio
     * post: Se remueve y retorna el valor mas pequeno dentro del queue
     * @param key
     * @return 
     */
    public V remove(K key);
    /**
     * Pre: Valor a agregar
     * Post: Se agrega un valor al queue
     * @param association
     * @return 
     */
    public V put(Association<K,V> association);
    /**
     * Retorna el tamaño del arbol
     * @return 
     */
    
    public int size();
    /**
     * busca una key y retorna true si esxiste y false si no esta
     * @param searched
     * @return 
     */
   
    public boolean searchValue(K searched);
    /**
     * busca una key y retorna un value
     * @param key
     * @return 
     */
    public V get(K key);
}
