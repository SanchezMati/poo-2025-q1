package guia4.ejercicio10;

public class FriendNotFoundException extends Exception {
    private static final String message = "%s no se encontro en tu lista de amigos";
    public FriendNotFoundException(String name) {
        super(message.formatted(name));
    }
}
