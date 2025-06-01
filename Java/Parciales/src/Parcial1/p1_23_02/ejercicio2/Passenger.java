package Parcial1.p1_23_02.ejercicio2;

public class Passenger {
    private final String name;
    private final String airline;
    private int passAmount;

    public Passenger(String name, String airline, int amount) {
        this.name = name;
        this.airline = airline;
        this.passAmount = amount;
    }

    public void usePass() {
        passAmount--;
    }

    public int getPassAmount() {
        return passAmount;
    }

    public String getAirline() {
        return airline;
    }
}
