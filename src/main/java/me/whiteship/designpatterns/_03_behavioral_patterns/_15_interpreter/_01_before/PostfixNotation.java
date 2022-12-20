package me.whiteship.designpatterns._03_behavioral_patterns._15_interpreter._01_before;

import lombok.RequiredArgsConstructor;

import java.util.Stack;

@RequiredArgsConstructor
public class PostfixNotation {

    private final String expression;

    public static void main(String[] args) {
        PostfixNotation postfixNotation = new PostfixNotation("123+-");
        postfixNotation.calculate();

    }

    private void calculate() {
        Stack<Integer> numbers = new Stack<>();

        for (char c : this.expression.toCharArray()) {
            switch (c) {
                case '+':
                    numbers.push(numbers.pop() + numbers.pop()); //15
                    break;
                case '-':
                    int right = numbers.pop(); //5
                    int left = numbers.pop();  //1
                    numbers.push(left - right); //1-5
                    break;
                default:
                    numbers.push(Integer.parseInt(c + ""));
            }
        }

        System.out.println(numbers.pop());
    }


}
