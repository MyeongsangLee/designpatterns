package me.whiteship.designpatterns._01_creational_patterns._01_singleton;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class AppReflection {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Settings3 settings1 = Settings3.getInstance();
        Settings3 settings2 = Settings3.getInstance();
        System.out.println(settings1 == settings2);

        Constructor<Settings3> declaredConstructor = Settings3.class.getDeclaredConstructor();
        declaredConstructor.setAccessible(true);
        Settings3 settings3 = declaredConstructor.newInstance();

        System.out.println(settings1 == settings3);
    }
}
