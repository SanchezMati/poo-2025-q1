package guia7.ejercicio2;

import java.util.ArrayList;
import java.util.function.BiFunction;

public class SimpleArrayList<T> extends ArrayList<T> implements SimpleList<T> {
    @Override
    public <E> E reduce(E initialValue, BiFunction<E, T, E> accumulator) {
        E toReturn = initialValue;
        for(T obj : this) {
            toReturn = accumulator.apply(toReturn, obj);
        }
        return toReturn;
    }
}
