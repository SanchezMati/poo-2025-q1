package Parcial2.p2_23_01.ejercicio2;

public class Contact implements Comparable<Contact> {
    private String name;
    private final String phoneNumber;

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return "| %s has %s as phone number |".formatted(name, phoneNumber);
    }


    @Override
    public int compareTo(Contact o) {
        return name.compareTo(o.name);
    }
}
