import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class LiteracyComparison {

    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
//        String fileName = scanner.nextLine();
        read("literacy.csv").stream().forEach(literacy -> System.out.println(literacy));

    }

    private static List<Literacy> read(String fileName) {

        List<Literacy> literacyList = new ArrayList<>();

        try {
            Files.lines(Paths.get(fileName))
                    .map(row -> row.split(","))
                    .map(parts -> new Literacy(parts[0], parts[1].trim(),
                            parts[2].replace("(%)", "").trim(), parts[3], Integer.valueOf(parts[4]),
                            Double.valueOf(parts[5])))
                    .sorted((l1, l2) -> {
                        return l1.getLiteracyPercent().compareTo(l2.getLiteracyPercent());
                    })
                    .forEach(literacy -> literacyList.add(literacy));

        } catch (IOException io) {
            System.out.println(fileName + " not found");
        }
        return literacyList;
    }

}
