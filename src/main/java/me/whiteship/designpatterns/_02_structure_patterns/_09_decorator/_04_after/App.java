package me.whiteship.designpatterns._02_structure_patterns._09_decorator._04_after;

public class App {

    public static void main(String[] args) {
        Display display = new DefaultDisplay();
        display = new TrafficDecorator(display);
        display = new LandDecorator(display);

        display.draw();
    }
}
