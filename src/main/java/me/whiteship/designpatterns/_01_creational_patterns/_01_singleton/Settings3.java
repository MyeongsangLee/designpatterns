package me.whiteship.designpatterns._01_creational_patterns._01_singleton;

//이른 초기화(eager initialization)
public class Settings3 {

    private static final Settings3 INSTANCE = new Settings3();

    private Settings3() {
    }

    public static Settings3 getInstance() {
        return INSTANCE;
    }
}
