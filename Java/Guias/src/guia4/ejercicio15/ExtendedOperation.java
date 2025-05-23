package guia4.ejercicio15;

public enum ExtendedOperation implements Operation {
    POW("^", (x, y) -> Math.pow(x,y) ),
    MODULO("%", (x, y) -> x % y );

    private final String Symbol;
    private final Operation operation;

    ExtendedOperation(String symbol, Operation operation) {
        this.Symbol = symbol;
        this.operation = operation;
    }

    @Override
    public String toString() {
        return Symbol;
    }

    @Override
    public double apply(double x, double y) {
        return operation.apply(x, y);
    }
}
