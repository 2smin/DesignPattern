package _2_structural_pattern.FlyWeightPattern.Sample1;

public class Client {

        /*
        flyweight patterns

        변경 가능한 부분과 변경 불가능한 (ex. static) 부분을 나누어서 구현한다
        변경 불가능한 부분은 factory 내에서 cache 메모리를 구현하여 생성
        여러 객체에서 동일한 부분은 변경불가능으로 설정, 얘는 하나의 리소스를 참조하게 하여 (static 혹은 bean 처럼)
        메모리 사용량을 줄일 수 있다.
         */

    public static void main(String[] args) {

        ImmutablePartsFactory factory = new ImmutablePartsFactory();

        Computer computer1 = new Computer(factory.getParts("500w:z550"),"i5-1100","gtx-5000","1tb");
        Computer computer2 = new Computer(factory.getParts("500w:z550"),"i5-1100","gtx-5000","1tb");
        Computer computer3 = new Computer(factory.getParts("500w:z555"),"i5-1100","gtx-5000","1tb");

        System.out.println("result1: " + computer1.getImmutableParts().equals(computer2.getImmutableParts()));
        System.out.println("result2: " + computer1.getImmutableParts().equals(computer3.getImmutableParts()));

    }
}
