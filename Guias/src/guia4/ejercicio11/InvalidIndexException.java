package guia4.ejercicio11;

public class InvalidIndexException extends Exception {
  private static final String MESSAGE = "Índice Inválido";
  public InvalidIndexException() {
        super(MESSAGE);
    }
}
