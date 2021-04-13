
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        // implement here your program that uses the PersonalInformation class

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.print("First Name: ");
            String firstName = scanner.nextLine();
            if (firstName.isEmpty()){
                break;
            }

            System.out.print("Last Name: ");
            String lastName = scanner.nextLine();

            System.out.print("Identification number:");
            String idNo = scanner.nextLine();

            infoCollection.add(new PersonalInformation(firstName,lastName,idNo));
        }
        System.out.println();
        for(PersonalInformation i : infoCollection){
            System.out.println(i.getFirstName() + " " + i.getLastName());
        }
    }
}
