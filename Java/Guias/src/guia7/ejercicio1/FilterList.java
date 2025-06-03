package guia7.ejercicio1;

import java.util.List;
import java.util.function.Predicate;

public interface FilterList<T> extends List<T> {
    FilterList<T> filter(Predicate<T> criteria);
}
