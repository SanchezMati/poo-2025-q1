package Parcial1.p1_23_01.ejercicio1;

import java.util.Iterator;
import java.util.function.UnaryOperator;

public class CustomIndex<T> implements Iterable<T> {
    private final T[] array;
    private final int start, end;
    private UnaryOperator<Integer> operator;


    public CustomIndex(T[] array, int start, int end, UnaryOperator<Integer> operator) {
        if(start >= end) {
            throw new IllegalArgumentException("Invalid combination of start and end index");
        }

        this.array = array;
        this.start = start;
        this.end = end;
        setNextIndex(operator);
    }

    public void setNextIndex(UnaryOperator<Integer> operator) {
        this.operator = operator;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<>() {
            private int current = start;
            private final UnaryOperator<Integer> operator = CustomIndex.this.operator;

            @Override
            public boolean hasNext() {
                return current <= end;
            }

            @Override
            public T next() {
                if(!hasNext()) {
                    throw new IndexOutOfBoundsException();
                }
                T aux = array[current];
                current = operator.apply(current);
                return aux;
            }
        };
    }
}
