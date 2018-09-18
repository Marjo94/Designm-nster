import java.util.ArrayList;

public class SensorHub {

    private ArrayList<Sensor> sensorList = new ArrayList<>();

    public void addSensor(Sensor sensor) {
        sensorList.add(sensor);
    }

    public void removeSensor(Sensor sensor) {
        sensorList.remove(sensor);
    }

    public ArrayList<Sensor> getSensorList() {
        return sensorList;
    }

    public void setSensorList(ArrayList<Sensor> sensorList) {
        this.sensorList = sensorList;
    }

    public void checkDegreeInTowns() {
        for (Sensor sensor : sensorList) {
            sensor.getDegreeOfObservers();
        }
    }
}
