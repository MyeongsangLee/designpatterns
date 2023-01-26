package me.whiteship.designpatterns._02_structure_patterns._11_flyweight._03_after;

public class Client {

    public static void main(String[] args) {
        FontFactory fontFactory = new FontFactory();
        Character c1 = new Character('h', "white", fontFactory.getFont("Nanum:12"));
        Character c2 = new Character('e', "white", fontFactory.getFont("Nanum:12"));
        Character c3 = new Character('l', "white", fontFactory.getFont("Nanum:13"));
        Character c4 = new Character('l', "white", fontFactory.getFont("Nanum:13"));
        Character c5 = new Character('o', "white", fontFactory.getFont("Nanum:14"));

        fontFactory.printCache();

        System.out.println(c1.toString());
    }
}
