package guia4.ejercicio11;

public class InvalidGradeException extends Exception {
  private static final String MESSAGE = "Grado Inválido";
  public InvalidGradeException() {
        super(MESSAGE);
    }
}
