package me.whiteship.designpatterns._01_creational_patterns._01_singleton;

//1. private 생성자, static 매소드
public class Settings1 {

    private static Settings1 instance;

    private Settings1() {
    }

    public static Settings1 getInstance() {
        if (instance == null) {
            instance = new Settings1();
        }
        return instance;
    }
}
