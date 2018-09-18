public class DegreeObserver implements Observer {

    private double degree;

    private Sensor attachedToSensor;

    public DegreeObserver(Sensor sensor){
        this.attachedToSensor = sensor;
    }

    @Override
    public double getDegrees() {
        return degree;
    }

    @Override
    public void update(double degree) {
        this.degree = degree;
        System.out.println("Current degree in " + this.attachedToSensor.getNameOfTown() + " is " + this.degree);
    }

    public double getDegree() {
        return degree;
    }

}
