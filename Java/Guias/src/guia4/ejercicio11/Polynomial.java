package guia4.ejercicio11;

public class Polynomial {
    private final double[] polynomial;

    public Polynomial(int grade) throws InvalidGradeException {
        if(grade < 0) {
            throw new InvalidGradeException();
        }
        polynomial = new double[grade + 1];
    }

    public void set(int index, double coefficient) throws InvalidIndexException {
        if(index < 0 || index >= polynomial.length) {
            throw new InvalidIndexException();
        }
        polynomial[index] = coefficient;
    }

    public double eval(double input) {
        double result = 0;
        for(int i=0; i < polynomial.length; i++) {
            result += polynomial[i] * Math.pow(input,i);
        }
        return result;
    }
}
