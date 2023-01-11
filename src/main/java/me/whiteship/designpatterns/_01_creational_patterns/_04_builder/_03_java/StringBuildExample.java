package me.whiteship.designpatterns._01_creational_patterns._04_builder._03_java;

public class StringBuildExample {

    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        String string = stringBuilder.append("참좋은").append("여행").append("함께").toString();
        System.out.println(string);
    }
}
