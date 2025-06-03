package guia7.ejercicio6;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class MultiMapImpl<K, V extends Comparable<? super V>> implements MultiMap<K, V> {
    private final Map<K, Set<V>> map = new HashMap<>();


    @Override
    public void put(K key, V value) {
        map.putIfAbsent(key, new TreeSet<>(Comparator.reverseOrder()));
        map.get(key).add(value);
    }

    @Override
    public int size() {
        int toReturn = 0;
        for(Set<V> set : map.values()){
            toReturn += set.size();
        }
        return toReturn;
    }

    @Override
    public int size(K key) {
        return map.getOrDefault(key, new TreeSet<>()).size();
    }

    @Override
    public void remove(K key) {
        map.remove(key);
    }

    @Override
    public void remove(K key, V value) {
        map.getOrDefault(key, new TreeSet<>()).remove(value);
    }

    @Override
    public Iterable<V> get(K key) {
        return map.get(key);
    }
}
