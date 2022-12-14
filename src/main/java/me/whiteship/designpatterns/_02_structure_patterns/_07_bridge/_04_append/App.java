package me.whiteship.designpatterns._02_structure_patterns._07_bridge._04_append;

public class App {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(new RectDrawing());
    }
}
