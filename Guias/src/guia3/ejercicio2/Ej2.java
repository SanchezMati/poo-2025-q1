package guia3.ejercicio2;

public class Ej2 {
    public static void main(String args[]) {
        String s = "hola";
        System.out.println(s instanceof String);
        System.out.println(s instanceof Object);
        System.out.println(s.getClass().equals(String.class));
        System.out.println(s.getClass().equals(Object.class));
    }
}
