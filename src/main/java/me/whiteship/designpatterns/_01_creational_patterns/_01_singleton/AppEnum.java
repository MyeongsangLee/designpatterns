package me.whiteship.designpatterns._01_creational_patterns._01_singleton;

import java.lang.reflect.Constructor;

public class AppEnum {

    public static void main(String[] args) throws NoSuchMethodException {
        Settings5 settings1 = Settings5.INSTANCE;
        Settings5 settings2 = null;

        Constructor<?>[] declaredConstructors = Settings5.class.getDeclaredConstructors();
        for (Constructor<?> constructor : declaredConstructors) {
            constructor.setAccessible(true);
//            constructor.
        }

    }
}
