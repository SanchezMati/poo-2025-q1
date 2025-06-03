package guia7.ejercicio7;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class SortedMapImpl<K extends Comparable<? super K>,V> extends TreeMap<K,V> implements SortedMap<K,V> {
    @Override
    public K firstKey() {
        return getFirstEntry().getKey();
    }

    @Override
    public V firstValue() {
        return getFirstEntry().getValue();
    }

    private Map.Entry<K,V> getFirstEntry() {
        return iterator().next();
    }

    @Override
    public Iterator<Map.Entry<K, V>> iterator() {
        return entrySet().iterator();
    }
}
