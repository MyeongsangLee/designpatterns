package me.whiteship.designpatterns._03_behavioral_patterns._22_temporary._02_after;

public class Client {

    public static void main(String[] args) {
        FileProcessor fileProcessor = new Multiply("number.txt");
        int result = fileProcessor.process();
        System.out.println(result);

    }
}
