package me.whiteship.designpatterns._03_behavioral_patterns._22_temporary._03_after;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public abstract class FileProcessor {
    private String path;

    public FileProcessor(String path) {
        this.path = path;
    }

    public int process() {
        try(BufferedReader reader = new BufferedReader(new FileReader(path))) {
            int result = 0;
            String line = null;
            while ((line = reader.readLine()) != null) {
                result = getResult(result, Integer.parseInt(line));
            }
            return result;
        } catch (IOException e) {
            throw new IllegalArgumentException(path + "에 해당하는 파일이 없습니다.");
        }
    }

    public abstract int getResult(int result, int number);
//    private int getResult(int result, int number) {
//        result += number;
//        return result;
//    }
}
