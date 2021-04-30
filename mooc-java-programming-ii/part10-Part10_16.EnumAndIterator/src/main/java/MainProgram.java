
public class MainProgram {

    public static void main(String[] args) {
        // test your classes here

        Employees t = new Employees();
        Person h = new Person("Arto", Education.PHD);
        Person y = new Person("Arto2", Education.HS);

        t.add(h);
        t.add(y);
        t.fire(Education.HS);
        t.print(Education.PHD);
    }
}
