package me.whiteship.designpatterns._02_structure_patterns._09_decorator._04_after;

public class DefaultDisplay implements Display{
    @Override
    public void draw() {
        System.out.println("기본 도로 표시");
    }
}
