package _2_structural_pattern.ProxyPattern.Sample1;

public class Client {

    /*
    proxy pattern
    사용하고자 하는 class를 proxy class가 먼저 받게 한다
    proxy class에서는 기존 클래스를 상속받거나
    기존 클래스와 동일 인터페이스를 구현한 후 기존 클래스를 참조로 포함시킨다.

    이후 기존 클래스와 동일한 메서드를 부르면 프록시의 메서드 내에서 수행하고자 하는 작업을 수행 후 (암것도 안해도 됨)
    기존 메서드의 return반환 혹은 작업 수행
     */


    public static void main(String[] args) {

        DefaultResponseProvider rs = new ResponseProviderProxy();

        String response = rs.getResponse("knock knock");

        System.out.println(response);
    }
}
