package Parcial1.p1_23_02.ejercicio1;


import Parcial1.slots.ParkRide;
import Parcial1.slots.ParkSlot;

import java.time.LocalTime;
import java.util.Iterator;


public class ParkRideTester {
    public static void main(String[] args) {
        // Ejemplo de uso de la clase java.time.LocalTime
        LocalTime ten = LocalTime.of(10,0);
        System.out.println(ten); // 10:00
        long minutesToAdd = 45;
        LocalTime tenPlus45 = ten.plusMinutes(minutesToAdd);
        System.out.println(tenPlus45); // 10:45
        LocalTime tenPlus65 = ten.plusMinutes(65);
        System.out.println(tenPlus65); // 11:05
        System.out.println(tenPlus65.isBefore(tenPlus45)); // false

        System.out.println("-------------------------------");

        // Soarin abre a las 09:00, cierra a las 10:00 y los slots son de 15 minutos
        ParkRide soarin = new ParkRide("Soarin", LocalTime.of(9,0), LocalTime.of(10,0), 15);
        for(ParkSlot soarinSlot : soarin) {
            System.out.println(soarinSlot);
        }
        // Soarin <> 09:00 Slot
        // Soarin <> 09:15 Slot
        // Soarin <> 09:30 Slot
        // Soarin <> 09:45 Slot

        System.out.println("-------------------------------");

        // Test Track abre a las 19:30, cierra a las 21:00 y los slots son de 60 minutos
        ParkRide tT = new ParkRide("Test Track", LocalTime.of(19,30), LocalTime.of(21,0), 60);
        for(ParkSlot tTSlot : tT) {
            System.out.println(tTSlot);
        }
        // Test Track <> 19:30 Slot
        // Test Track <> 20:30 Slot

        System.out.println("-------------------------------");


        Iterator<ParkSlot> soarinIt = soarin.iterator();
        // Se cambia el horario de cierre de Soarin a las 09:25
        soarin.setCloseTime(LocalTime.of(9,25));


        while(soarinIt.hasNext()) {
            System.out.println(soarinIt.next());
        }
        // Soarin <> 09:00 Slot
        // Soarin <> 09:15 Slot
        // Soarin <> 09:30 Slot
        // Soarin <> 09:45 Slot

        System.out.println("-------------------------------");

        for(ParkSlot soarinSlot : soarin) {
            System.out.println(soarinSlot);
        }
        // Soarin <> 09:00 Slot
        // Soarin <> 09:15 Slot


        System.out.println("-------------------------------");

        try {
            // Se arroja un error porque el horario de cierre es anterior al de apertura
            new ParkRide("Spaceship Earth", LocalTime.of(9,30), LocalTime.of(7,30), 10);
        } catch (Exception ex) {
            System.out.println(ex.getMessage()); // Close time cannot be before open time
        }
        try {
            // Se arroja un error porque la atracción debe abrir y cerrar el mismo día
            new ParkRide("Spaceship Earth", LocalTime.of(23,30), LocalTime.of(1,0), 30);
        } catch (Exception ex) {
            System.out.println(ex.getMessage()); // Close time cannot be before open time
        }
        try {
            // Se arroja un error porque la cantidad de minutos de los slots debe ser positiva
            new ParkRide("Spaceship Earth", LocalTime.of(9,0), LocalTime.of(10,0), 0);
        } catch (Exception ex) {
            System.out.println(ex.getMessage()); // Slot minutes must be positive
        }
        ParkRide seaBase = new ParkRide("SeaBase", LocalTime.of(9,0), LocalTime.of(9,0), 45);
        try {
            seaBase.setCloseTime(LocalTime.of(8, 30));
        } catch (Exception ex) {
            System.out.println(ex.getMessage()); // Close time cannot be before open time
        }
        try {
            // Se arroja un error pues los horarios de apertura y cierre coinciden
            System.out.println(seaBase.iterator().next());
        } catch (Exception ex) {
            System.out.println(ex.getClass()); // class java.util.NoSuchElementException
        }
    }
}