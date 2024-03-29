package me.whiteship.designpatterns._03_behavioral_patterns._15_interpreter._03_after;

import java.util.Stack;

import static me.whiteship.designpatterns._03_behavioral_patterns._15_interpreter._03_after.PostfixExpression.*;

public class PostfixParser {
    
    public static PostfixExpression parse(String expression) {
        Stack<PostfixExpression> stack = new Stack<>();

        for (char c : expression.toCharArray()) {
            stack.push(getExpression(c, stack));
        }
        return stack.pop();

    }

    private static PostfixExpression getExpression(char c, Stack<PostfixExpression> stack) {
        switch (c) {
            case '+' :
                return plus(stack.pop(), stack.pop());
            case '-':
                PostfixExpression right = stack.pop();
                PostfixExpression left = stack.pop();
                return minus(left, right);
            default:
                return variable(c);
        }
    }
}
