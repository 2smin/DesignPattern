package _3_behavioral_pattern.CommandPattern.Sample1;

public class Car {

    boolean engine = false;

    void startEngine(){
        engine = !engine;
        //engine boolean 값으로 판단은  EngineStartCommand에 넣는게 좀 더 객체지향적이지 않을까?
        if(engine){
            System.out.println("engine start");
        }else{
            System.out.println("engine turn off");
        }
    }
}
