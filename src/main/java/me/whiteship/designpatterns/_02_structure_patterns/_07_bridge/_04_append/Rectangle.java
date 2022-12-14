package me.whiteship.designpatterns._02_structure_patterns._07_bridge._04_append;

public class Rectangle extends Shape{

    public Rectangle(Drawing drawing) {
        super(drawing);
    }

    @Override
    public void draw() {
        System.out.println("Rect draw extend");
    }
}
