package FactoryPattern;

public class WhiteShipFactory implements ShipFactory {

    private static class holder{
        private static WhiteShipFactory INSTANCE = new WhiteShipFactory();
    }

    public static WhiteShipFactory getInstance(){
        return holder.INSTANCE;
    }
    @Override
    public Ship createShip(String name, int size) {
        return new WhiteShip(name, size);
    }
}
