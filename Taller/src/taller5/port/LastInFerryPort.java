package taller5.port;

import java.time.LocalTime;

public class LastInFerryPort extends TimedFerryPort {
    private Ferry lastFerry;

    LastInFerryPort(String name, FerryCompany company, int docks, LocalTime open, LocalTime close) {
        super(name, company, docks, open, close);
    }

    @Override
    public void undock(Ferry ferry, LocalTime time) {
        if(lastFerry != ferry) {
            throw new RuntimeException();
        }
        super.undock(ferry, time);
        lastFerry = null;
    }

    @Override
    public void dock(Ferry ferry, LocalTime time) {
        super.dock(ferry, time);
        lastFerry = ferry;
    }

}
