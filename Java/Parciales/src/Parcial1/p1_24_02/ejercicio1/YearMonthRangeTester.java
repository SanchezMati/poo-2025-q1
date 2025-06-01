package Parcial1.p1_24_02.ejercicio1;

import java.time.YearMonth;

public class YearMonthRangeTester {
    public static void main(String[] args) {
        YearMonth now = YearMonth.of(2024, 9); // Ejemplos de uso de java.time.YearMonth
        System.out.println(now); // 2024-09
        YearMonth nowPlus2Months = now.plusMonths(2);
        System.out.println(nowPlus2Months); // 2024-11
        System.out.println(nowPlus2Months.plusMonths(2)); // 2025-01
        System.out.println(nowPlus2Months.plusYears(2)); // 2026-11
        System.out.println(now.isAfter(nowPlus2Months)); // false


        // Se instancia un rango de mes-año [09/2024, 01/2025] donde el salto es de 1 mes
        YearMonthRange ymRange = new YearMonthRange(
                YearMonth.of(2024, 9), YearMonth.of(2025,1));
        for(YearMonth aux : ymRange) {
            System.out.println(aux);
        }
        // 2024-09
        // 2024-10
        // 2024-11
        // 2024-12
        // 2025-01


        // Se instancia un rango de mes-año [09/2024, 03/2025] donde el salto es de 6 meses
        YearMonthRange ymRange6Months = new YearMonthRange(
                YearMonth.of(2024, 9), YearMonth.of(2025, 3),
                aYearMonth -> aYearMonth.plusMonths(6));

        for(YearMonth aux : ymRange6Months) {
            System.out.println(aux);
        }
        // 2024-09
        // 2025-03


        // Se instancia un rango de mes-año [09/2024, 03/2027] donde el salto es de 2 años
        YearMonthRange ymRange2Years = new YearMonthRange(
                YearMonth.of(2024, 9), YearMonth.of(2027, 3),
                aYearMonth -> aYearMonth.plusYears(2));
        for(YearMonth aux : ymRange2Years) {
            System.out.println(aux);
        }
        // 2024-09
        // 2026-09
    }
}
