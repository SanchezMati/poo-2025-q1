package p1_23_01.ejercicio2;

import java.time.LocalDate;

public class Movie extends VideoCatalogElement{
    private final String studio;

    public Movie(String title, LocalDate airedDate, String studio) {
        super(title, airedDate);
        this.studio = studio;
    }

    @Override
    public String toString() {
        return "%s is a Movie from %s".formatted(super.toString(), studio);
    }
}
