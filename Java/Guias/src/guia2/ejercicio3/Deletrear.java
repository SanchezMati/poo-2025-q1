package guia2.ejercicio3;

import java.util.Arrays;

public class Deletrear {
    public static void main(String[] args) {
        for (String arg : args) {
            int i = 0;
            for(; i < arg.length()-1; i++) {
                System.out.print(arg.charAt(i) + "-");
            }
            System.out.println(arg.charAt(i));
        }
    }
}
