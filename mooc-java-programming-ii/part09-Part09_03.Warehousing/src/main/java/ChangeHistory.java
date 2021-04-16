import java.util.ArrayList;

public class ChangeHistory {
    private ArrayList<Double> history;

    public ChangeHistory() {
        this.history = new ArrayList<>();
    }

    public void add (double status){
        this.history.add(status);
    }

    public void clear(){
        this.history.clear();
    }

    public double maxValue(){
        double max = 0;
        for(double amount : history){
            if(amount > max){
                max = amount;
            }
        }
        return max;
    }

    public double minValue(){
        double min = history.get(0);
        for (double amount : history){
            if(amount < min){
                min = amount;
            }
        }
        return min;
    }

    public double average(){
        double  sum =0;
        for(double amount: history){
            sum = sum + amount;
        }
        if(history.isEmpty()){
            return 0;
        }
        return sum/history.size();
    }

    @Override
    public String toString(){
        return this.history.toString();
    }
}
