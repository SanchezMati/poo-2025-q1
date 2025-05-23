package TvCatalog;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class ArrayTVCatalog implements TVCatalog {
    private static final int INIT_DIM = 10;
    private TVShow[] shows = new TVShow[INIT_DIM];
    private int dim;
    private double min = 0, max = 10;

    @Override
    public TVCatalog addTVShow(String name, double rating) {
        if(dim == shows.length) {
            resize();
        }
        shows[dim++] = new TVShow(name, rating);
        return this;
    }

    private void resize() {
        shows = Arrays.copyOf(shows, dim+INIT_DIM);
    }

    @Override
    public void setRatingRange(double min, double max) {
        if(!TVShow.validateRating(min) || !TVShow.validateRating(max) || min > max) {
            throw new IllegalArgumentException("Invalid parameters");
        }
        this.min = min;
        this.max = max;
    }

    @Override
    public Iterator<TVResponse> iterator() {
        return new Iterator<>() {
            private int current = 0;
            private double itMin = min, itMax = max;

            @Override
            public boolean hasNext() {
                return current <= dim;
            }

            @Override
            public TVResponse next() {
                if(!hasNext()) {
                    throw new NoSuchElementException();
                }
                TVShow tvShow = shows[current++];
                boolean inRange = tvShow.getRating() > itMin && tvShow.getRating() < itMax;
                return new TVResponse(tvShow, inRange);
            }
        };
    }
}
