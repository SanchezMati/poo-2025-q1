package guia4.ejercicio2;

public class QuadraticFunction extends LinearFunction implements Function {

    private final double a;

    public QuadraticFunction(double a, double b, double c) {
        super(b, c);
        this.a = a;
    }

    @Override
    public double evaluate(double x) {
        return super.evaluate(x) + a * Math.pow(x, 2);
    }
}
