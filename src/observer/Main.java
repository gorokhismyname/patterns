package observer;

public class Main {

    public static void main(String[] args) {
        SubjectImplementation subjectImplementation = new SubjectImplementation();

        Observer observer1 = new Observer1(subjectImplementation);
        Observer observer2 = new Observer2(subjectImplementation);

        subjectImplementation.setState1("banana");
        subjectImplementation.setState1("strawberry");
        subjectImplementation.setState2("chocolate");
    }
}
