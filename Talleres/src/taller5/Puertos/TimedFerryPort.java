package taller5.Puertos;

import java.time.LocalTime;

public class TimedFerryPort extends FerryPort {
    private final LocalTime open;
    private final LocalTime close;

    public TimedFerryPort(String name, FerryCompany company, int docks, LocalTime open, LocalTime close) {
        super(name, company, docks);
        this.open = open;
        this.close = close;
    }

    protected boolean canDock(Ferry ferry, LocalTime time) {
        return time.isBefore(close) && time.isAfter(open) && super.canDock(ferry, time);
    }
}
