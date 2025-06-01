package Parcial1.p1_24_02.ejercicio3;

import java.time.LocalDate;

public class RentalTester {
    public static void main(String[] args) {
        LocalDate now = LocalDate.of(2024, 9, 19); // Ejemplos de uso de java.time.LocalDate
        System.out.println(now); // 2024-09-19
        LocalDate nowPlus2Days = now.plusDays(2);
        System.out.println(nowPlus2Days); // 2024-09-21
        System.out.println(now.isBefore(nowPlus2Days)); // true
        System.out.println(nowPlus2Days.isAfter(now)); // true

        System.out.println("--------------------------------------");

        // Se instancia una central con dos locaciones conocidas
        String[] rentalLocations = new String[]{"Rotorua", "Paihia"};
        RentalCentral central = new RentalCentral(rentalLocations);


        // Se instancia un alquiler desde la locación Rotorua el 19/09/2024
        // donde se verifica que la locación de alquiler es conocida
        // y el alquiler podrá finalizarse si:
        //      la locación de devolución es conocida
        //      y la fecha de devolución es posterior a la de alquiler
        Rental rental = new Rental("Rotorua", LocalDate.of(2024, 9, 19), central);
        System.out.println(rental); // Rental from Rotorua on 2024-09-19 has 0 kms
        rental.addKms(100); // Se le adicionan 100kms al alquiler
        System.out.println(rental); // Rental from Rotorua on 2024-09-19 has 100 kms
        // Se consulta si este alquiler puede finalizar en la locación Paihia el 23/09/2024
        System.out.println(rental.canDrop("Paihia", LocalDate.of(2024, 9, 23))); // true
        System.out.println(rental.canDrop("Rotorua", LocalDate.of(2023, 1, 1))); // false
        System.out.println(rental.canDrop("Queenstown", LocalDate.of(2024, 9, 23))); // false


        // Se instancia un alquiler desde la locación Rotorua el 19/09/2024
        // con máxima cantidad de días (3)
        // donde se verifica que la locación de alquiler es conocida
        // y el alquiler podrá finalizarse si:
        //      la locación de devolución coincide con la de alquiler
        //      y la fecha de devolución es posterior a la de alquiler
        //      y no supera la máxima cantidad de días
        Rental sameDropRental = new RentalByDays("Rotorua", LocalDate.of(2024, 9, 19), central, 3);
        System.out.println(sameDropRental);
        // Same Drop Rental from Rotorua on 2024-09-19 has 0 kms for up to 3 days
        System.out.println(sameDropRental.canDrop("Rotorua", LocalDate.of(2024, 9, 22))); // true
        System.out.println(sameDropRental.canDrop("Rotorua", LocalDate.of(2024, 9, 23))); // false
        System.out.println(sameDropRental.canDrop("Paihia", LocalDate.of(2024, 9, 22))); // false
        sameDropRental.addKms(200);
        System.out.println(sameDropRental);
        // Same Drop Rental from Rotorua on 2024-09-19 has 200 kms for up to 3 days


        // Se instancia un alquiler desde la locación Rotorua el 19/09/2024
        // con mínima cantidad de días (5) y máxima cantidad de kms (300)
        // donde se verifica que la locación de alquiler es conocida
        // y que la adición de kms no supere el máximo indicado
        // y el alquiler podrá finalizarse si:
        //      la locación de devolución es conocida
        //      y la fecha de devolución es posterior a la de alquiler
        //      y supera la mínima cantidad de días
        Rental maxKmRental = new RentalByKms("Rotorua", LocalDate.of(2024, 9, 19), central, 300, 5);
        System.out.println(maxKmRental.canDrop("Rotorua", LocalDate.of(2024, 9, 20))); // false
        System.out.println(maxKmRental.canDrop("Rotorua", LocalDate.of(2025, 1, 1))); // true
        System.out.println(maxKmRental.canDrop("Paihia", LocalDate.of(2024, 9, 24))); // true
        maxKmRental.addKms(200);
        System.out.println(maxKmRental);
        // Max Rental from Rotorua on 2024-09-19 has 200 kms, at least 5 days and up to 300 kms
        maxKmRental.addKms(100);
        System.out.println(maxKmRental);
        // Max Rental from Rotorua on 2024-09-19 has 300 kms, at least 5 days and up to 300 kms


        // Falla pues de añadirse los kms serían 301 y supera los 300
        try {
            maxKmRental.addKms(1);
        } catch (RentalException ex) {
            System.out.println(ex.getMessage()); // Reached Max Kms Limit
        }


        // Se actualizan las locaciones conocidas por la central
        central.setRentalLocations(new String[]{"Paihia"});


        // Falla pues se instancia un alquiler desde la locación Rotorua el 19/09/2024
        // y NO se verifica que la locación de alquiler es conocida
        try {
        Rental wrongRental = new Rental("AlquileresJuan", LocalDate.of(2024, 9, 19), central);
        } catch (RentalException ex) {
            System.out.println(ex.getMessage()); // PickUp Location Not Found
        }


        System.out.println(rental.canDrop("Rotorua", LocalDate.of(2024, 9, 23))); // false

        System.out.println(sameDropRental.canDrop("Rotorua", LocalDate.of(2024, 9, 22))); // false

        System.out.println(maxKmRental.canDrop("Rotorua", LocalDate.of(2025, 1, 1))); // false
    }
}
