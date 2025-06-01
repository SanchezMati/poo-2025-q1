package Parcial1.p1_24_02.ejercicio3;

import java.time.LocalDate;

public class Rental {
    private final String rentalLocation;
    private final LocalDate rentalDate;
    private final RentalCentral rentalCentral;
    private int kms;

    public Rental(String rentalLocation, LocalDate rentalDate, RentalCentral rentalCentral) {
        if(!rentalCentral.belongsIn(rentalLocation)) {
            throw new RentalException("PickUp Location Not Found");
        }
        this.rentalLocation = rentalLocation;
        this.rentalDate = rentalDate;
        this.rentalCentral = rentalCentral;
    }

    public void addKms(int kms) {
        this.kms += kms;
    }

    public boolean canDrop(String location, LocalDate date) {
        return date.isAfter(rentalDate) && rentalCentral.belongsIn(location);
    }

    @Override
    public String toString() {
        return "Rental from %s on %s has %d kms".formatted(rentalLocation, rentalDate, kms);
    }

    protected LocalDate getRentalDate() {
        return rentalDate;
    }

    protected String getRentalLocation() {
        return rentalLocation;
    }

    protected int getKms() {
        return kms;
    }
}
