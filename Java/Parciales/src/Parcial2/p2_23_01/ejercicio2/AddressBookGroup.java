package Parcial2.p2_23_01.ejercicio2;

public class AddressBookGroup implements Comparable<AddressBookGroup> {
    private final String name;

    public AddressBookGroup(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(AddressBookGroup o) {
        return name.compareTo(o.name);
    }
}
