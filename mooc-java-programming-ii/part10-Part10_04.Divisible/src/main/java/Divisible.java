import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Divisible {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(2);
        numbers.add(-17);
        numbers.add(-5);
        numbers.add(7);

        ArrayList<Integer> divisible = divisible(numbers);

        divisible.stream()
                .forEach(luku -> System.out.println(luku));
    }

    public static ArrayList<Integer> divisible(ArrayList<Integer> numbers) {

//        List<Integer> divByTwoThreeFive = new ArrayList<>();
//        List<Integer> divByTwo = numbers.stream().filter(no -> no % 2 == 0).collect(Collectors.toList());
//        List<Integer> divByThree = numbers.stream().filter(no -> no % 3 == 0).collect(Collectors.toList());
//        List<Integer> divByFive = numbers.stream().filter(no -> no % 5 == 0).collect(Collectors.toList());
//
//        Stream.of(divByFive,divByThree,divByTwo).forEach((divByTwoThreeFive::addAll));

        return (ArrayList<Integer>) numbers.stream().filter(no -> no %2==0 || no%3 ==0 || no % 5 ==0).collect(Collectors.toList());
    }

}
