package me.whiteship.designpatterns._03_behavioral_patterns._21_stategy._03_after;

public class Fast implements Speed{

    @Override
    public void blueLight() {
        System.out.println("무광꼬치");
    }

    @Override
    public void redLight() {
        System.out.println("피어씀다");
    }
}
