package Parcial1.p1_23_02.ejercicio3;

import java.util.Arrays;
import java.util.Comparator;

public class MINToMaxReport<T> implements ReportColecction<T> {
    @SuppressWarnings("unchecked")
    private T[] elements = (T[]) new Object[INIT_DIM];
    private static final int INIT_DIM = 10;
    private int dim;
    private final Comparator<T> cmp;

    public MINToMaxReport(Comparator<T> cmp) {
        this.cmp = cmp;
    }

    protected void resize() {
        elements = Arrays.copyOf(elements, INIT_DIM+dim);
    }

    @Override
    public void add(T report) {
        if(dim == elements.length) {
            resize();
        }
        elements[dim++] = report;
    }

    @Override
    public T get(int index) {
        if(index >= dim || index < 0) {
            throw new IllegalArgumentException();
        }
        return elements[index];
    }

    @Override
    public T[] reports() {
        T[] toReturn = Arrays.copyOf(elements, dim);
        Arrays.sort(toReturn, cmp);
        return toReturn;
    }
}
