package guia6.ejercicio3;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PairCyclicIteratorTester {
    public static void main(String[] args) {
        List<String> list = List.of("hola", "que", "tal", "todo", "bien");
        PairCyclicIterator<String> listIterator = new PairCyclicIterator<>(list);
        for(int i = 0; listIterator.hasNext() && i < 4; i++) {
            System.out.println(listIterator.next());
        }
        System.out.println("----------");
        Set<Integer> set = new HashSet<>();
        PairCyclicIterator<Integer> setIterator = new PairCyclicIterator<>(set);
        System.out.println(setIterator.hasNext());
        setIterator.next();
    }
}
