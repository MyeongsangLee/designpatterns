package me.whiteship.designpatterns._01_creational_patterns._01_singleton;

//double checked locking
public class Settings4 {

    private static Settings4 instance;
    private static boolean isCreated;

    private Settings4() {
        if (isCreated) {
            throw new UnsupportedOperationException("생성자 안됨");
        }
        isCreated = true;
    }

    public static Settings4 getInstance() {
        if (instance == null) {
            synchronized (Settings4.class) {
                if (instance == null) {
                    instance = new Settings4();
                }
            }
        }
        return instance;
    }
}
