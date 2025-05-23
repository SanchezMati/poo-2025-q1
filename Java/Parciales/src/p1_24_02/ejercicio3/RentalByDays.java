package p1_24_02.ejercicio3;

import java.time.LocalDate;

public class RentalByDays extends Rental {
    private final int days;

    public RentalByDays(String rentalLocation, LocalDate rentalDate, RentalCentral rentalCenter, int days) {
        super(rentalLocation, rentalDate, rentalCenter);
        this.days = days;
    }

    @Override
    public boolean canDrop(String location, LocalDate date) {
        return super.canDrop(location, date) &&
                getRentalLocation().equals(location) &&
                getRentalDate().plusDays(days).isAfter(date);
    }

    @Override
    public String toString() {
        return "Same Drop Rental %s for up to %d days".formatted(super.toString(), days);
    }
}
