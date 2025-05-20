package guia6.ejercicio3;

public class Pair<E> {

    private final E left, right;

    Pair(E left, E right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        return "# %s + %s #".formatted(left, right);
    }
}
