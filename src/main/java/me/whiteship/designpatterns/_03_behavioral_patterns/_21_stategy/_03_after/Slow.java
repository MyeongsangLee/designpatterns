package me.whiteship.designpatterns._03_behavioral_patterns._21_stategy._03_after;

public class Slow implements Speed{

    @Override
    public void blueLight() {
        System.out.println("무 궁 화    꽃   이");
    }

    @Override
    public void redLight() {
        System.out.println("피 었 습 니  다.");
    }
}
