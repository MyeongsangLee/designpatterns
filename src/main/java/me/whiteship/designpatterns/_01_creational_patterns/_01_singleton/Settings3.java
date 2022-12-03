package me.whiteship.designpatterns._01_creational_patterns._01_singleton;

public class Settings3 {

    private static Settings3 instance;

    private Settings3() {
    }
    public static Settings3 getInstance() {
        if (instance == null){
            synchronized (Settings3.class) {
                if (instance == null){
                    instance = new Settings3();
                }
            }
        }
        return instance;
    }
}
