
import java.util.ArrayList;
import java.util.Scanner;

public class NumberOfStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<>();
        while (true){

            String text = scanner.nextLine();

            if (text.equals("end")){
                break;
            }
            words.add(text);
        }
        int counter = 0;
        for(String word : words){
            counter ++;
        }
        System.out.println(counter);


    }
}
