package me.whiteship.designpatterns._02_structure_patterns._07_bridge._05_my_after;

public class App {

    public static void main(String[] args) {
        Tiger tiger = new Tiger(new HuntingMethod1("방법1"));
        tiger.hunt();
    }
}
