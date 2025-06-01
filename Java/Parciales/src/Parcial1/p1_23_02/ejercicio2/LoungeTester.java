package Parcial1.p1_23_02.ejercicio2;

public class LoungeTester {
    public static void main(String[] args) {
        // Se instancia un pasajero que cuenta con 3 pases para acceder a los salones
        Passenger mark = new Passenger("Mark Smith", "Delta", 3);
        Passenger sarah = new Passenger("Sarah Johnson", "LATAM", 5);


        // Se instancia una central de salones que arranca abierta
        LoungeCentral central = new LoungeCentral();


        // Se instancia un salón "Ezeiza Lounge" que permite el ingreso de pasajeros
        // de todas las aerolíneas que cuenten con al menos un pase cuando está abierto
        Lounge lounge = new Lounge("Ezeiza Lounge", central);


        System.out.println(lounge); // Ezeiza Lounge has 0 guests


        lounge.enter(mark); // Mark Smith entra al salón utilizando un pase
        System.out.println(lounge); // Ezeiza Lounge has 1 guests
        lounge.enter(mark); // Se puede volver a ingresar al mismo salón utilizando un pase
        lounge.enter(sarah);
        System.out.println(lounge); // Ezeiza Lounge has 3 guests
        lounge.exit(); // Uno de los pasajeros egresa del salón
        System.out.println(lounge); // Ezeiza Lounge has 2 guests


        central.closeLounges(); // Se cierran todos los salones vinculados a la central
        try {
            lounge.enter(mark); // Falla porque el salón está cerrado
        } catch (Exception ex) {
            System.out.println(ex.getMessage()); // Cannot enter lounge
        }
        lounge.exit(); // Se puede realizar el egreso incluso con el salón cerrado
        lounge.exit();
        System.out.println(lounge); // Ezeiza Lounge has 0 guests
        try {
            lounge.exit(); // Falla porque no hay pasajeros que puedan egresar del salón
        } catch (Exception ex) {
            System.out.println(ex.getMessage()); // Lounge is empty
        }


        // Se instancia un salón "The Centurion" que permite el ingreso de hasta 3 pasajeros
        // de todas las aerolíneas que cuenten con al menos un pase cuando está abierto
        Lounge capLounge = new CapLounge("The Centurion", central, 3);

        central.openLounges(); // Se abren todos los salones vinculados a la central

        capLounge.enter(mark);
        capLounge.enter(sarah);
        try {
            capLounge.enter(mark); // Falla porque Mark Smith ya utilizó los 3 pases
        } catch (Exception ex) {
            System.out.println(ex.getMessage()); // Cannot enter lounge
        }
        capLounge.enter(sarah);
        System.out.println(capLounge); // The Centurion has 3 guests up to 3 guests
        try {
            capLounge.enter(sarah); // Falla porque se alcanzó la capacidad máxima
        } catch (Exception ex) {
            System.out.println(ex.getMessage()); // Cannot enter lounge
        }
        capLounge.exit(2); // 2 pasajeros egresan del salón
        System.out.println(capLounge); // The Centurion has 1 guests up to 3 guests
        try {
            capLounge.exit(2); // Falla porque no pueden egresar 2 cuando hay 1 solo
        } catch (Exception ex) {
            System.out.println(ex.getMessage()); // Lounge is empty
        }
        System.out.println(capLounge); // The Centurion has 1 guests up to 3 guests


        // Se instancia un salón "VIP Lounge" que permite el ingreso de hasta 4 pasajeros
        // de la aerolínea "LATAM" que cuenten con al menos un pase cuando está abierto
        Lounge airLounge = new VipLounge("VIP Lounge", central, 4, "LATAM");
        airLounge.enter(sarah);
        System.out.println(airLounge); // LATAM VIP Lounge has 1 guests up to 4 guests
        try {
            // Falla porque no vuela con LATAM
            airLounge.enter(new Passenger("Emily Jones", "Delta", 2));
        } catch (Exception ex) {
            System.out.println(ex.getMessage()); // Cannot enter lounge
        }
    }
}
