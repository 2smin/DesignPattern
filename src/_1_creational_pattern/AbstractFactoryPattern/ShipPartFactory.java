package _1_creational_pattern.AbstractFactoryPattern;

public interface ShipPartFactory {

    Wheel createWheel();

    Anchor createAnchor();
}
