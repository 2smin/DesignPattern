package FactoryPattern;

public interface ShipFactory {

    default Ship orderShip(String name, int size){

        validate(name,size);
        return createShip(name,size);
    };

    default void validate(String name, int size){
        if(name == null || size == 0){
            throw new NullPointerException();
        }
    }

    Ship createShip(String name, int size);

}
