import java.util.ArrayList;

public class ExerciseManagement {

    private ArrayList<Excercise> exercises;

    public ExerciseManagement() {
        this.exercises = new ArrayList<>();
    }

    public ArrayList<String> exerciseList() {
        ArrayList<String> list = new ArrayList<>();
        for(Excercise Ex : exercises){
            list.add(Ex.getName());
        }
        return list;
    }

    public void add(String exercise) {
        this.exercises.add(new Excercise(exercise));
    }

    public void markAsCompleted(String exercise) {
        for(Excercise ex : exercises){
            if (ex.getName().equals(exercise)){
                ex.setCompleted(true);
            }
        }
    }

    public boolean isCompleted(String exercise){
        for(Excercise ex : exercises){
            if (ex.getName().equals(exercise)){
                return ex.isCompleted();
            }
        }
        return false;
    }
}
