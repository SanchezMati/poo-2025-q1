package Parcial2.p2_23_01.ejercicio3;

import java.util.function.Predicate;

public class PartitionableCollectionTester {
    public static void main(String[] args) {
        // Se instancia una colección particionable
        PartitionableCollection<Integer> pC = new PartitionableCollection<>();

        pC.add(6); pC.add(2); pC.add(3); pC.add(4); pC.add(1); pC.add(6);
        System.out.println(pC.isEmpty()); // false
        System.out.println(pC.size()); // 6
        System.out.println(pC.contains(6)); // true

        for(Integer elem : pC) {
            System.out.println(elem); // 6 2 3 4 1 6
        }

        Predicate<Integer> even = i -> i % 2 == 0; // Condición para enteros pares
        Predicate<Integer> odd = even.negate(); // Condición para enteros impares

        // Se obtiene una colección particionable con los pares de pC
        PartitionableCollection<Integer> onlyEven = pC.getSelected(even);
        for(Integer elem : onlyEven) {
            System.out.println(elem); // 6 2 4 6
        }

        // Se obtiene una colección particionable con los impares de pC
        PartitionableCollection<Integer> onlyOdd = pC.getRejected(even);
        for(Integer elem : onlyOdd) {
            System.out.println(elem); // 3 1
        }

        pC.add(12); pC.add(9);

        // Se obtiene una colección particionable con los impares de pC
        PartitionableCollection<Integer> onlyOdd2 = pC.getSelected(odd);
        for(Integer elem : onlyOdd2) {
            System.out.println(elem); // 3 1 9
        }

        // Se obtiene una colección particionable con los divisibles por 3 de onlyEven
        PartitionableCollection<Integer> divBy3 = onlyEven.getSelected(i -> i % 3 == 0);
        for(Integer elem : divBy3) {
            System.out.println(elem); // 6 6
        }
    }
}
