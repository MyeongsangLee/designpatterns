package me.whiteship.designpatterns._03_behavioral_patterns._15_interpreter._04_after;

import java.util.Map;

public class VariableExpression implements PostfixExpression {
    private PostfixExpression left;
    private PostfixExpression right;

    public VariableExpression(PostfixExpression left, PostfixExpression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret(Map<Character, Integer> context) {
        return left.interpret(context) - right.interpret(context);
    }
}
