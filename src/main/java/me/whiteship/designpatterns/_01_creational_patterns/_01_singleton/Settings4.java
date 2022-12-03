package me.whiteship.designpatterns._01_creational_patterns._01_singleton;

public class Settings4 {

    private Settings4() {
    }

    public static class Settings4Holder {
        private static Settings4 INSTANCE = new Settings4();
    }

    public static Settings4 getInstance() {
        return Settings4Holder.INSTANCE;
    }

}
