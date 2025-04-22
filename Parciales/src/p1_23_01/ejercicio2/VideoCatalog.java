package p1_23_01.ejercicio2;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;

public class VideoCatalog {
    private VideoCatalogElement[] catalog = new VideoCatalogElement[INITIAL_DIM];;
    private int dim;
    private final static int INITIAL_DIM = 10;

    private boolean hasSpace() {
        return dim < catalog.length;
    }

    private void resize() {
        catalog = Arrays.copyOf(catalog, INITIAL_DIM+dim);
    }

    private VideoCatalog addElement(VideoCatalogElement element){
        if(catalog.length == dim) {
            resize();
        }
        catalog[dim++] = element;
        return this;
    }

    public VideoCatalog add(String title, LocalDate airedDate, String studio) {
        return addElement(new Movie(title, airedDate, studio));
    }

    public VideoCatalog add(String title, LocalDate airedDate, int season) {
        return addElement(new TVEpisode(title, airedDate, season));
    }

    public VideoCatalogElement[] getDescendingDateCopy() {
        VideoCatalogElement[] toReturn = Arrays.copyOf(catalog, dim);
        Arrays.sort(toReturn, Comparator.naturalOrder());
        return toReturn;
    }

    public VideoCatalogElement[] getChronologicalDateCopy() {
        VideoCatalogElement[] toReturn = Arrays.copyOf(catalog, dim);
        Arrays.sort(toReturn, Comparator.reverseOrder());
        return toReturn;
    }
}
