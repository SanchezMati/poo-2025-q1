package taller3.src;

abstract class SubwayCard
{
    private final SubwayCentral subwayCentral;

    SubwayCard(SubwayCentral sc)
    {
        subwayCentral = sc;
    }

    protected abstract boolean canRide();

    protected abstract void applyCost();

    protected SubwayCentral getSubwayCentral() {
        return subwayCentral;
    }

    public void ride() throws CannotRideExeption {
        if(!canRide()) {
            throw new CannotRideExeption();
        }

        applyCost();
    }
}
