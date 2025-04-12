package guia4.ejercicio11;

public class PolynomialTester {
    public static void main(String[] args) throws InvalidGradeException, InvalidIndexException {
        Polynomial fourthGradePol = new Polynomial(4);
        fourthGradePol.set(2, 3.1); // 3.1 * x^2
        fourthGradePol.set(3, 2); // 2 * x^3 + 3.1 * x^2
        System.out.println(fourthGradePol.eval(2)); // 28.4
        System.out.println(new Polynomial(3).eval(5)); // 0
        try {
            new Polynomial(-4);
        } catch (InvalidGradeException e) {
            System.out.println(e.getMessage()); // 0
        }
        fourthGradePol.set(7, 1.5); // 1.5 * x^7
    }

    /*
    * 28.4
    * 0.0
    * Grado Inválido
    * Exception in thread "main" ar.edu.itba.poo.tp5.polynomial.InvalidIndexException: Índice Inválido
    *   at ar.edu.itba.poo.tp5.polynomial.Polynomial.set(Polynomial.java:16)
    *   at ar.edu.itba.poo.tp5.polynomial.PolynomialTester.main(PolynomialTester.java:16)
    * */
}
