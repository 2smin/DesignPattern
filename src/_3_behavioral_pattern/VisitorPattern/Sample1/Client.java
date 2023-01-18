package _3_behavioral_pattern.VisitorPattern.Sample1;

public class Client {

    /*
    visitor pattern

    기존 코드를 변경하지 않고 새로운 코드를 추가한다.
    더블 디스패치를 활용

    element에서는 visitor를 받아서 visitor에게 자기 자신을 넘겨준다.
    visitor가 추가될때마다 기존 코드 변경없이 element에
    visitor의 인터페이스는 element마다 추상메서드를 오버로딩 한다. 이후 element가 추가될때마다 추상메서드만 오버로딩만 추가시킨다.
    기존코드를 변경하지 않아도 된다 하지만 visitor가


    visitor(protocol) / element(browser)
    visitor 추가될때는 기존 코드 변경이 없지만, element에서 추가나 삭제가 생기면 난리난다. 기존 visitor들 오버로딩된 메서드 다 수정해주어야함

    구조가 복잡해서 나중에 함 더 봐야한다...
     */
    public static void main(String[] args) {

        Chrome browser = new Chrome();
        Protocol protocol = new WebSocket();

        Protocol http = new Http();

        http.sendPacket(browser);

        Explorer ex = new Explorer();
        protocol.sendPacket(ex);
    }

}
