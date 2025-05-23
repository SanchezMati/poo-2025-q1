package p1_23_02.ejercicio1;

import java.time.LocalTime;

public class ParkSlot {
    private final String name;
    private final LocalTime time;

    public ParkSlot(String name, LocalTime time) {
        this.name = name;
        this.time = time;
    }

    @Override
    public String toString() {
        return "%s <> %s slot".formatted(name, time);
    }
}
