package _3_behavioral_pattern.CommandPattern.Sample1;

public class Client {

    /*
        command pattern
        요청을 캡슐화 하여 호출자와 수신자를 분리
        command 자체는 인터페이스로 두고, 해당 command 를 실제 수행하는 receiver를 여러개 구현한다
        receiver가 변경되어도 invoker(client)에서 사용하는 command는 바뀌지 않는다.

        ** 핵심 : command 객체와 실제 command를 수행하는 객체를 따로 둔다. command가 인터페이스화 되어서 client 코드 변경을 최소화
    */
    public static void main(String[] args) {

        Button button = new Button(new EngineStartCommand(new Car()));
        button.pressButton();
        button.pressButton();
        button.pressButton();
        button.pressButton();
    }

    public static class Button{

        Command command;

        public Button(Command command) {
            this.command = command;
        }

        public void pressButton(){
            command.execute();
        }
    }
}
