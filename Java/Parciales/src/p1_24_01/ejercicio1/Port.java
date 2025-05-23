package p1_24_01.ejercicio1;

import java.time.LocalTime;

public class Port {
    private String name;
    private FerryCompany ferryCompany;
    private int docksAmount;
    private int freeDock;

    public Port(String name, FerryCompany ferryCompany, int docksAmount) {
        this.name = name;
        this.ferryCompany = ferryCompany;
        this.docksAmount = docksAmount;
        this.freeDock = docksAmount;
    }

    protected boolean canDock(Ferry ferry, LocalTime time) {
        return ferryCompany.equals(ferry.getCompany()) && freeDock < docksAmount;
    }

    public void dock(Ferry ferry, LocalTime time) {
        if(!canDock(ferry, time)) {
            throw new RuntimeException();
        }
        message(ferry.toString(),"docked");
        freeDock--;
    }

    protected boolean canUndock() {
        return freeDock >= docksAmount;
    }

    public void undock(Ferry ferry, LocalTime time) {
        if(!canUndock()) {
            throw new RuntimeException();
        }
        message(ferry.toString(), "undocked");
        freeDock++;
    }

    private void message(String ferryName, String msg) {
        System.out.println("%s %s at Port %s".formatted(ferryName, msg, name));
    }
}
