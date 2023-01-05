package _3_behavioral_pattern.InterpretPattern.Sample1;

import java.util.Map;

public class PlusExpression implements Expression {

    private Expression left, right;

    public PlusExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public Integer execute(Map<Character, Integer> context) {
        return left.execute(context) + right.execute(context);
    }
}
