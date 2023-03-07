package me.whiteship.designpatterns._03_behavioral_patterns._15_interpreter._04_after;

import java.util.Map;

public interface PostfixExpression {

    int interpret(Map<Character, Integer> context);
}
