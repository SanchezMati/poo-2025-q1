package Parcial1.p1_23_02.ejercicio2;

public class LoungeCentral {
    private boolean isOpen = true;

    public void openLounges() {
        isOpen = true;
    }

    public void closeLounges() {
        isOpen = false;
    }

    public boolean isOpen() {
        return isOpen;
    }
}
