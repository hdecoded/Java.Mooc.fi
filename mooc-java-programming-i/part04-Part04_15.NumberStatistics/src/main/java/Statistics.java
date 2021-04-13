public class Statistics {
    private int count = 0;
    private int sum = 0;


    public Statistics() {
        // initialize the variables count and sum here
    }

    public void addNumber(int number) {
        // write code here
        count++;
        sum = sum + number;
    }

    public int getCount() {
        // write code here
        return count;
    }

    public int sum() {
        // write code here
        return sum;
    }

    public double average() {
        // write code here
        if (count == 0)
            return 0;
        else {
            return 1.0 * sum / count;

        }

    }
}