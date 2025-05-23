package p1_23_02.ejercicio2;

public class Lounge {
    protected final LoungeCentral loungeCentral;
    protected final String name;
    protected int guests;

    public Lounge(String name, LoungeCentral loungeCentral) {
        this.name = name;
        this.loungeCentral = loungeCentral;
    }

    public boolean canEnter(Passenger passenger) {
        return loungeCentral.isOpen() && passenger.getPassAmount() > 0;
    }

    public void enter(Passenger passenger) {
        if(!canEnter(passenger)) {
            throw new RuntimeException("Cannot enter lounge");
        }
        passenger.usePass();
        guests++;
    }

    public boolean canExit(int n) {
        return guests >= n;
    }

    public void exit() {
        exit(1);
    }

    public void exit(int n) {
        if(!canExit(n)) {
            throw new RuntimeException("Lounge is empty");
        }
        guests -= n;
    }

    @Override
    public String toString() {
        return "%s has %d guests".formatted(name, guests);
    }
}
