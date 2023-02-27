package me.whiteship.designpatterns._03_behavioral_patterns._22_temporary._03_after;

public class Multiply extends FileProcessor{

    public Multiply(String path) {
        super(path);
    }

    @Override
    public int getResult(int result, int number) {
        result *= number;
        return result;
    }
}
