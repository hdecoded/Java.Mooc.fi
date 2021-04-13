import java.util.ArrayList;

public class Stack {
    ArrayList<String> stack = new ArrayList<>();

    public boolean isEmpty(){
        return this.stack.isEmpty();

    }

    public void add (String value){
        this.stack.add(value);
    }

    public ArrayList<String> values() {
        return this.stack;
    }

    public String take(){

        String take = this.stack.get(stack.size()-1);
        this.stack.remove(stack.size()-1);
        return take;
        
    }
}
