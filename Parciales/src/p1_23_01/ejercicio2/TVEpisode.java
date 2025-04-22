package p1_23_01.ejercicio2;

import java.time.LocalDate;

public class TVEpisode extends VideoCatalogElement{
    private final int season;

    public TVEpisode(String title, LocalDate airedDate, int season) {
        super(title, airedDate);
        this.season = season;
    }

    @Override
    public String toString() {
        return "%s is a TV Episode of Season %d".formatted(super.toString(), season);
    }
}
