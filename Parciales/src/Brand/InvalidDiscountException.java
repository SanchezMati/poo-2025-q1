package Brand;

public class InvalidDiscountException extends RuntimeException {
    private static final String MESSAGE = "Invalid discount for brand %s";

    public InvalidDiscountException(String name) {
        super(MESSAGE.formatted(name));
    }
}
