package guia6.ejercicio10;

import java.util.ArrayList;
import java.util.Comparator;

public class MultiSortedCollectionImpl<T> implements MultiSortedCollection<T> {
    private ArrayList<Comparator<T>> comparators;

    @Override
    public void add(Comparator<T> comp) {
        comparators.add(comp);
    }

    @Override
    public void add(T elem) {

    }

    @Override
    public void remove(T elem) {

    }

    @Override
    public Iterable<T> iterable(Comparator<T> comp) {
        return null;
    }
}
