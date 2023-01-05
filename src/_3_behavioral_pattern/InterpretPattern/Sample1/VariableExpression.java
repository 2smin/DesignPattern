package _3_behavioral_pattern.InterpretPattern.Sample1;

import java.util.Map;

public class VariableExpression implements Expression{

    private Character character;

    public VariableExpression(Character character) {
        this.character = character;
    }

    @Override
    public Integer execute(Map<Character, Integer> context) {
        return context.get(this.character);
    }
}
