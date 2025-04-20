package guia5.ejercicio12;

import java.time.LocalDate;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class LocalDateInterval implements Iterable<LocalDate> {
    private LocalDate firstDay;
    private LocalDate lastDay;
    private int step;

    public LocalDateInterval(LocalDate firstDay, LocalDate lastDay, int step) {
        this.firstDay = firstDay;
        this.lastDay = lastDay;
        this.step = step;
    }

    @Override
    public Iterator<LocalDate> iterator() {
        return new Iterator<LocalDate> () {
            private LocalDate currentDay = firstDay;

            @Override
            public boolean hasNext() {
                return step > 0 && !currentDay.isAfter(lastDay) || step < 0 && !currentDay.isBefore(lastDay);
            }

            @Override
            public LocalDate next() {
                if(!hasNext()) {
                    throw new NoSuchElementException();
                }
                LocalDate nextDay = currentDay;
                currentDay = currentDay.plusDays(step);
                return nextDay;
            }
        };
    }
}
