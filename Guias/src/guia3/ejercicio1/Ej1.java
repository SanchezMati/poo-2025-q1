package guia3.ejercicio1;

public class Ej1 {
    public static void main(String[] args) {
        String s1, s2;
        s1 = new String("hola");
        s2 = new String("hola");
        if (s1.equals(s2)) {
            System.out.println("Son iguales");
        } else {
            System.out.println("Son distintos");
        }
    }
}
