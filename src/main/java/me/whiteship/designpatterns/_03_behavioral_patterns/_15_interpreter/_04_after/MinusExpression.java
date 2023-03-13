package me.whiteship.designpatterns._03_behavioral_patterns._15_interpreter._04_after;

import java.util.Map;

public class MinusExpression implements PostfixExpression {
    private PostfixExpression left;
    private PostfixExpression right;

    public MinusExpression(PostfixExpression left, PostfixExpression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret(Map<Character, Integer> context) {
        return this.left.interpret(context) - this.right.interpret(context);  //Variable interprete(c)
    }
}