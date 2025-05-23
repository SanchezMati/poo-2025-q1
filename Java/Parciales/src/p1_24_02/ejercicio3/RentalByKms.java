package p1_24_02.ejercicio3;

import java.time.LocalDate;

public class RentalByKms extends Rental {
    private final int maxKms;
    private final int minDays;

    public RentalByKms(String rentalLocation, LocalDate rentalDate, RentalCentral rentalCentral,
                       int maxKms, int minDays) {
        super(rentalLocation, rentalDate, rentalCentral);
        this.maxKms = maxKms;
        this.minDays = minDays;
    }

    @Override
    public boolean canDrop(String location, LocalDate date) {
        return super.canDrop(location, date) &&
                date.isAfter(getRentalDate().plusDays(minDays));
    }

    @Override
    public void addKms(int kms) {
        if(getKms()+kms >= maxKms) {
            throw new RentalException("Reached Max Kms Limit");
        }
        super.addKms(kms);
    }

    @Override
    public String toString() {
        return "MaxKm %s, at least %d days and up to %d kms".formatted(super.toString(), minDays, maxKms);
    }

}
