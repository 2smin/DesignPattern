package _2_structural_pattern.BridgePattern;

public class Main {

    public static void main(String[] args) {

        //phone을 받아서 iphne, galaxy, 13mx 20mx 구현

        Phone galaxyWith20mpx = new Galaxy(new _20mpx());

        galaxyWith20mpx.takePicture();

        Phone iphoneWith13mpx = new Iphone(new _13mpx());

        iphoneWith13mpx.takePicture();

        //Phone 은 abstract, iphone, galaxy는 refined abstraction
        // camera는 implementor, 13, 20 mpx는 contrete implementor
        //implementor는 기능을 구현하고 abstractd에서 해당 기능을 사용하여 실제 구현 담당

    }
}