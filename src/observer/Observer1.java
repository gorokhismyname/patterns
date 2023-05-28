package observer;

public class Observer1 implements Observer {

    private Subject subject;
    private String innerState1;
    private String innerState2;

    Observer1(Subject subject) {
        this.subject = subject;
        subject.addObserver(this);
    }

    @Override
    public void update() {
        this.innerState1 = subject.getState1();
        this.innerState2 = subject.getState2();
        System.out.println("Obs1 " + this.innerState1);
        System.out.println("Obs1 " + this.innerState2);
    }
}
