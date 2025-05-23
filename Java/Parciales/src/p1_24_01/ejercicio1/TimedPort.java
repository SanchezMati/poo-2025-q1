package p1_24_01.ejercicio1;

import java.time.LocalTime;

public class TimedPort extends Port{
    protected LocalTime openTime, closedTime;

    public TimedPort(String name, FerryCompany ferryCompany, int docksAmount,
                     LocalTime openTime, LocalTime closedTime) {
        super(name, ferryCompany, docksAmount);
        this.closedTime = closedTime;
        this.openTime = openTime;
    }

    @Override
    protected boolean canDock(Ferry ferry, LocalTime time) {
        return super.canDock(ferry, time) && time.isAfter(openTime) && time.isBefore(closedTime);
    }
}
