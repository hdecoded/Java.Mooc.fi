public class FromParameterToOne {

    public static void main(String[] args) {
        printFromNumberToOne(5);
    }

    private static void printFromNumberToOne(int i) {
        for (int j = i; j > 0; j--) {
            System.out.println(j);
        }
    }
}
