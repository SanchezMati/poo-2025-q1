package Brand;

public abstract class Product {
    protected Brand brand;
    protected String name;
    protected double price;

    public Product(Brand brand, String name, double price) {
        this.brand = brand;
        this.name = name;
        this.price = price;
    }

    public double getFinalPrice() {
        return brand.applyDiscount(price);
    }

    public double getFinalPrice(Warranty warranty) {
        return getFinalPrice() + warranty.getWarrantyPrice(price);
    }

    @Override
    public String toString() {
        return "%s from %s with price %.2f with".formatted(name, brand, price);
    }
}
