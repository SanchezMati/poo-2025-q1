package guia6.ejercicio6;
import java.time.LocalDate;

public class PersonTester {
    public static void main(String[] args) {
        Person mati = new Person("Mati", "Sanchez", LocalDate.of(2005, 3, 7));
        Person salvi = new Person("Salvi", "Sanchez", LocalDate.of(2011, 12, 28));
        Person cris = new Person("Cris", "Novelli", LocalDate.of(2005, 3, 7));
        Person edu = new Person("Edu", "Novelli", LocalDate.of(2005, 3, 7));

        PersonCollection collection = new PersonCollectionImpl();
        collection.addPerson(mati);
        collection.addPerson(salvi);
        collection.addPerson(cris);
        collection.addPerson(edu);

    }
}
