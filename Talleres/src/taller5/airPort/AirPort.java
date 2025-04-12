package taller5.airPort;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Predicate;

public class AirPort {
    private int dim = 0;
    private static final int INITIAL_DIM = 5;
    private Counter[] counters = new Counter[INITIAL_DIM];

    private void resize() {
        counters = Arrays.copyOf(counters, dim+INITIAL_DIM);
    }

    public Counter addCounter(String airline) {
        if(dim == counters.length) {
            resize();
        }
        counters[dim] = new Counter(dim, airline);
        return counters[dim++];
    }

    private Counter[] orderCopy(Comparator<Counter> comparator) {
        Counter[] copy = Arrays.copyOf(counters, dim);
        Arrays.sort(copy, comparator);
        return copy;
    }

    public Counter[] airlineOrderCounters() {
        return orderCopy(Comparator.naturalOrder());
    }

    public Counter[] airlineDescendingOrderCounters() {
        return orderCopy(Comparator.reverseOrder());
    }

    public void counterCheckIn(Predicate<Counter> predicate) {
        for(int i = 0; i < dim; i++) {
            if(predicate.test(counters[i])) {
                counters[i].checkIn();
                break;
            }
        }
    }

}
