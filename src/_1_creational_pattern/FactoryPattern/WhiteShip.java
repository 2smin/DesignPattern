package _1_creational_pattern.FactoryPattern;

public class WhiteShip extends Ship{

    public WhiteShip(String name, int size){
        this.setSize(size);
        this.setName(name);
        this.setColor("white");
    }
}
