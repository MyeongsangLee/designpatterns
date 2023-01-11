package me.whiteship.designpatterns._01_creational_patterns._04_builder._03_java;

import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        Stream.Builder<String> builder = Stream.<String>builder();
        Stream<String> build = builder.add("참좋은").add("여행").add("함께").build();
        build.forEach(System.out::println);
    }
}
