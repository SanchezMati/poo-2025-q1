package guia5.ejercicio14;

import java.util.Iterator;

public class ReversedIterator<T> implements Iterator<T> {

    private T[] array;
    private int index;

    public ReversedIterator(T[] array) {
        this.array = array;
        this.index = array.length - 1;

    }

    @Override
    public boolean hasNext() {
        return index >= 0;
    }

    @Override
    public T next() {
        if(!hasNext()) {
            throw new java.util.NoSuchElementException();
        }
        return array[index--];
    }
}
