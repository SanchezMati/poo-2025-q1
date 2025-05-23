package guia4.ejercicio15;

public class OperationTester {

    public static void main(String[] args) {
        double x = 4;
        double y = 2;
        for(Operation operation : BasicOperation.values()) {
            System.out.printf("%.2f %s %.2f = %.2f\n", x, operation, y, operation.apply(x,y));
        }
        for(Operation operation : ExtendedOperation.values()) {
            System.out.printf("%.2f %s %.2f = %.2f\n", x, operation, y, operation.apply(x,y));
        }
    }

    /*  Salida:
        4,00 + 2,00 = 6,00
        4,00 - 2,00 = 2,00
        4,00 * 2,00 = 8,00
        4,00 / 2,00 = 2,00
        4,00 ^ 2,00 = 16,00
        4,00 % 2,00 = 0,00
    */

}
