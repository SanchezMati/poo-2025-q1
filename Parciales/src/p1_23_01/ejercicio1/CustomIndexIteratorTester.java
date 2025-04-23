package p1_23_01.ejercicio1;

import java.util.Iterator;
import java.util.function.UnaryOperator;

public class CustomIndexIteratorTester {
    public static void main(String[] args) {
        String[] v1 = {"Hola", "a", "todo", "el", "mundo"};

        // Instancia CustomIndex para iterar sobre v1 desde la posición 1 hasta la 4 inclusive
        // pasando por todas las posiciones posibles
        CustomIndex<String> cIdx1 = new CustomIndex<>(v1, 1, 4, new UnaryOperator<Integer>() {
            @Override
            public Integer apply(Integer idx) {
                return idx + 1;
            }
        });
        Iterator<String> stringIt1 = cIdx1.iterator();
        while (stringIt1.hasNext()) {
            System.out.println(stringIt1.next());
        }
        // a
        // todo
        // el
        // mundo

        System.out.println("-------------------------------");

        // Instancia CustomIndex para iterar sobre v1 desde la posición 0 hasta la 3 inclusive
        // pasando sólo por las posiciones pares
        CustomIndex<String> cIdx2 = new CustomIndex<>(v1, 0, 3, idx -> idx + 2);
        Iterator<String> stringIt2 = cIdx2.iterator();


        // Se cambia la función para pasar por todas las posiciones posibles
        cIdx2.setNextIndex(idx -> idx + 1);


        v1[0] = "Hello";


        while (stringIt2.hasNext()) {
            System.out.println(stringIt2.next());
        }
        // Hello
        // todo

        System.out.println("-------------------------------");

        Iterator<String> stringIt3 = cIdx2.iterator();
        while (stringIt3.hasNext()) {
            System.out.println(stringIt3.next());
        }
        // Hello
        // a
        // todo
        // el

        System.out.println("-------------------------------");

        Double[] v2 = {3.5, 6.1, 7.4};


        try {
            // Si start no es menor que end se arroja un error
            CustomIndex<Double> cIdx3 = new CustomIndex<>(v2, 2, 0, idx -> idx - 1);
        } catch (Exception ex) {
            System.out.println(ex.getMessage()); // Invalid combination of start and end index
        }

        System.out.println("-------------------------------");


        // Con la siguiente función para conseguir el próximo índice el iterador no avanza
        CustomIndex<Double> cIdx4 = new CustomIndex<>(v2, 0, 2, idx -> idx);
        Iterator<Double> it4 = cIdx4.iterator();
        System.out.println(it4.next()); // 3.5
        System.out.println(it4.next()); // 3.5
    }
}
