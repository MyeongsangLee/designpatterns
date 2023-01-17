package me.whiteship.designpatterns._02_structure_patterns._07_bridge._04_my_after;

public class RectDrawing implements Drawing{
    @Override
    public void drawLine(int x, int y) {
        System.out.printf(" x = %s, y = %s", x, y);
    }

    @Override
    public void fill() {
        System.out.println("RectDrawing");
    }
}
