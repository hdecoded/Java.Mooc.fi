import java.util.List;

public class HashMap<K, V> {
    private List<Pair<K,V>>[] values;
    private int firstFreeIndex = 0;


    public V get(K key) {
        int hashValue = Math.abs(key.hashCode() % this.values.length);
        if (this.values[hashValue] == null) {
            return null;
        }

        List<Pair<K, V>> valuesAtIndex = this.values[hashValue];

        for (int i = 0; i < valuesAtIndex.size(); i++) {
            if (valuesAtIndex.get(i).equals(key)){
                return valuesAtIndex.get(i).getValue();
            }
        }

        return null;
    }

    public void add(K key, V value) {
        int hashValue = Math.abs(key.hashCode() % values.length);
        if (values[hashValue] == null) {
        }

        List<Pair<K, V>> valuesAtIndex = values[hashValue];

    }
}
