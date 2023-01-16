package _3_behavioral_pattern.StrategyPattern.Sample1;

public class Explorer implements Browser{

    @Override
    public void execute() {
        System.out.println("서비스 종료된 버림받은 브라우저 explorer");
    }
}
