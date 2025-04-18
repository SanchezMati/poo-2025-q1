package guia4.ejercicio15;

public enum BasicOperation implements Operation {
    ADD("+", (x, y) -> x + y ),
    SUBTRACT("-", (x, y) -> x - y ),
    MULTIPLY("*", (x, y) -> x * y ),
    DIVIDE("/", (x, y) -> x / y );

    private final String symbol;
    private final Operation operation;

    BasicOperation(String symbol, Operation operation) {
        this.symbol = symbol;
        this.operation = operation;
    }

    @Override
    public String toString() {
        return symbol;
    }

    @Override
    public double apply(double x, double y) {
        return operation.apply(x, y);
    }

}
