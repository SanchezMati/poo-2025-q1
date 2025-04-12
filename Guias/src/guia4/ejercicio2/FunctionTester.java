package guia4.ejercicio2;

public class FunctionTester {
    public static void main(String[] args) {
        Function f1 = new LinearFunction(2, 0); // y = 2x
        Function f2 = new QuadraticFunction(1, 0, 0); // y = x^2
        Function f3 = new CompositeFunction(f1, f2); // y = (2x)^2
        System.out.println(f3.evaluate(1)); // 4.0
        System.out.println(f3.evaluate(2)); // 16.0
        Function f4 = new SineFunction(); //y = sin(x)
        Function f5 = new CompositeFunction(f1, f4); // y = sin(2x)
        Function f6 = new CompositeFunction(f5, f1); // y = 2 sin(2x)
        System.out.println(f6.evaluate(0)); // 0.0
        System.out.println(f6.evaluate(Math.PI / 4.0)); // 2.0
    }
}
