package me.whiteship.designpatterns._01_creational_patterns._01_singleton;

import java.io.*;
import java.lang.reflect.InvocationTargetException;

public class AppEnum {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, IOException, ClassNotFoundException {
        Settings6 settings1 = Settings6.INSTANCE;
        Settings6 settings2 = null;

        //error
//        Constructor<?>[] declaredConstructors = Settings5.class.getDeclaredConstructors();
//        for (Constructor<?> constructor : declaredConstructors) {
//            constructor.setAccessible(true);
//            settings2 = (Settings5) constructor.newInstance("INSTANCE");
//        }
//
//        System.out.println(settings1 == settings2);

        //try() close 자동으로 됨
        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("settings.obj"))) {
            out.writeObject(settings1);
        }

        Settings6 settings3 = null;
        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream("settings.obj"))) {
            settings3 =(Settings6)in.readObject();
        }

        //false 해결 readResolve
        System.out.println(settings1 == settings3);

    }
}
