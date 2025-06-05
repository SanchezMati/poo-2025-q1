package Parcial2.p2_23_01.ejercicio3;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PartitionableCollection<T> extends ArrayList<T> {

    public PartitionableCollection<T> getSelected(Predicate<T> condition) {
        PartitionableCollection<T> toReturn = new PartitionableCollection<>();
        for (T elem : this) {
            if(condition.test(elem)) {
                toReturn.add(elem);
            }
        }
        return toReturn;
    }

    public PartitionableCollection<T> getRejected(Predicate<T> condition) {
        return getSelected(condition.negate());
    }



}
