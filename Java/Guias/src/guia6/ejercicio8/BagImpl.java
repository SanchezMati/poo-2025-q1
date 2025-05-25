package guia6.ejercicio8;

import java.util.*;

public class BagImpl<E> implements Bag<E> {

    private Map<E, Integer> map = new HashMap<>();

    @Override
    public void add(E elem) {
        if(map.containsKey(elem)) {
            map.put(elem, map.get(elem)+1);
            return ;
        }
        map.put(elem, 1);
    }

    @Override
    public int count(E elem) {
        if(!map.containsKey(elem)){
            return 0;
        }
        return map.get(elem);
    }

    @Override
    public int size() {
        int toReturn = 0;
        for (int i : map.values()) {
            toReturn += i;
        }
        return toReturn;
    }

    @Override
    public int sizeDistinct() {
        return map.size();
    }

    @Override
    public boolean contains(E elem) {
        return map.containsKey(elem);
    }

    @Override
    public void remove(E elem) {
        if(!map.containsKey(elem)){
            throw new NoSuchElementException();
        }
        map.put(elem, map.get(elem) - 1);
        if(map.get(elem) == 0){
            map.remove(elem);
        }
    }
}
