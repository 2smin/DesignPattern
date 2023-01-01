package _2_structural_pattern.DecoratorPattern.Sample2.Decorator;

import _2_structural_pattern.DecoratorPattern.Sample2.ServerInterface;

public class ServerFilterDecorator implements ServerInterface {

    private ServerInterface serverInterface;

    public ServerFilterDecorator(ServerInterface serverInterface) {
        this.serverInterface = serverInterface;
    }

    @Override
    public String getData() {
        return serverInterface.getData();
    }

}
