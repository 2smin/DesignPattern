package Factory;

public class Main {

    static WhiteShipFactory whiteShipFactory = WhiteShipFactory.getInstance();
    static BlackShipFactory blackShipFactory = BlackShipFactory.getInstance();

    public static void main(String[] args) {

        Main main = new Main();

        main.shipClient(blackShipFactory, "black1", 5);
        main.shipClient(blackShipFactory, "black2", 3);

    }

    public void shipClient(ShipFactory shipFactory, String name, int length){

        System.out.println(shipFactory.createShip(name, length));

    }
}
