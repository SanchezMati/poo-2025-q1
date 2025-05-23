package p1_23_02.ejercicio2;

public class CapLounge extends Lounge{
    private final int maxGuest;

    public CapLounge(String name, LoungeCentral loungeCentral, int maxGuest) {
        super(name, loungeCentral);
        this.maxGuest = maxGuest;
    }

    @Override
    public boolean canEnter(Passenger passenger) {
        return super.canEnter(passenger) && guests < maxGuest;
    }

    @Override
    public String toString() {
        return "%s up to %d guests".formatted(super.toString(), maxGuest);
    }
}
