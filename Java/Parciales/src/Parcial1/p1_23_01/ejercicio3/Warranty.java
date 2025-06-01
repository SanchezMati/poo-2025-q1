package Parcial1.p1_23_01.ejercicio3;

public enum Warranty {
    BASIC {
        @Override
        public double getWarrantyPrice(double price) {
            return 120;
        }
    },
    PREMIUM {
        @Override
        public double getWarrantyPrice(double price) {
            return price * 0.2;
        }
    };

    public abstract double getWarrantyPrice(double price);
}
