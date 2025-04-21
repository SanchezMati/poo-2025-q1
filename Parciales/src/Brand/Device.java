package Brand;

public class Device extends Product {
    Energy energyLabel;

    public Device(String name, Brand brand, double price, Energy energyLabel) {
        super(brand, name, price);
        this.energyLabel = energyLabel;
    }

    @Override
    public double getFinalPrice() {
        return super.getFinalPrice() + energyLabel.getEnergyCharge(price);
    }

    @Override
    public String toString() {
        return "[Device] %s Energy Label %s".formatted(super.toString(), energyLabel.toString());
    }
}
