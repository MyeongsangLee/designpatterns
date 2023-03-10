package me.whiteship.designpatterns._03_behavioral_patterns._15_interpreter._04_after;

import java.util.Stack;

public class PostfixParser {

    public static PostfixExpression parse(String expression) {
        Stack<PostfixExpression> stack = new Stack<>();
        for (char c : expression.toCharArray()) {
            stack.push(getExpress(c, stack));
        }
        return stack.pop();
    }

    private static PostfixExpression getExpress(Character c, Stack<PostfixExpression> stack) {
        switch (c) {
            case '+':
                return new PlusExpression(stack.pop(), stack.pop());
            case '-':
                PostfixExpression right = stack.pop();
                PostfixExpression left = stack.pop();
                return new MinusExpression(left, right);
            default:
                return new VariableExpress(c);
        }
    }
}
