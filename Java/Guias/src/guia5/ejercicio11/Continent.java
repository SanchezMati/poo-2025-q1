package guia5.ejercicio11;

public enum Continent {

    AFRICA("África", 1100, 30),
    AMERICA ("América", 990, 42),
    ASIA("Asia", 4400, 43),
    EUROPE("Europa", 730, 10),
    OCEANIA("Oceanía", 39, 9);

    private final String name;
    private final int population;
    private final int area;

    Continent(String name, int population, int area) {
        this.name = name;
        this.population = population;
        this.area = area;
    }

    public double getPopulationRatio() {
        return (double) population / area;
    }

    @Override
    public String toString() {
        return name;
    }
}
