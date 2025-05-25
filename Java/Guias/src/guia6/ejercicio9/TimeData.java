package guia6.ejercicio9;

import java.util.Objects;

public class TimeData<T> {
    private T elem;
    private int hours;
    private int minutes;

    TimeData(T elem, int hours, int minutes) {
        this.elem = elem;
        this.hours = hours;
        this.minutes = minutes;
    }

    TimeData(T elem) {
        this.elem = elem;
    }

    public T getElem() {
        return elem;
    }

    @Override
    public boolean equals(Object o) {
        return o instanceof TimeData<?> d &&
                elem.equals(d.elem);
    }

    @Override
    public int hashCode() {
        return Objects.hash(elem);
    }

    public boolean between(int hoursFrom, int minutesFrom, int hoursTo, int minutesTo) {
        return (hours > hoursFrom || hours == hoursFrom && minutes >= minutesFrom) &&
                (hours < hoursTo || hours == hoursTo && minutes <= minutesTo);
    }



}
