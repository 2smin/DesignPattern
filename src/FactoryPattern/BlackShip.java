package FactoryPattern;

public class BlackShip extends Ship{



    public BlackShip(String name, int size){
        this.setSize(size);
        this.setName(name);
        this.setColor("black");
    }
}
