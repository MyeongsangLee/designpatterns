package me.whiteship.designpatterns._02_structure_patterns._07_bridge._04_my_after;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract class Shape {

    private Drawing drawing;

    public abstract void draw();

    public void drawLine(int x, int y) {
        drawing.drawLine(x, y);;
    }

    public void fill() {
        drawing.fill();
    }

}
