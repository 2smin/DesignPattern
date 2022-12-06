package AbstractFactoryPattern;

import FactoryPattern.Ship;
import FactoryPattern.ShipFactory;

public class RedShipFactory implements ShipFactory {

    private ShipPartFactory shipPartFactory;

    public RedShipFactory(ShipPartFactory shipPartFactory){
        this.shipPartFactory = shipPartFactory;
    }
    @Override
    public Ship createShip(String name, int size) {

        Ship ship = new RedShip();

        ship.setAnchor(shipPartFactory.createAnchor());
        ship.setWheel(shipPartFactory.createWheel());
        ship.setColor("red");
        ship.setName(name);
        ship.setSize(size);

        return ship;
    }
}
