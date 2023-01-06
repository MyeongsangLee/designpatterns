package me.whiteship.designpatterns._01_creational_patterns._01_singleton;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class AppReflection {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Settings4 settings1 = Settings4.getInstance();
        Settings4 settings2 = Settings4.getInstance();
        System.out.println(settings1 == settings2);

        Constructor<Settings4> declaredConstructor = Settings4.class.getDeclaredConstructor();
        declaredConstructor.setAccessible(true);
        Settings4 settings3 = declaredConstructor.newInstance();

        System.out.println(settings1 == settings3);
    }
}
