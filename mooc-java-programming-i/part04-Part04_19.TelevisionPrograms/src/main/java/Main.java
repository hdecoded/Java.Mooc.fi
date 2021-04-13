import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.print("Name: ");
            String name = scanner.nextLine();
            if (name.isEmpty()){
                break;
            }

            System.out.print("Duriation: ");
            int duriation = Integer.valueOf(scanner.nextLine());

            programs.add(new TelevisionProgram(name,duriation));
        }

        System.out.print("Maximum Duriation? ");
        int maxDuriation = Integer.valueOf(scanner.nextLine());

        for (TelevisionProgram i : programs){
            if(i.getDuration() <= maxDuriation){
                System.out.println(i);
            }
        }

    }
}
