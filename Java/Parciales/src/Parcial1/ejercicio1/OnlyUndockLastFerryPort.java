package Parcial1.ejercicio1;

import java.time.LocalTime;

public class OnlyUndockLastFerryPort extends TimedPort{
    private Ferry lastFerryDocked;

    public OnlyUndockLastFerryPort(String name, FerryCompany ferryCompany, int docksAmount,
                                   LocalTime openTime, LocalTime closedTime) {
        super(name, ferryCompany, docksAmount, openTime, closedTime);
        lastFerryDocked = null;
    }

    @Override
    protected boolean canDock(Ferry ferry, LocalTime time){
        return super.canDock(ferry, time) && this.lastFerryDocked.equals(ferry);
    }
}
