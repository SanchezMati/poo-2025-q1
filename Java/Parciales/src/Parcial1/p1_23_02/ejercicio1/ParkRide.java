package Parcial1.p1_23_02.ejercicio1;

import java.time.LocalTime;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class ParkRide implements Iterable<ParkSlot> {
    private final String name;
    private final LocalTime open;
    private LocalTime close;
    private final long minutes;

    public ParkRide(String name, LocalTime open, LocalTime close, long minutes) {
        if(minutes <= 0) {
            throw new IllegalArgumentException("Slot minutes must be positive");
        }
        this.name = name;
        this.open = open;
        setCloseTime(close);
        this.minutes = minutes;
    }

    public void setCloseTime(LocalTime close) {
        if(open.isAfter(close)) {
            throw new IllegalArgumentException("Close time cannot be before open time");
        }
        this.close = close;
    }

    @Override
    public Iterator<ParkSlot> iterator() {
        return new Iterator<>() {
            private LocalTime currentTime = open;
            private final LocalTime closeTime = close;

            @Override
            public boolean hasNext() {
                return currentTime.isBefore(closeTime);
            }

            @Override
            public ParkSlot next() {
                if(!hasNext()) {
                    throw new NoSuchElementException();
                }
                ParkSlot toReturn = new ParkSlot(name, currentTime);
                currentTime = currentTime.plusMinutes(minutes);
                return toReturn;
            }
        };
    }
}
