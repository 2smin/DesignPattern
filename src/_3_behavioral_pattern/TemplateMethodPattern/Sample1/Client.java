package _3_behavioral_pattern.TemplateMethodPattern.Sample1;

import java.io.BufferedReader;
import java.io.Reader;

public class Client {

    /*
    template method pattern

    abstract 또는 interface로 오버라이딩 할 메서드를 지정
    실제 template 메서드에서 오버라이딩 할 메서드를 부른다.

    추상클래스에서는 템플릿 제공, 하위 클래스는 구체적인 알고리즘을 구현
    또는 템플릿콜백 패턴으로도 응용 가능 (이땐 추상클래스가 아닌 interface), 인터페이스를 익명클래스로 직접 구현해서 템플릿에 넘겨줄 수 있다.
     */
    public static void main(String[] args) {

        Calculator cal = new Multiple("number.txt");
        cal.calculate();

        Calculator cal2 = new Substract("number.txt");

        cal2.calculate();
    }
}
