package guia2.ejercicio5;

import java.awt.*;
import java.util.Scanner;

public class Palindromo {
    private static String text;

    public static void main(String[] args) {
        StringBuilder text = new StringBuilder();
        for (String arg : args) {
            text.append(arg.toLowerCase());
        }

        if(esPalindromo(text.toString())) {
            System.out.println("Palindromo");
        }
        else {
            System.out.println("No es palindromo");
        }


    }

    private static boolean esPalindromo(String text) {
        for (int i = 0; i < text.length() / 2; i++) {
            if (text.charAt(i) != text.charAt(text.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
