package p1_23_02.ejercicio2;

public class CapLounge extends Lounge{
    private final int maxGuest;
    private int guest;

    public CapLounge(String name, LoungeCentral loungeCentral, int maxGuest) {
        super(name, loungeCentral);
        this.maxGuest = maxGuest;
    }

    @Override
    public boolean canEnter() {
        return super.canEnter() && guest <= maxGuest;
    }

    @Override
    public boolean canExit() {

    }

    @Override
    public boolean exit(int amount) {
        if(!canExit()) {
            throw new RuntimeException("Lounge is empty");
        }

    }

    @Override
    public String toString() {
        return "%s up to %d guests".formatted(super.toString(), maxGuest);
    }
}
