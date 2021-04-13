
import java.util.ArrayList;

public class PrintInRange {

    public static void main(String[] args) {
        // Try your method here
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(1);
        numbers.add(7);
        numbers.add(9);
        numbers.add(2);
        numbers.add(6);

        System.out.println("The numbers in the range [0, 5]");
        printNumbersInRange(numbers, 6, 999);

        System.out.println("The numbers in the range [3, 10]");
        printNumbersInRange(numbers, 3, 10);
    }

    private static void printNumbersInRange(ArrayList<Integer> numbers, int lowerLimit, int upperLimit) {
        for(int no : numbers){
            if(no >= lowerLimit && (no) <= upperLimit){
                System.out.println(no);
            }
        }
    }

}
