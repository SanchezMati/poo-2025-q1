package guia7.ejercicio2;

import java.util.List;
import java.util.function.BiFunction;

public interface SimpleList<T> extends List<T> {
    <E> E reduce(E initialValue,  BiFunction<E, T, E> accumulator);
}
