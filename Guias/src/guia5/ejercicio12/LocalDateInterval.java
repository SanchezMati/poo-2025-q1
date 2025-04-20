package guia5.ejercicio12;

import java.time.LocalDate;

public class LocalDateInterval implements Iterable<LocalDate> {
    private LocalDate firstDay;
    private LocalDate lastDay;
    private LocalDate currentDay;

    public LocalDateInterval(LocalDate firstDay, LocalDate lastDay) {
        this.firstDay = firstDay;
        this.lastDay = lastDay;
        this.currentDay = firstDay;
    }

    @Override
    public String toString() {
        return currentDay.toString();
    }





}
