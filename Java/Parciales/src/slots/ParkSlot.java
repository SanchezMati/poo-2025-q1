package slots;

import java.time.LocalTime;

public class ParkSlot {
    private String name;
    private LocalTime date;

    public ParkSlot(String name, LocalTime date) {
        this.name = name;
        this.date = date;
    }

    @Override
    public String toString() {
        return "%s <> %s Slot".formatted(name, date);
    }
}
