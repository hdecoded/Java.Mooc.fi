import java.util.ArrayList;
import java.util.List;

public class Pipe<T> {

    private List<T> pipe = new ArrayList<>();

    public void putIntoPipe(T value) {
        this.pipe.add(value);
    }

    public T takeFromPipe(){
        if(this.pipe.isEmpty()){
            return null;
        }
        T t = this.pipe.get(0);
        this.pipe.remove(0);
        return t;
    }

    public boolean isInPipe(){
        if(this.pipe.isEmpty()){
            return false;
        }
        return true;
    }


}
