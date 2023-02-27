package me.whiteship.designpatterns._03_behavioral_patterns._22_temporary._03_after;

public class Plus extends FileProcessor{

    public Plus(String path) {
        super(path);
    }

    @Override
    public int getResult(int result, int number) {
        result += number;
        return result;
    }
}
