package p1_23_01.ejercicio3;

public enum Energy {
    LEVEL_A("A", 0),
    LEVEL_B("B", 0.1),
    LEVEL_C("C", 0.2);

    private final double tax;
    private final String name;

    private Energy(String name, double tax) {
        this.name = name;
        this.tax = tax;
    }

    public double getEnergyCharge(double price) {
        return price * tax;
    }

    @Override
    public String toString() {
        return name;
    }
}
