import java.util.ArrayList;

public class GradeRegister {

    private final ArrayList<Integer> points;
    private final ArrayList<Integer> grades;

    public GradeRegister() {
        this.grades = new ArrayList<>();
        this.points = new ArrayList<>();
    }

    public static int pointsToGrade(int points) {

        int grade = 0;
        if (points < 50) {
            grade = 0;
        } else if (points < 60) {
            grade = 1;
        } else if (points < 70) {
            grade = 2;
        } else if (points < 80) {
            grade = 3;
        } else if (points < 90) {
            grade = 4;
        } else {
            grade = 5;
        }

        return grade;
    }

    public void addGradeBasedOnPoints(int points) {
        this.grades.add(pointsToGrade(points));
        this.points.add(points);
    }

    public int numberOfGrades(int grade) {
        int count = 0;
        for (int received : this.grades) {
            if (received == grade) {
                count++;
            }
        }

        return count;
    }

    public double averageOfGrades() {
        return average(grades);
    }

    public double averageOfPoints() {
        return average(points);
    }

    private double average(ArrayList<Integer> grades) {
        if (grades.isEmpty()) {
            return -1;
        }

        int count = 0;
        int sum = 0;
        for (int grade : grades) {
            sum = sum + grade;
            count++;
        }
        return 1.0 * sum / count;
    }
}

