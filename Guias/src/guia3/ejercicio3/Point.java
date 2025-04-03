package guia3.ejercicio3;

import java.util.Objects;

public class Point {
    private final double x, y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    //Constructor agregado por mi para ejercicio 3.5
    public Point() {
        this(0, 0);
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Point p &&
                Double.compare(x, p.x) == 0 &&
                Double.compare(y, p.y) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    public String toString() {
        return "{%g, %g}".formatted(x, y);
    }
}
