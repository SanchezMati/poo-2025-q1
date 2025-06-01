package Parcial1.p1_23_01.ejercicio3;


public class ProductsTester {
    public static void main(String[] args) {
        // Se instancia la Marca Apple con 5% de descuento en todos sus productos
        Brand apple = new Brand("Apple", 0.05);


        // Se instancia un dispositivo de la marca Apple, de nombre "iPhone 13"
        // con precio base $1000 y una eficiencia energética Nivel B
       Device iPhone = new Device("iPhone 13", apple, 1000, Energy.LEVEL_B);


        // Se imprime en pantalla el detalle del dispositivo electrónico
        System.out.println(iPhone);
        // [Device] iPhone 13 from Apple with price $1000.00 with Energy Label B


        // Se obtiene el precio final del dispositivo sin garantía
        // Precio Base - Descuento Marca + Cargo Nivel B
        //    $1000    -   $1000 * 5%    +   $1000 * 10%
        //    $1000    -   $1000 * 0,05  +   $1000 * 0,10
        System.out.println(iPhone.getFinalPrice()); // 1050.0


        // Se obtiene el precio final del dispositivo con garantía básica
        // Precio Base - Descuento Marca +  Cargo Nivel B + Garantía Básica
        //    $1000    -   $1000 * 5%    +   $1000 * 10%  +     $120
        //    $1000    -   $1000 * 0,05  +   $1000 * 0,10 +     $120
        System.out.println(iPhone.getFinalPrice(Warranty.BASIC)); // 1170.0


        // Se instancia un accesorio de la marca Apple, de nombre "AirPods"
        // con precio base $500 y una descripción "Dolby Atmos"
        Accessory airpods = new Accessory("AirPods", apple, 500, "Dolby Atmos");
        System.out.println(airpods);
        // [Accessory] AirPods from Apple with price $500.00 with feature Dolby Atmos


        // Se obtiene el precio final del accesorio sin garantía
        // Precio Base - Descuento Marca
        //    $500     -   $500 * 5%
        //    $500     -   $500 * 0,05
        System.out.println(airpods.getFinalPrice()); // 475.0


        // Se obtiene el precio final del accesorio con garantía premium
        // Precio Base - Descuento Marca + Garantía Premium
        //    $500     -   $500 * 5%     +   $500 * 20%
        //    $500     -   $500 * 0,05   +   $500 * 0,20
        System.out.println(airpods.getFinalPrice(Warranty.PREMIUM)); // 575.0


        // Se cambia el descuento de los productos de Apple a 0%
        apple.setDiscount(0);


        System.out.println(iPhone.getFinalPrice()); // 1100.0


        // Se obtiene el precio final del dispositivo con garantía básica
        System.out.println(iPhone.getFinalPrice(Warranty.BASIC)); // 1220.0


        System.out.println(airpods.getFinalPrice()); // 500.0


        // Se obtiene el precio final del accesorio con garantía premium
        System.out.println(airpods.getFinalPrice(Warranty.PREMIUM)); // 600.0


        try {
            // Falla al instanciar la marca Samsung
            // porque el descuento no está entre 0.00 y 1.00
            Brand samsung = new Brand("Samsung", 15.0);
        } catch (InvalidDiscountException ex) {
            System.out.println(ex.getMessage()); // Invalid Discount for Brand Samsung
        }


        try {
            // Falla al cambiar el descuento de la marca Apple
            // porque el descuento no está entre 0.00 y 1.00
            apple.setDiscount(-2.00);
        } catch (InvalidDiscountException ex) {
            System.out.println(ex.getMessage()); // Invalid Discount for Brand Apple
        }
    }
}
