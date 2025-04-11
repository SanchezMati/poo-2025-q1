package taller5.Puertos;

import java.time.LocalTime;

public class FerryPort {
    private final String name;
    private final FerryCompany company;
    private final int docks;
    private int ferriesDocks;

    private void print(String name, String operation) {
        System.out.printf("%s %s at port %s%n".formatted(name, operation, this.name));
    }

    public FerryPort(String name, FerryCompany company, int docks) {
        this.name = name;
        this.company = company;
        this.docks = docks;
        this.ferriesDocks = 0;
    }

    protected boolean canDock(Ferry ferry, LocalTime time) {
        return ferriesDocks < docks && company.equals(ferry.getCompany());
    }

    public void dock(Ferry ferry, LocalTime time) {
        if (!canDock(ferry, time)) {
            throw new RuntimeException();
        }
        ferriesDocks++;
        print(name, "docked");
    }

    public void undock(Ferry ferry, LocalTime time) {
        if(ferriesDocks == 0) {
            throw new RuntimeException();
        }
        ferriesDocks--;
        print(name, "undocked");
    }
}
