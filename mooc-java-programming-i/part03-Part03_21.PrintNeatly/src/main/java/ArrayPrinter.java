public class ArrayPrinter {

    public static void main(String[] args) {
        // You can test your method here
        int[] array = {5, 1, 3, 4, 2};
        printNeatly(array);
    }

    public static void printNeatly(int[] array) {
        // Write some code in here
        for (int j = 0, arrayLength = array.length; j < arrayLength; j++) {
            int i = array[j];
            System.out.print(i);
            if (j < arrayLength - 1) {
                System.out.print(", ");
            }
        }
    }
}
