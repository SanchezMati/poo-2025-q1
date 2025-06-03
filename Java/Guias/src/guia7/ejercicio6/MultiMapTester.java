package guia7.ejercicio6;

public class MultiMapTester {
    public static void main(String[] args) {
        MultiMap<String,Integer> m = new MultiMapImpl<>();
        m.put("hola", 4);
        m.put("hola", 3);
        m.put("hola", 2);
        m.put("chau", 4);
        m.put("chau", 5);
        m.put("adios", 6);
        System.out.println(m.size());
        System.out.println("#####");
        for(Integer i : m.get("hola")) {
            System.out.println(i);
        }
        System.out.println("#####");
        m.remove("adios");
        m.remove("hola", 2);
        for(Integer i : m.get("hola")) {
            System.out.println(i);
        }
        System.out.println("#####");
        System.out.println(m.get("adios"));
        System.out.println("#####");
        System.out.println(m.size());
    }
}

/*
        6
        #####
        4
        3
        2
        #####
        4
        3
        #####
        null
        #####
        4
*/
