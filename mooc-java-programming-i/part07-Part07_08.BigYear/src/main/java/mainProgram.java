import java.util.ArrayList;
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter

        Scanner scan = new Scanner(System.in);

        ArrayList<Bird> birds = new ArrayList<>();
        while (true) {

            System.out.print("? ");

            String command = scan.nextLine();
            if (command.equals("Add")) {
                System.out.print("Name: ");
                String name = scan.nextLine();
                System.out.print("Name in Latin: ");
                String nameInLatin = scan.nextLine();

                Bird bird = new Bird(name, nameInLatin);
                birds.add(bird);

            }

            if (command.equals("Observation")) {
                System.out.println("Bird? ");

                String birdName = scan.nextLine();
                for (Bird bird : birds) {
                    int count = 0;
                    String birdN = bird.getName();
                    if (bird.getName().equals(birdName)) {
                        bird.observed();
                        count++ ;
                    } else if(count != 0){
                        System.out.println("Not a bird!");
                    }
                }
            }

            if (command.equals("All")) {
                for (Bird bird : birds) {
                    System.out.println(bird);
                }
            }

            if (command.equals("One")) {
                System.out.println("Bird? ");
                String birdName = scan.nextLine();
                for (Bird bird : birds) {
                    if (bird.getName().equals(birdName)) {
                        System.out.println(bird);
                    }
                }
            }

            if (command.equals("Quit")) {
                break;
            }

        }

    }
}
