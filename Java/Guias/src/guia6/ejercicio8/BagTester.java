package guia6.ejercicio8;

public class BagTester {
    public static void main(String[] args) {
        Bag<String> bag = new BagImpl<>();
        bag.add("Hola");
        bag.add("Hola");
        System.out.println(bag.count("Hola"));     // 2
        bag.add("Chau");
        System.out.println(bag.size());            // 3
        System.out.println(bag.sizeDistinct());    // 2
        System.out.println(bag.contains("Chau"));  // true
        bag.remove("Hola");
        System.out.println(bag.count("Hola"));     // 1
        bag.remove("Hola");
        System.out.println(bag.contains("Hola"));  // false
        bag.remove("Hola");                        // NoSuchElementException
    }
}
