import java.util.ArrayList;

public class StockholmDegreeSensor implements Sensor {

    private String nameOfTown = "Stockholm";

    private ArrayList<Observer> observers;

    private double currentDegree = 0;
    private double lastDegree;

    private Thread testThread;

    public StockholmDegreeSensor() {
        observers = new ArrayList<>();

        testThread = new Thread(() -> {
            while (true) {

                lastDegree = currentDegree;
                currentDegree = Math.round(Math.random() * 10);

                if (lastDegree != currentDegree) {
                    notifyAllObservers(currentDegree);
                }

                try {
                    Thread.sleep(4000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        testThread.start();
    }

    @Override
    public void addObserver(Observer observer) {

        this.observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyAllObservers(double degree) {

        for (Observer observer : observers) {
            observer.update(degree);
        }

    }

    public void getDegreeOfObservers() {
        for (Observer observer : observers) {
            System.out.println("Current degree in " + this.nameOfTown + " is " + observer.getDegrees());
        }
    }

    @Override
    public String getNameOfTown() {
        return this.nameOfTown;
    }
}
