package _2_structural_pattern.DecoratorPattern.Sample2.Decorator;

import _2_structural_pattern.DecoratorPattern.Sample2.ServerInterface;

public class LoggerServerDecorator extends ServerFilterDecorator{

    public LoggerServerDecorator(ServerInterface serverInterface) {
        super(serverInterface);
    }

    @Override
    public String getData() {
        System.out.println("decorator in ");
        return super.getData();
    }
}
