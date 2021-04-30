package application;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class AverageSensor implements Sensor {

    private List<Sensor> sensors =new ArrayList<>();
    private List<Integer> readings = new ArrayList<>();


    @Override
    public boolean isOn() {
        for (Sensor sensor : sensors) {
            if (sensor.isOn() == false) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void setOn() {
        for (Sensor sensor : sensors) {
            sensor.setOn();
        }
    }

    @Override
    public void setOff() {
        for (Sensor sensor : sensors) {
            sensor.setOff();
        }
    }

    @Override
    public int read() {
        if (this.isOn() == false || this.sensors.isEmpty()) {
            throw new IllegalStateException();
        }
        int sum = sensors.stream().mapToInt(sensor -> sensor.read()).sum();
        int avg = sum/sensors.size();
        readings.add(avg);
        return avg;
    }

    public void addSensor(Sensor toAdd) {
        sensors.add(toAdd);
    }

    public List<Integer> readings(){
        return readings;
    }
}
