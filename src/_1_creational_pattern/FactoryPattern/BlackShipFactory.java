package _1_creational_pattern.FactoryPattern;

public class BlackShipFactory implements ShipFactory{

    private static class holder{
        private static BlackShipFactory INSTANCE = new BlackShipFactory();
    }

    public static BlackShipFactory getInstance(){
        return BlackShipFactory.holder.INSTANCE;
    }

    @Override
    public Ship createShip(String name, int size) {
        return new BlackShip(name, size);
    }
}
