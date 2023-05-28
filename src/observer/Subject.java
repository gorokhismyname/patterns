package observer;

public interface Subject {

    void notifyAllObservers();
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    String getState1();
    String getState2();
}
