public class FromOneToParameter {

    public static void main(String[] args) {
        printUntilNumber(5);
    }

    private static void printUntilNumber(int i) {
        for (int j = 1; j <= i; j++) {
            System.out.println(j);
        }
    }

}
