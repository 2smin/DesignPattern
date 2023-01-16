package _3_behavioral_pattern.StrategyPattern.Sample1;

public class Chrome implements Browser {

    @Override
    public void execute() {
        System.out.println("크롬은 process를 너무 많이 띄워");
    }
}
