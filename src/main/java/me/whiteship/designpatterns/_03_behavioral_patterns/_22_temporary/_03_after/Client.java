package me.whiteship.designpatterns._03_behavioral_patterns._22_temporary._03_after;

public class Client {

    public static void main(String[] args) {

        FileProcessor fileProcessor = new Plus("number.txt");
        //FileProcessor fileProcessor = new Multiply("number.txt");
        System.out.println(fileProcessor.process());
    }
}
