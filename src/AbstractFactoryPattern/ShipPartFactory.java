package AbstractFactoryPattern;

public interface ShipPartFactory {

    Wheel createWheel();

    Anchor createAnchor();
}
