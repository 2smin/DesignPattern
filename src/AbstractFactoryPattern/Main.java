package AbstractFactoryPattern;

import FactoryPattern.Ship;
import FactoryPattern.ShipFactory;
import FactoryPattern.WhiteShipFactory;

public class Main {

    public static void main(String[] args) {

        ShipFactory shipFactory = new RedShipFactory(new AdvancedShipPartFactory());
        ShipFactory shipFactory1 = new RedShipFactory(new BasicShipPartFactory());

        Ship ship = shipFactory.createShip("red1",5);
        Ship ship1 = shipFactory1.createShip("redBasic1", 6);
        System.out.println(ship.getAnchor().getClass());
        System.out.println(ship.getWheel().getClass());

        System.out.println(ship1.getWheel().getClass());
        System.out.println(ship1.getAnchor().getClass());


    }
}
