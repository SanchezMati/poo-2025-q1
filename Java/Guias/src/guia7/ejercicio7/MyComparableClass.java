package guia7.ejercicio7;

public class MyComparableClass implements Comparable<MyComparableClass> {
    private String identifier;

    public String sortableIdentifier;

    public MyComparableClass(String identifier) {
        if (identifier == null) {
            throw new IllegalArgumentException();
        }
        this.identifier = identifier;
    }

    @Override
    public String toString() {
        return identifier + " - " + "(" + sortableIdentifier + ")";
    }

    @Override
    public int compareTo(MyComparableClass o) {
        return sortableIdentifier.compareTo(o.sortableIdentifier);
    }
}
