public class AdvancedAstrology {

    public static void printStars(int number) {
        // part 1 of the exercise
        int i = 0;
        while (i < number) {
            System.out.print("*");
            i++;
        }
        System.out.println();
    }

    public static void printSpaces(int number) {
        // part 1 of the exercise
        int i = 0;
        while (i < number) {
            System.out.print(" ");
            i++;
        }
    }

    public static void printTriangle(int size) {
        // part 2 of the exercise
        int i = 1, j = size - 1;
        while (i <= size) {
            printSpaces(j);
            printStars(i);
            i++;
            j--;
        }
    }

    public static void christmasTree(int height) {
        // part 3 of the exercise
        //print tree

        int i = 1, j = height - 1, k = 1;
        while (i <= height) {
            printSpaces(j);
            printStars(k);
            k = k + 2;
            i++;
            j--;
        }

        //print base
        int l = 0;
        while (l < 2) {
            printSpaces(height - 3 + 1);
            printStars(3);
            l++;
        }
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(3);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
