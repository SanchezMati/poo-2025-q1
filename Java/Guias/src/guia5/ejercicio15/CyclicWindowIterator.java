package guia5.ejercicio15;

import com.sun.source.tree.YieldTree;

import java.util.Iterator;

public class CyclicWindowIterator<T> implements Iterator<T[]> {

    private T[] array;
    private int windowSize;
    private int index;

    public CyclicWindowIterator(T[] array, int windowSize) {
        this.array = array;
        this.windowSize = windowSize;
    }

    @Override
    public boolean hasNext() {
        return array.length != 0;
    }

    @Override
    public T[] next() {
        if(!hasNext()) {
            throw new java.util.NoSuchElementException();
        }
        T[] window = (T[]) new Object[windowSize];
        for(int i = 0; i < windowSize; i++) {
            window[i] = array[(index + i) % array.length];
        }
        index++;
        return window;
    }
}
