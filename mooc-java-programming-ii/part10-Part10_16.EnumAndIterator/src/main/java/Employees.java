import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Employees {
    private List<Person> emoloyees;

    public Employees() {
        this.emoloyees = new ArrayList<>();
    }

    public void add(Person personToAdd) {
        emoloyees.add(personToAdd);
    }

    public void add(List<Person> peopleToAdd) {
        peopleToAdd.stream()
                .forEach(person -> emoloyees.add(person));
    }

    public void print() {
        Iterator<Person> iterator = emoloyees.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());

        }
    }

    public void print(Education education){
        Iterator<Person> iterator = emoloyees.iterator();
        while (iterator.hasNext()){
            Person next = iterator.next();
            if(next.getEducation().equals(education)){
                System.out.println(next);
            }
        }
    }

    public void fire(Education education){
        Iterator<Person> iterator = emoloyees.iterator();
        while (iterator.hasNext()){
            if(iterator.next().getEducation().equals(education)){
                iterator.remove();
            }
        }
    }
}
