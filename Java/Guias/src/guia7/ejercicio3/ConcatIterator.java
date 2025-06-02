package guia7.ejercicio3;

import java.util.Iterator;

public class ConcatIterator<T> implements Iterator<T> {
    private Iterator<T> currentIterator, nextIterator;

    public ConcatIterator(Iterator<T> first, Iterator<T> second) {
        this.currentIterator = first;
        this.nextIterator = second;
    }

    @Override
    public boolean hasNext() {
        if(!currentIterator.hasNext() && nextIterator != null) {
            currentIterator = nextIterator;
            nextIterator = null;
        }
        return currentIterator.hasNext();
    }

    @Override
    public T next() {
        if (!hasNext()) {
            throw new java.util.NoSuchElementException();
        }
        return currentIterator.next();
    }
}
