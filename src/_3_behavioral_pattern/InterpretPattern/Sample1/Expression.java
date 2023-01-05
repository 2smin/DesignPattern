package _3_behavioral_pattern.InterpretPattern.Sample1;

import java.util.Map;

public interface Expression {

    Integer execute(Map<Character, Integer> context);
}
