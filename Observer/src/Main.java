public class Main {

    public static void main(String[] args) {

        //Test Observable pattern.
        SensorHub sensorHub = new SensorHub();

        HudiksvallDegreeSensor hudiksvallSensor = new HudiksvallDegreeSensor();
        KarlstadDegreeSensor karlstadSensor = new KarlstadDegreeSensor();
        StockholmDegreeSensor stockholmSensor = new StockholmDegreeSensor();

        hudiksvallSensor.addObserver(new DegreeObserver(hudiksvallSensor));
        karlstadSensor.addObserver(new DegreeObserver(karlstadSensor));
        stockholmSensor.addObserver(new DegreeObserver(stockholmSensor));

        sensorHub.addSensor(hudiksvallSensor);
        sensorHub.addSensor(karlstadSensor);
        sensorHub.addSensor(stockholmSensor);


    }

}
