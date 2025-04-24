package p1_23_02.ejercicio2;

public class Passenger {
    private final String name;
    private final String airlane;
    private int passAmount;

    public Passenger(String name, String airlane, int amount) {
        this.name = name;
        this.airlane = airlane;
        this.passAmount = amount;
    }

    public void usePass() {
        passAmount--;
    }
}
