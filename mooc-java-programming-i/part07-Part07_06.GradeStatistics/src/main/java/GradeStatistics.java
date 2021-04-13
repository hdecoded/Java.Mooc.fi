import java.util.ArrayList;

public class GradeStatistics {
    private final ArrayList<Integer> points;
    private ArrayList<Integer> passPoints;
    private ArrayList<Integer> grades = new ArrayList<>();

    public GradeStatistics() {
        this.points = new ArrayList<>();

    }

    public void add(int input) {
        if (input >= 0 && input <= 100) {
            this.points.add(input);
        }
    }

    private int sum(ArrayList<Integer> points) {
        int sum = 0;
        for (int point : points) {
            sum = sum + point;
        }
        return sum;
    }

    private String avgOfPassPoints() {
        this.passPoints = new ArrayList<>();
        for (int point : points) {
            if (point >= 50) {
                passPoints.add(point);
            }
        }
        if (sum(passPoints) == 0) {
            return "-";
        }
        return String.valueOf(1.0 * sum(passPoints) / passPoints.size());
    }


    private void printGrade() {
        convertToGrade();
        for (int i = 5; i >= 0; i--) {
            System.out.print(i + ": ");
            printStars(i);
        }
    }

    private void printStars(int i) {
        for(int grade : grades){
            if(grade == i){
                System.out.print("*");
            }
        }
        System.out.println();
    }

    private void convertToGrade() {

        for (int point : points) {
            if (point >= 90) {
                grades.add(5);
            } else if (point < 90 && point >= 80) {
                grades.add(4);
            } else if (point < 80 && point >= 70) {
                grades.add(3);
            } else if (point < 70 && point >= 60) {
                grades.add(2);
            } else if (point < 60 && point >= 50) {
                grades.add(1);
            } else if (point < 50) {
                grades.add(0);
            }
        }

    }

    public void printStats() {
        System.out.println("Point average (all): " + 1.0 * sum(points) / points.size());
        System.out.println("Point average (passing): " + avgOfPassPoints());
        System.out.println("Pass percentage: " + 1.0 * 100 * passPoints.size() / points.size());
        System.out.println("Grade distribution:");
        printGrade();
    }

}
