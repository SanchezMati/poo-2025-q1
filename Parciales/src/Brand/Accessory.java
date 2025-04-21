package Brand;

public class Accessory extends Product {
    private final String description;

    public Accessory(String name, Brand brand, double price, String description) {
        super(brand, name, price);
        this.description = description;
    }

    @Override
    public String toString() {
        return "[Accessory] %s feature %s".formatted(super.toString(), description);
    }
}
