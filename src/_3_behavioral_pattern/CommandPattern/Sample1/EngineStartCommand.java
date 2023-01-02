package _3_behavioral_pattern.CommandPattern.Sample1;

public class EngineStartCommand implements Command {

    private Car car;

    public EngineStartCommand(Car car) {
        this.car = car;
    }

    @Override
    public void execute() {
        car.startEngine();
    }
}
