package me.whiteship.designpatterns._03_behavioral_patterns._15_interpreter._04_after;

import java.util.Map;

public class VariableExpress implements PostfixExpression {
    private Character character;

    public VariableExpress(Character character) {
        this.character = character;
    }

    @Override
    public int interpret(Map<Character, Integer> context) {
        return context.get(character);
    }
}
