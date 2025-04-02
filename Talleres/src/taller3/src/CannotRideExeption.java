package taller3.src;

public class CannotRideExeption extends Exception
{
    public static final String MESSAGE = "No more rides";

    public CannotRideExeption() {
        this(MESSAGE);
    }

    public CannotRideExeption(String MESSAGE) {
        super(MESSAGE);
    }
}
