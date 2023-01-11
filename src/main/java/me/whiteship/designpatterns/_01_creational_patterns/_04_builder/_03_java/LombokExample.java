package me.whiteship.designpatterns._01_creational_patterns._04_builder._03_java;

import lombok.Builder;

@Builder
public class LombokExample {

    private String title;

    private int nights;

    private int days;

    public static void main(String[] args) {
        LombokExample build = LombokExample.builder()
                .title("태국 여행")
                .nights(3)
                .days(4)
                .build();
    }

}
