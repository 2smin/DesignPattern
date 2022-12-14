package _1_creational_pattern.SingletonPattern;

public class Setting2 {

    private Setting2(){}

    private static volatile Setting2 instance;

    //thread safe but too much resources
    public synchronized static Setting2 getInstance(){

        if(instance==null){
            instance = new Setting2();
        }

        return instance;
    }

    //double checked locking
    //thread safe less resources
    public static Setting2 getInstance2(){

        if(instance == null){
            synchronized (Setting2.class){
                if(instance == null){
                    instance= new Setting2();
                }
            }
        }
        return instance;
    }
}
