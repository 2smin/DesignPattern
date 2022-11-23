package Singleton;

public class Main {

    public static void main(String[] args) {

        Setting3 instance = Setting3.getInstance();
        Setting3 instance2 = Setting3.getInstance();

        System.out.println(instance == instance2);

        Setting2 setting2 = Setting2.getInstance();
        Setting2 setting21 = Setting2.getInstance();

        System.out.println(setting21 == setting2);

        Setting4 setting4 = Setting4.INSTANCE;
        Setting4 setting41 = Setting4.INSTANCE;


        System.out.println(setting4 == setting41);
    }
}
