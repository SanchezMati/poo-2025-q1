package TvCatalog;

public class TVResponse {
    private final TVShow tvShow;
    private final boolean inRange;

    public TVResponse(TVShow tvShow, boolean inRange) {
        this.tvShow = tvShow;
        this.inRange = inRange;
    }

    @Override
    public String toString() {
        return "%s %s".formatted(tvShow, inRange ? "In range" : "Out of range");
    }

}
