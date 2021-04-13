
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a string:");
        String s = scan.nextLine();

        System.out.println("Give an integer:");
        int aInt = Integer.valueOf(scan.nextLine());

        System.out.println("Give a double:");
        Double aDouble = Double.valueOf(scan.nextLine());

        System.out.println("Give a boolean:");
        Boolean aBoolean = Boolean.valueOf(scan.nextLine());

        System.out.println("You gave the string " + s);
        System.out.println("You gave the integer " + aInt);
        System.out.println("You gave the double " + aDouble);
        System.out.println("You gave the boolean " + aBoolean);
    }
}
