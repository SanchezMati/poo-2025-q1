package guia5.ejercicio12;

import java.time.LocalDate;
import java.util.Iterator;

public class LocalDateIntervalTester {
    public static void main(String[] args) {
        // Ejemplo de uso de la clase LocalDate
        LocalDate today = LocalDate.of(2020, 3, 1);
        System.out.println(today);
        LocalDate todayPlus10 = today.plusDays(10);
        System.out.println(todayPlus10);
        System.out.println(todayPlus10.isAfter(today));
        System.out.println("----------");
        // Ejemplo de uso de la clase LocalDateInterval
        LocalDateInterval localDateInterval = new LocalDateInterval(today, todayPlus10, 3);
        for(LocalDate localDate : localDateInterval) {
            System.out.println(localDate);
        }
        System.out.println("----------");
        Iterator<LocalDate> localDateIterator = new LocalDateInterval(today, today.plusDays(2), 1).iterator();
        while(localDateIterator.hasNext()) {
            System.out.println(localDateIterator.next());
        }
    }

    /*  Salida:
        2020-03-01
        2020-03-11
        true
        ----------
        2020-03-01
        2020-03-04
        2020-03-07
        2020-03-10
        ----------
        2020-03-01
        2020-03-02
        2020-03-03
    */
}
