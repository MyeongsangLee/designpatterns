package me.whiteship.designpatterns._02_structure_patterns._09_decorator._04_after;

public class DecoratorDisplay implements Display{
    private Display display;

    public DecoratorDisplay(Display display) {
        this.display = display;
    }

    @Override
    public void draw() {
        display.draw();
    }
}
