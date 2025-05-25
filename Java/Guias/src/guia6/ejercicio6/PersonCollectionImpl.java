package guia6.ejercicio6;

import java.util.*;

public class PersonCollectionImpl implements PersonCollection{
    private Map<String, Map<String, Person>> map = new HashMap<>();

    @Override
    public void addPerson(Person aPerson) {
        if(!map.containsKey(aPerson.getLastName()))  {
            map.put(aPerson.getLastName(), new HashMap<>());
        }
        map.get(aPerson.getLastName()).put(aPerson.getFirstName(), aPerson);
    }

    @Override
    public List<Person> findByLastName(String lastName) {
        if(!map.containsKey(lastName)) {
            return new ArrayList<>();
        }
        return new ArrayList<>(map.get(lastName).values());
    }

    @Override
    public Person findByName(String firstName, String lastName) {
        if(map.containsKey(lastName)) {
            return map.get(lastName).get(firstName);
        }
        return null;
    }
}
