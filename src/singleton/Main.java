package singleton;

public class Main {

    public static void main(String[] args) {
        MySingleton mySingleton = MySingleton.getInstance();
        MySingleton mySingleton2 = MySingleton.getInstance();

        System.out.println(mySingleton == mySingleton2);
    }


}
