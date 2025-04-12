package taller4.comparable;

import java.util.Arrays;
import java.util.Comparator;

public class PhoneNumberTester {

    public static void main(String[] args) {
        PhoneNumber[] phoneNumbers = new PhoneNumber[] {
                new PhoneNumber(54,11, 12345678),
                new PhoneNumber(0, 0, 44556677),
                new PhoneNumber(54, 11, 98765432)
        };

        /**
         * 1. Imprimir todos los elementos de un array invocando al toString de cada número
         */
        System.out.println(Arrays.toString(phoneNumbers));

        /**
         * 2. Orden Natural, opción 1
         * (Usa el compareTo implementado en PhoneNumber)
         */
        Arrays.sort(phoneNumbers);
        System.out.println(Arrays.toString(phoneNumbers));

        /**
         * 3. Orden Natural, opción 2
         */
        Arrays.sort(phoneNumbers, Comparator.naturalOrder());
        System.out.println(Arrays.toString(phoneNumbers));

        /**
         * 4. Orden Descendente con clase que implementa Comparator
         */
        Arrays.sort(phoneNumbers, new DescendingPhoneNumberComparator());
        System.out.println(Arrays.toString(phoneNumbers));

        /**
         * 5. Orden Descendente con clase anónima
         */
        Arrays.sort(phoneNumbers, new Comparator<PhoneNumber>() {
            @Override
            public int compare(PhoneNumber o1, PhoneNumber o2) {
                int result = Integer.compare(o2.getAreaCode(), o1.getAreaCode());
                if(result == 0) {
                    result = Integer.compare(o2.getPrefix(), o1.getPrefix());
                    if(result == 0) {
                        result = Integer.compare(o2.getLineNumber(), o1.getLineNumber());
                    }
                }
                return result;
            }
        });
        System.out.println(Arrays.toString(phoneNumbers));

        /**
         * 6. Orden inverso al natural
         */
        Arrays.sort(phoneNumbers, Comparator.reverseOrder());
        System.out.println(Arrays.toString(phoneNumbers));
    }

}