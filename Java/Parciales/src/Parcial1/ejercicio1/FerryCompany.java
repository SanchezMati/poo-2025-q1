package Parcial1.ejercicio1;

import java.util.Objects;

public class FerryCompany {
    private final String name;
    public FerryCompany(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        return o instanceof FerryCompany f
                && name.equals(f.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
