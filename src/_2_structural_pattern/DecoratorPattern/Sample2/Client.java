package _2_structural_pattern.DecoratorPattern.Sample2;

import _2_structural_pattern.DecoratorPattern.Sample2.Decorator.LoggerServerDecorator;

public class Client {

    static boolean isLoggerOn = true;

    public static void main(String[] args) {

        ServerInterface server = new Server();

        if(isLoggerOn)  {
            server = new LoggerServerDecorator(server);
        }

        System.out.println(server.getData());

    }


}
