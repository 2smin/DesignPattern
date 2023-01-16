package _3_behavioral_pattern.StrategyPattern.Sample1;

public class Client {

    /*
    strategy pattern

    객체가 할 수 있는 동일한 행위를 interface로 캡슐화 하고
    구현체가 저마다의 실제 행위를 구현하도록 한다.
    client에서 동적으로 전략을 바꾸거나, 익명 클래스로 직접 전략을 생성 할 수도 있다.

    정말 자주 쓰이는 패턴 (디자인패턴인지도 모르고있었음)
    너무 단순해서 별로 공부하게 없어
     */
    public static void main(String[] args) {

        InternetExecutor executor = new InternetExecutor(new Chrome());
        executor.runBrowser();

        InternetExecutor executor1 = new InternetExecutor(new Explorer());
        executor1.runBrowser();

        InternetExecutor executor2 = new InternetExecutor(new Browser() {
            @Override
            public void execute() {
                System.out.println("사파리 브라우져");
                System.out.println("아이폰 아니었음 아무도 안씀");
            }
        });

        executor2.runBrowser();


    }
}
