package me.whiteship.designpatterns._03_behavioral_patterns._16_iterator._01_before;

import java.util.Arrays;
import java.util.Collections;

public class Sort {
    public static void main(String[] args) {
        String[] str = {"1", "a", "3", "나", "A"};
        String[] str1 = new String[5];

        System.arraycopy(str, 0, str1, 0, 5);
        for (String s : str1) {
            System.out.println(s);
        }

        Arrays.sort(str, Collections.reverseOrder());
    }
}
