package me.whiteship.designpatterns._01_creational_patterns._01_singleton;

import java.io.*;

public class AppSerializable {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Settings4 settings1 = Settings4.getInstance();
        Settings4 settings2 = Settings4.getInstance();
        System.out.println(settings1 == settings2);

        //try() close 자동으로 됨
        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("settings.obj"))) {
            out.writeObject(settings1);
        }

        Settings4 settings3 = null;
        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream("settings.obj"))) {
            settings3 =(Settings4)in.readObject();
        }

        //false 해결 readResolve
        System.out.println(settings1 == settings3);

    }
}
