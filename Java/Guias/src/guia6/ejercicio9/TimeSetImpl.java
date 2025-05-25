package guia6.ejercicio9;
import java.util.HashSet;
import java.util.Set;

public class TimeSetImpl<T> implements TimeSet<T> {
    private Set<TimeData<T>> set = new HashSet<>();

    private boolean isValidTime(int hours, int minutes) {
        return hours <= 24 && hours >= 0 && minutes <= 60 && minutes >= 0;
    }

    @Override
    public void add(T elem, int hours, int minutes) {
        if(!isValidTime(hours, minutes)) {
            throw new IllegalArgumentException();
        }
        TimeData<T> timeData = new TimeData<>(elem, hours, minutes);
        set.add(timeData);
    }

    @Override
    public void remove(T elem) {
        set.remove(new TimeData<>(elem));
    }

    @Override
    public int size() {
        return set.size();
    }

    @Override
    public boolean contains(T elem) {
        return set.contains(new TimeData<>(elem));
    }

    @Override
    public Set<T> retrieve(int hoursFrom, int minutesFrom, int hoursTo, int minutesTo) {
        Set<T> toReturn = new HashSet<>();
        for (TimeData<T> timeData : set) {
            if(timeData.between(hoursFrom, minutesFrom, hoursTo, minutesTo)) {
                toReturn.add(timeData.getElem());
            }
        }
        return toReturn;
    }
}
