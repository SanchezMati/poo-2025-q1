package slots;


import java.time.LocalTime;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class ParkRide implements Iterable<ParkSlot> {

    private String name;
    private LocalTime openingDate;
    private LocalTime closingDate;
    private long slot;

    public ParkRide(String name, LocalTime openingDate, LocalTime closingDate, long slot) {
        if(slot <= 0) {
            throw new IllegalArgumentException("Slot minutes must be positive");
        }
        this.name = name;
        this.slot = slot;
        this.openingDate = openingDate;
        setCloseTime(closingDate);
    }

    public void setCloseTime(LocalTime closingDate) {
        if(closingDate.isBefore(openingDate)) {
            throw new IllegalArgumentException("Close time cannot be before open time");
        }
        this.closingDate = closingDate;
    }

    @Override
    public Iterator<ParkSlot> iterator() {
        return new Iterator<ParkSlot>() {

            private LocalTime currentDate = openingDate;
            private LocalTime closingDate = ParkRide.this.closingDate;

            @Override
            public boolean hasNext() {
                return currentDate.isBefore(closingDate);
            }

            @Override
            public ParkSlot next() {
                if(!hasNext()) {
                    throw new NoSuchElementException();
                }
                LocalTime nextDate = currentDate;
                currentDate = currentDate.plusMinutes(slot);
                return new ParkSlot(name, nextDate);

            }
        };
    }
}
