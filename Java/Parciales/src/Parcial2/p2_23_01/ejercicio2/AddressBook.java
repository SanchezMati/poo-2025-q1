package Parcial2.p2_23_01.ejercicio2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.SortedMap;
import java.util.TreeMap;

public class AddressBook {
    private final SortedMap<AddressBookGroup, SortedMap<String, Contact>> addressBook = new TreeMap<>();

    public void addContact(AddressBookGroup group, String name, String number) {
        addressBook.putIfAbsent(group, new TreeMap<>());
        addressBook.get(group).put(name, new Contact(name, number));
    }

    private void checkContact(AddressBookGroup group, String name) {
        if(!addressBook.getOrDefault(group, new TreeMap<>()).containsKey(name)) {
            throw new IllegalArgumentException();
        }
    }

    public Contact getContact(AddressBookGroup group, String name) {
        checkContact(group, name);
        return addressBook.get(group).get(name);
    }

    public Collection<Contact> getAllContacts(AddressBookGroup group) {
        return addressBook.getOrDefault(group, new TreeMap<>()).values();
    }

    public Collection<Contact> getAllContacts() {
        Collection<Contact> toReturn = new ArrayList<>();
        for (AddressBookGroup group : addressBook.keySet()) {
            toReturn.addAll(getAllContacts(group));
        }
        return toReturn;
    }

    public void renameContact(AddressBookGroup group, String oldName, String newName) {
        checkContact(group, oldName);
        Contact contact = addressBook.get(group).remove(oldName);
        addContact(group, newName, contact.getPhoneNumber());
    }

}
