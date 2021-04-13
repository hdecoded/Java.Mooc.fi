import java.util.ArrayList;

public class Room {

    ArrayList<Person> persons = new ArrayList<>();

    public Room() {
    }

    public void add(Person person) {
        this.persons.add(person);
    }

    public boolean isEmpty() {
        return persons.isEmpty();
    }

    public ArrayList<Person> getPersons() {
        return persons;
    }

    public Person shortest() {
        if (persons.isEmpty()) {
            return null;
        }

        Person shortest = persons.get(0);

        for (Person person : persons)
            if (shortest.getHeight() > person.getHeight()) {
                shortest = person;
            }
        return shortest;
    }

    public Person take(){
        if(persons.isEmpty()){
            return null;
        }
        Person shortest = shortest();
        persons.remove(shortest);
        return shortest;
    }
}
