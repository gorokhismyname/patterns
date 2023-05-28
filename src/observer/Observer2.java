package observer;

public class Observer2 implements Observer {

    private Subject subject;
    private String innerState;

    Observer2(Subject subject) {
        this.subject = subject;
        subject.addObserver(this);
    }

    @Override
    public void update() {
        this.innerState = subject.getState1();
        System.out.println("Obs2 " + this.innerState);
    }
}
