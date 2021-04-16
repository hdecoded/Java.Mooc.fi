import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Herd implements Movable {

    private List<Movable> herdList;

    public Herd() {
        herdList = new ArrayList<>();
    }

    public void addToHerd(Movable movable){
        herdList.add(movable);
    }


    @Override
    public void move(int dx, int dy) {
        for (Movable movable : herdList) {
            movable.move(dx, dy);
        }
    }

    @Override
    public String toString() {
        String s = "";
        for(Movable herd : herdList){
            s = s +  "\n" +herd.toString();
        }
        return s;
    }
}
