package guia3.ejercicio6;

import java.util.Objects;

public final class ComplexNumber {
    private final double real, imag;

    public ComplexNumber(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public ComplexNumber(Number number) {
        this(number.doubleValue(), 0);
    }

    public double getReal() {
        return real;
    }

    public double getImag() {
        return imag;
    }

    public ComplexNumber plus(ComplexNumber other) {
        return new ComplexNumber(real + other.real, imag + other.imag);
    }

    public ComplexNumber plus(double other) {
        return new ComplexNumber(real + other, imag);
    }

    @Override
    public String toString() {
        return "%.2f %c %.2f".formatted(real, imag > 0 ? '+' : '-', Math.abs(imag));
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof ComplexNumber c &&
                real == c.real &&
                imag == c.imag;
    }

    @Override
    public int hashCode() {
        return Objects.hash(real, imag);
    }
}
