package me.whiteship.designpatterns._02_structure_patterns._07_bridge._02_after;

import me.whiteship.designpatterns._02_structure_patterns._07_bridge._01_before.Champion;

public class App {

    public static void main(String[] args) {
        Champion KDA아리 = new 아리(new KDA());
        KDA아리.skillR();
    }
}
