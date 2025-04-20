package guia5.ejercicio1;

import java.util.Objects;

public class Pair < A extends Comparable<? super A>, B extends  Comparable<? super B> >
        implements Comparable<Pair<A, B>> {
    private A elemA;
    private B elemB;

    public Pair(A elemA, B elemB) {
        this.elemA = elemA;
        this.elemB = elemB;
    }

    @Override
    public String toString() {
        return "[%s, %s]".formatted(elemA, elemB);
    }

    @Override
    public boolean equals(Object o) {
        return o instanceof Pair<?,?> pair &&
                elemA.equals(pair.elemA) &&
                elemB.equals(pair.elemB);
    }

    @Override
    public int hashCode() {
        return Objects.hash(elemA, elemB);
    }

    public void setA(A a) {
        this.elemA = a;
    }

    public void setB(B b) {
        this.elemB = b;
    }

    @Override
    public int compareTo(Pair<A, B> o) {
        int diff = elemA.compareTo(o.elemA);
        if (diff == 0) {
            diff = elemB.compareTo(o.elemB);
        }
        return diff;
    }


}
