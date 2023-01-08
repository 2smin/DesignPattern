package _3_behavioral_pattern.MediatorPattern.Sample1;

public class Client {

    /*
    mediator pattern
    객체 간 결합도를 낮추기 위해 중간에 mediator를 둔다
    클래스 간 관계가 복잡할때 포함, 참조를 mediator에다가 몰빵시켜서 복잡도를 낮춘다
    단 mediator는 어쩔수없이 다른 객체랑 결합도가 높아져벌임.......

    guest - frontDesk(mediator) - restaurant, cleaningService
    guest와 restaurant,cleaningService는 서로를 알지 못한다 걍 frontDesk만 알고 있으면 된다. 서로에게 의존성이 없다
    frontDesks는 모두를 알고있어야한다.
     */
    public static void main(String[] args) {

        FrontDesk mainFront = new FrontDesk();
        Guest guest1 = new Guest(1,mainFront);

        guest1.requestCleaning();
        guest1.requestReserveDinner();
    }
}
