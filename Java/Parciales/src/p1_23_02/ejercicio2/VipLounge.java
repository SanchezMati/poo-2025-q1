package p1_23_02.ejercicio2;

public class VipLounge extends CapLounge {
    private final String airline;

    public VipLounge(String name, LoungeCentral loungeCentral, int maxGuest, String airline) {
        super(name, loungeCentral, maxGuest);
        this.airline = airline;
    }

    @Override
    public boolean canEnter(Passenger passenger) {
        return super.canEnter(passenger) && passenger.getAirline().equals(airline);
    }

    @Override
    public String toString() {
        return "%s %s".formatted(airline, super.toString());
    }

}
