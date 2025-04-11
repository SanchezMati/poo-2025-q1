package taller3;

public class RechargeableSubwayCard extends SubwayCard
{
    private double balance;

    public RechargeableSubwayCard(SubwayCentral sc) {
        super(sc);
    }

    protected double rideCost() {
        return getSubwayCentral().getRideCost();
    }

    public void recharge(double amount) {
        balance += amount;
    }

    @Override
    protected boolean canRide() {
        return balance >= rideCost();
    }

    @Override
    protected void applyCost() {
        balance -= rideCost();
    }
}
