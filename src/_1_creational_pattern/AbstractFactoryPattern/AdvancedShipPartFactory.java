package _1_creational_pattern.AbstractFactoryPattern;

public class AdvancedShipPartFactory implements ShipPartFactory{

    @Override
    public Wheel createWheel() {
        return new AdvancedWheel();
    }

    @Override
    public Anchor createAnchor() {
        return new AdvancedAnchor();
    }
}
