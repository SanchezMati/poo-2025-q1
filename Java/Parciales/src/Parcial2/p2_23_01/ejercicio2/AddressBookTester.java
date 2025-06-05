package Parcial2.p2_23_01.ejercicio2;


public class AddressBookTester {
    public static void main(String[] args) {
        // Se crea un grupo Personal
        AddressBookGroup personal = new AddressBookGroup("Personal");
        AddressBookGroup work = new AddressBookGroup("Work");

        // Se instancia una agenda que empieza sin contactos
        AddressBook addressBook = new AddressBook();
        // Agrega el contacto Paul con el teléfono 6666-6666 al grupo Personal
        addressBook.addContact(personal, "Paul", "6666-6666");
        addressBook.addContact(personal, "Mary", "4444-4444");
        addressBook.addContact(work, "Paul", "5555-5555");

        // Obtiene el contacto Paul del grupo Personal
        System.out.println(addressBook.getContact(personal, "Paul"));
        // | Paul has 6666-6666 as phone number |

        // Obtiene todos los contactos del grupo Personal
        // en orden alfabético por nombre del contacto
        for(Contact contact : addressBook.getAllContacts(personal)) {
            System.out.println(contact);
        }
        // | Mary has 4444-4444 as phone number |
        // | Paul has 6666-6666 as phone number |


        for(Contact contact : addressBook.getAllContacts(new AddressBookGroup("Work"))) {
            System.out.println(contact);
        }
        // | Paul has 5555-5555 as phone number |


        // Obtiene todos los contactos de todos los grupos
        // en orden alfabético por nombre del grupo
        // y desempata alfabético por nombre del contacto
        for(Contact contact : addressBook.getAllContacts()) {
            System.out.println(contact);
        }
        // | Mary has 4444-4444 as phone number |
        // | Paul has 6666-6666 as phone number |
        // | Paul has 5555-5555 as phone number |

        // Renombra el contacto Paul a Pablo en el grupo Personal
        addressBook.renameContact(personal, "Paul", "Pablo");

        for(Contact contact : addressBook.getAllContacts()) {
            System.out.println(contact);
        }
        // | Mary has 4444-4444 as phone number |
        // | Pablo has 6666-6666 as phone number |
        // | Paul has 5555-5555 as phone number |


        // Arroja un error porque no existe el contacto Mary en el grupo Work
        try {
            addressBook.getContact(work, "Mary");
        } catch (Exception ex) {
            System.out.println(ex.getClass()); // class java.lang.IllegalArgumentException
        }


        // Arroja un error porque no existe el contacto Mary en el grupo Work
        try {
            addressBook.renameContact(work, "Mary", "María");
        } catch (Exception ex) {
            System.out.println(ex.getClass()); // class java.lang.IllegalArgumentException
        }

        AddressBookGroup school = new AddressBookGroup("School");
        System.out.println(addressBook.getAllContacts(school).isEmpty()); // true


        System.out.println(new AddressBook().getAllContacts().isEmpty()); // true
    }
}
