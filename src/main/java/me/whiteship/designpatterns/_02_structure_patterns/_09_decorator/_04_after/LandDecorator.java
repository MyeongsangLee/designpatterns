package me.whiteship.designpatterns._02_structure_patterns._09_decorator._04_after;

public class LandDecorator extends DecoratorDisplay{

    public LandDecorator(Display display) {
        super(display);
        drawLane();
    }

    private void drawLane() {
        System.out.println("\t차선 표시");
    }

}
