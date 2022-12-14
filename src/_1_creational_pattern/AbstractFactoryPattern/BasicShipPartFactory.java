package _1_creational_pattern.AbstractFactoryPattern;

public class BasicShipPartFactory implements ShipPartFactory{


    @Override
    public Wheel createWheel() {
        return new BasicWheel();
    }

    @Override
    public Anchor createAnchor() {
        return new BasicAnchor();
    }
}
