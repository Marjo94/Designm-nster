public interface Sensor {

    void addObserver(Observer observer);
    void removeObserver(Observer observer);

    void notifyAllObservers(double degree);
    void getDegreeOfObservers();

    String getNameOfTown();


}
