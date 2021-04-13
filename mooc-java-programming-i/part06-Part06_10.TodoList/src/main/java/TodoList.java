import java.util.ArrayList;

public class TodoList {

    private ArrayList<String> toDoList = new ArrayList<>();

    public TodoList() {
    }

    public void add(String task){
        this.toDoList.add(task);
    }

    public void print(){
        for (int i = 0; i < toDoList.size(); i++) {
            String toDo = toDoList.get(i);
            System.out.println(i+1 + ": " + toDo);
        }
    }

    public void remove(int number){
        this.toDoList.remove(number-1);
    }
}
