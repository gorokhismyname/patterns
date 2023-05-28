package builder;

public class Main {
    public static void main(String[] args) {

        MyObj myObj1 = new MyObj.Builder("01")
                .withName("lexica1")
                .withInitialState("OK")
                .build();

        MyObj myObj2 = new MyObj.Builder("02")
                .withName("lexica2")
                .build();

        System.out.println(myObj1);
        System.out.println(myObj2);

    }
}
