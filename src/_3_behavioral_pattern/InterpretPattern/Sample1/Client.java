package _3_behavioral_pattern.InterpretPattern.Sample1;

import java.util.Map;

public class Client {

    /*
        interpret pattern
        특정 식이나 패턴을 자주사용한다고 할 떄, 정규화하여 재사용할수 있도록 한다. 확장도 가능
        terminate, nonterminate expression으로 나뉜다.
        인터페이스를 구현하는 다른 terminator를 생성, 각 terminator는 패턴이나 식을 풀어낸다.
        넘어려웡
     */
    public static void main(String[] args) {

        Expression exp = Parser.parse("xyz+-");
        int result = exp.execute(Map.of('x',1,'y',6,'z',4));
        System.out.println(result);

    }
}
