
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // test your method here
        List<Integer> number = new ArrayList<>();

        number.add(-4);
        number.add(3);
        for(int s : positive(number)){
            System.out.println(s);
        }



    }

    public static List<Integer> positive(List<Integer> numbers){
        List<Integer> positiveIntegers  = numbers.stream().filter(s -> s > 0).collect(Collectors.toList());
        return positiveIntegers;
    }

}
