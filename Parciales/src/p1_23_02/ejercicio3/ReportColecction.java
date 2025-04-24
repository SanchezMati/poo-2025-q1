package p1_23_02.ejercicio3;

import java.util.Comparator;

public interface ReportColecction<R> {
    void add(R report);

    R get(int index);

    R[] reports();
}
