package Parcial2.consultas.ejercicio2;

public class Landmark implements Comparable<Landmark> {
    private final String name;
    private final Double rating;

    public Landmark(String name, Double rating) {
        this.name = name;
        this.rating = rating;
    }

    @Override
    public int compareTo(Landmark o) {
        int cmp = Double.compare(o.rating, rating);
        if(cmp == 0) {
            cmp = o.name.compareTo(name);
        }
        return cmp;
    }

    @Override
    public String toString() {
        return "# %s # %d #".formatted(name, rating);
    }
}
