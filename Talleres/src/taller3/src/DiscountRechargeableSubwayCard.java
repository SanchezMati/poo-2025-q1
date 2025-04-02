package taller3.src;

public class DiscountRechargeableSubwayCard extends RechargeableSubwayCard
{
    private final double discount;

    public DiscountRechargeableSubwayCard(SubwayCentral sc, double dp) {
        super(sc);
        discount = dp;
    }

    @Override
    protected double rideCost() {
        return super.rideCost() * (1 - discount);
    }
}
