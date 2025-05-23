package guia4.ejercicio10;

public class AlreadyExistsFriendException extends Exception {
    private static final String message = "%s ya esta en tu lista de amigos";
    public AlreadyExistsFriendException(String number) {
        super(message.formatted(number));
    }
}
