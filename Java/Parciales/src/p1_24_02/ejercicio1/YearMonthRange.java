package p1_24_02.ejercicio1;

import java.time.YearMonth;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.UnaryOperator;

public class YearMonthRange implements Iterable<YearMonth> {
    private final YearMonth from, to;
    private final UnaryOperator<YearMonth> step;

    public YearMonthRange(YearMonth from, YearMonth to, UnaryOperator<YearMonth> step) {
        this.from = from;
        this.to = to;
        this.step = step;
    }

    public YearMonthRange(YearMonth from, YearMonth to) {
        this(from, to, YearMonth -> YearMonth.plusMonths(1));
    }

    @Override
    public Iterator<YearMonth> iterator() {
        return new Iterator<>() {
            private YearMonth current = from;

            @Override
            public boolean hasNext() {
                return !current.isAfter(to);
            }

            @Override
            public YearMonth next() {
                if(!hasNext()) {
                    throw new NoSuchElementException();
                }
                YearMonth aux = current;
                current = step.apply(current);
                return aux;
            }
        };
    }
}
