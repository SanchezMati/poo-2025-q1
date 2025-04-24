package p1_23_02.ejercicio2;

public class Lounge {
    protected final LoungeCentral loungeCentral;
    protected final String name;
    protected int guests;

    public Lounge(String name, LoungeCentral loungeCentral) {
        this.name = name;
        this.loungeCentral = loungeCentral;
    }

    public boolean canEnter() {
        return loungeCentral.isOpen() && ;
    }

    public void enter(Passenger passenger) {
        if(!canEnter()) {
            throw new RuntimeException("Cannot enter lounge");
        }
        passenger.usePass();
        guests++;
    }

    public boolean canExit() {
        return guests != 0;
    }

    public void exit() {
        if(!canExit()) {
            throw new RuntimeException("Lounge is empty");
        }
        guests--;
    }

    @Override
    public String toString() {
        return "%s has %d guests".formatted(name, guests);
    }
}
