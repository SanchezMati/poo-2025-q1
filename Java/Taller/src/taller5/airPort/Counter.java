package taller5.airPort;

public class Counter implements Comparable<Counter> {
    private final int id;
    private final String airline;
    private boolean checkIn;

    public Counter(int id, String airline) {
        this.id = id;
        this.airline = airline;
    }

    public void checkIn() {
        this.checkIn = true;
    }

    @Override
    public String toString() {
        return "Counter %d for %s is %s".formatted(id, airline, checkIn ? "checking in" : "idle");
    }

    @Override
    public int compareTo(Counter o) {
        int cmp = airline.compareTo(o.airline);
        if (cmp == 0) {
            cmp = Integer.compare(id, o.id);
        }
        return cmp;
    }

    public String getAirline() {
        return airline;
    }

    public boolean isCheckIn() {
        return checkIn;
    }
}
