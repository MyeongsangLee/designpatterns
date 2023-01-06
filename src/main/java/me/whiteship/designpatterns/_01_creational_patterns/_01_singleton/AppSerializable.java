package me.whiteship.designpatterns._01_creational_patterns._01_singleton;

import java.io.*;

public class AppSerializable {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Settings5 settings1 = Settings5.getInstance();
        Settings5 settings2 = Settings5.getInstance();
        System.out.println(settings1 == settings2);

        //try() close 자동으로 됨
        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("settings.obj"))) {
            out.writeObject(settings1);
        }

        Settings5 settings3 = null;
        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream("settings.obj"))) {
            settings3 =(Settings5)in.readObject();
        }

        //false 해결 readResolve
        System.out.println(settings1 == settings3);

    }
}
