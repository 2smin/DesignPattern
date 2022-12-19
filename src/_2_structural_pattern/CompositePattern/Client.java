package _2_structural_pattern.CompositePattern;

public class Client {

    public static void main(String[] args) {

        /*
        composite pattern
        그룹 전체와 아이템을 동일한 인터페이스를 상속시킴
        클라이언트는 전체나 부분이나 모두 동일한 컴포넌트로 인식할 수 있는 계층구조, tree 구조에 쓰인다?
         */

        Bag bag = new Bag();
        Item coffee = new Item("kanu", 500);
        Item macbook = new Item("macAir",2000);
        Item pen = new Item("pencil", 20);
        
        bag.insertComponent(coffee);
        bag.insertComponent(macbook);
        bag.insertComponent(pen);


        Client client = new Client();
        client.printPrice(bag);
        client.printPrice(coffee);
        client.printPrice(macbook);

    }
    
    private void printPrice(Component component){
        System.out.println(component.getPrice());
    }
}
