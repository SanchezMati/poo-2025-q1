package Brand;

public class Brand {
    private final String name;
    private double discount;

    public Brand(String name, double discount) {
        this.name = name;
        setDiscount(discount);
    }

    public double applyDiscount(double price) {
        return price * (1 - discount);
    }

    public void setDiscount(double discount) {
        if(discount < 0 || discount > 1) {
            throw new InvalidDiscountException(name);
        }
        this.discount = discount;
    }

    @Override
    public String toString() {
        return name;
    }
}
