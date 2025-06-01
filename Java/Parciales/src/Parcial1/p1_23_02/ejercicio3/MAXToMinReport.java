package Parcial1.p1_23_02.ejercicio3;

import java.util.Comparator;

public class MAXToMinReport<T> extends MINToMaxReport<T> {

    public MAXToMinReport(Comparator<? super T> cmp) {
        super(new Comparator<T>() {
            @Override
            public int compare(T o1, T o2) {
                return cmp.compare(o2, o1);
            }
        });
    }
}
