package me.whiteship.designpatterns._03_behavioral_patterns._15_interpreter._02_after;

import java.util.Map;


public class PlusPostfixExpression implements PostfixExpression{

    private PostfixExpression left, right;

    public PlusPostfixExpression(PostfixExpression left, PostfixExpression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret(Map<Character, Integer> context) {
        return left.interpret(context);
    }
}
