
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> fileData = new ArrayList<String>();

        System.out.print("File? ");
        String file = scanner.nextLine();

        try (Scanner fileScanner = new Scanner(Paths.get(file))){

            while(fileScanner.hasNextLine()){
                fileData.add(fileScanner.nextLine());
            }

        } catch (IOException e) {
            System.out.println("File " + file + "not Found");
        }

        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());

        int counter = 0;
        for (String i : fileData){
            if (Integer.valueOf(i) >= lowerBound && Integer.valueOf(i) <= upperBound ){
                counter++;
            }
        }
        System.out.println("Numbers: " + counter);
    }

}
