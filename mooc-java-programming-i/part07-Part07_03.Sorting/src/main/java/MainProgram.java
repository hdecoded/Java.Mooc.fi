import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {12, 23, 3, 1, -12};
        sort(array);
    }

    public static int smallest(int[] array) {
        return smallest(array, 0);
    }

    public static int smallest(int[] array, int startIndex) {
        int small = array[startIndex];
        for (int i = startIndex; i < array.length; i++) {
            if (array[i] < small) {
                small = array[i];
            }
        }
        return small;
    }

    public static int indexOfSmallest(int[] array) {
        return indexOfSmallest(array, 0);
    }

    public static int indexOfSmallest(int[] array, int startIndex) {

        int small = smallest(array, startIndex);
        int index = startIndex;
        for (int i = startIndex; i < array.length; i++) {
            if (small == array[i]) {
                index = i;
            }
        }
        return index;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        return indexOfSmallest(table, startIndex);
    }

    public static void swap(int[] array, int index1, int index2) {

        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;


    }

    public static void sort(int[] array) {

        for (int i = 0; i < array.length; i++) {
            int indexofSmallest = indexOfSmallest(array, i);
            swap(array, i, indexofSmallest);
            System.out.println(Arrays.toString(array));
        }


    }

}
