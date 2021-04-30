package application;

public class StandardSensor implements Sensor{

    private int no;
    public StandardSensor(int no) {
        this.no = no;
    }

    @Override
    public boolean isOn() {
        return true;
    }

    @Override
    public void setOn() {

    }

    @Override
    public void setOff() {

    }

    @Override
    public int read() {
        return this.no;
    }
}
