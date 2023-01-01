package _2_structural_pattern.DecoratorPattern.Sample2;

public class Server implements ServerInterface{

    private int data;

    public String getData(){
        return "data from server: " + data ;
    }
}
