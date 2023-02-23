package me.whiteship.designpatterns._03_behavioral_patterns._21_stategy._03_after;

public class Normal implements Speed{

    @Override
    public void blueLight() {
        System.out.println("무궁화꽃이");
    }

    @Override
    public void redLight() {
        System.out.println("피었습니다.");
    }
}
