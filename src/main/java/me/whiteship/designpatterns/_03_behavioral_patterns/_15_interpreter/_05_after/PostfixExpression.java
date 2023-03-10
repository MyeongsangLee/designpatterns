package me.whiteship.designpatterns._03_behavioral_patterns._15_interpreter._05_after;

import java.util.Map;

public interface PostfixExpression {

    int interpret(Map<Character, Integer> context);

    static PostfixExpression plus(PostfixExpression left, PostfixExpression right) {
        return new PostfixExpression() {
            @Override
            public int interpret(Map<Character, Integer> context) {
                return left.interpret(context) - right.interpret(context);
            }
        };
    }

    static PostfixExpression minus(PostfixExpression left, PostfixExpression right) {
        return context -> left.interpret(context) - right.interpret(context);
    }

    static PostfixExpression variable(Character character) {
        return new PostfixExpression() {
            @Override
            public int interpret(Map<Character, Integer> context) {
                return context.get(character);
            }
        };
    }
}
