package taller3.src;

public class FixedSubwayCard extends SubwayCard
{
    private int rides;

    public FixedSubwayCard(SubwayCentral sc, int rides) {
        super(sc); //new SubwayCard()
        this.rides = rides;
    }

    @Override
    protected boolean canRide() {
        return rides > 0;
    }

    @Override
    protected void applyCost() {
        rides--;
    }
}
