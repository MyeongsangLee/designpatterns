package me.whiteship.designpatterns._01_creational_patterns._01_singleton;

//synchronized 멜티스레드 환경
public class Settings2 {

    private static Settings2 instance;
    private Settings2() {
    }

    public static synchronized Settings2 getInstance() {
        if (instance == null) {
            instance = new Settings2();
        }
        return instance;
    }
}
