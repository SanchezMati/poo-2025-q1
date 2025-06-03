package guia7.ejercicio1;

import java.util.ArrayList;
import java.util.function.Predicate;

public class ArrayFilterList<T> extends ArrayList<T> implements FilterList<T> {
    @Override
    public FilterList<T> filter(Predicate<T> criteria) {
        FilterList<T> filtered = new ArrayFilterList<>();
        for(T obj : this) {
            if(criteria.test(obj)) {
                filtered.add(obj);
            }
        }
        return filtered;
    }
}
