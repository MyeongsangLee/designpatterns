package me.whiteship.designpatterns._03_behavioral_patterns._22_temporary._02_after;

public class Multiply extends FileProcessor{

    public Multiply(String path) {
        super(path);
    }

    @Override
    protected int getResult(int result, int number) {
        System.out.println(result + " : " + number);
        return result *= number;
    }
}
