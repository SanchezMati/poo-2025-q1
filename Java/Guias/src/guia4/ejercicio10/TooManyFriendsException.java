package guia4.ejercicio10;

public class TooManyFriendsException extends Exception {
    private static final String message = "No se pudo agregar a %s, Superaste el numero de amigos";
    public TooManyFriendsException(String number) {
        super(message.formatted(number));
    }
}
