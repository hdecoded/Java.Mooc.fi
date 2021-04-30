package application;

import java.util.Random;

public class TemperatureSensor implements Sensor {
    private boolean state;

    public TemperatureSensor() {
        this.state = false;
    }

    @Override
    public boolean isOn() {
        return state;
    }

    @Override
    public void setOn() {
        this.state = true;
    }

    @Override
    public void setOff() {
        this.state = false;
    }

    @Override
    public int read() {
        if (this.state == false) {
            throw new IllegalArgumentException();
        }
        int no = new Random().nextInt(60);
        if (no > 30) {
            no = 30 - no;
        }
        return no;
    }
}
