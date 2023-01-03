package me.whiteship.designpatterns._03_behavioral_patterns._22_temporary._02_after;

public class Client {

    public static void main(String[] args) {

//        FileProcessor fileProcessor = new Multiply("number.txt");
        FileProcessor fileProcessor = new FileProcessor("number.txt");
        int result = fileProcessor.process(new Operator() {
            @Override
            public int getResult(int sum, int number) {
                return sum += number;
            }
        });
        System.out.println(result);

    }
}
