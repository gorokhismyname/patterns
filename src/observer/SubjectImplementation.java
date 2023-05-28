package observer;

import java.util.ArrayList;
import java.util.List;

public class SubjectImplementation implements Subject {

    private String state1;
    private String state2;
    private List<Observer> observers;

    SubjectImplementation() {
        this.state1 = "Initial state1";
        this.state2 = "Initial state2";
        this.observers = new ArrayList<>();
    }

    @Override
    public void notifyAllObservers() {
        observers.forEach(o -> o.update());
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void setState1(String updatedState1) {
        this.state1 = updatedState1;
        notifyAllObservers();
    }

    public void setState2(String updatedState2) {
        this.state2 = updatedState2;
        notifyAllObservers();
    }

    public String getState1() {
        return this.state1;
    }

    public String getState2() {
        return this.state2;
    }

}
