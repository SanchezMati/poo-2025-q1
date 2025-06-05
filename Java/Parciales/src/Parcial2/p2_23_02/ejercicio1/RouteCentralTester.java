package Parcial2.p2_23_02.ejercicio1;

public class RouteCentralTester {
    public static void main(String[] args) {
        // Se instancia una central de rutas con una función para calcular el costo individual
        // de cada una de las dos rutas directas cuando se cargue una ruta directa ida y vuelta
        RouteCentral routeCentral = new RouteCentral(twoWayCost -> twoWayCost / 2);
        // Se agrega la ruta directa EZE->MIA a 1000 millas. Si la ruta ya existe, no hace nada
        routeCentral.addOneWayRoute("EZE", "MIA", 1000);
        // Se obtienen las millas de la ruta directa EZE->MIA
        System.out.println(routeCentral.getDirectRouteMiles("EZE", "MIA")); // 1000
        // Se arroja un error al obtener las millas de la ruta directa MIA->EZE porque no existe
        try {
            System.out.println(routeCentral.getDirectRouteMiles("MIA", "EZE"));
        } catch (Exception ex) {
            System.out.println(ex.getMessage()); // Route does not exists.
        }
        // Se cambian las millas de la ruta directa EZE->MIA
        routeCentral.changeRouteCost("EZE", "MIA", 1250);
        System.out.println(routeCentral.getDirectRouteMiles("EZE", "MIA")); // 1250
        // Se arroja un error al cambiar las millas de la ruta directa MIA->EZE porque no existe
        try {
            routeCentral.changeRouteCost("MIA", "EZE", 8000);
        } catch (Exception ex) {
            System.out.println(ex.getMessage()); // Route does not exists.
        }
        // Se agrega una ruta directa ida/vuelta EZE<->SCL a 5000 millas donde el costo de la ruta
        // de ida EZE->SCL y de la ruta de vuelta SCL->EZE se obtiene utilizando la función recibida
        // en el constructor.
        // Si la ruta de ida existe, no hace nada. Si la ruta de vuelta existe, no hace nada.
        routeCentral.addTwoWayRoute("EZE", "SCL", 5000);
        System.out.println(routeCentral.getDirectRouteMiles("EZE", "SCL")); // 2500
        System.out.println(routeCentral.getDirectRouteMiles("SCL", "EZE")); // 2500
        // Se cambian las millas de la ruta EZE->SCL
        routeCentral.changeRouteCost("EZE", "SCL", 3500);
        System.out.println(routeCentral.getDirectRouteMiles("EZE", "SCL")); // 3500
        System.out.println(routeCentral.getDirectRouteMiles("SCL", "EZE")); // 2500
        routeCentral.addOneWayRoute("SCL", "MIA", 7500);
        // Se obtienen las millas de la ruta con escala EZE->SCL->MIA, a partir de las millas
        // de las rutas directas EZE->SCL y SCL->MIA
        System.out.println(routeCentral.getOneStopRouteMiles("EZE", "SCL", "MIA")); // 11000
        System.out.println(routeCentral.getOneStopRouteMiles("EZE", "SCL", "EZE")); // 6000
        // Se arroja un error al obtener las millas de la ruta con escala EZE->SCL->YVR
        // porque no existe
        try {
            System.out.println(routeCentral.getOneStopRouteMiles("EZE", "SCL", "YVR"));
        } catch (Exception ex) {
            System.out.println(ex.getMessage()); // Route does not exists.
        }
        // Se intenta agregar una ruta directa ida/vuelta EZE<->MIA a 9000 millas donde el costo
        // de la ruta de ida EZE->MIA y de la ruta de vuelta MIA->EZE se obtiene utilizando la
        // función recibida en el constructor.
        // Sólo se agrega la ruta de vuelta porque la de ida ya existe
        routeCentral.addTwoWayRoute("EZE", "MIA", 9000);
        System.out.println(routeCentral.getDirectRouteMiles("EZE", "MIA")); // 1250
        System.out.println(routeCentral.getDirectRouteMiles("MIA", "EZE")); // 4500
    }
}
