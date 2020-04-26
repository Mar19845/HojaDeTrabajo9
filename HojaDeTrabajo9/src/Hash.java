
import java.util.HashMap;

/**
 *
 * @author Juan Marroquin
 */
public class Hash<K extends Comparable<K>, V> implements InterfaceHDT9<K, V> {

    private HashMap<K, V> data;

    public Hash() {
        this.data = new HashMap<K, V>();
    }

    @Override
    public V remove(K key) {
        return data.remove(key);
    }

    @Override
    public V put(Association<K, V> association) {
        return data.put((K) association.getKey(), (V) association.getValue());
    }

    @Override
    public int size() {
        return data.size();
    }

    @Override
    public boolean searchValue(K searched) {
        if (data.containsKey(searched)) {
            return true;
        }
        return false;
    }

    @Override
    public V get(K key) {
        return data.get(key);
    }

}
