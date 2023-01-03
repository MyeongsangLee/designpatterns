package me.whiteship.designpatterns._03_behavioral_patterns._23_visitor._02_after;

public class Phone implements Device {
    @Override
    public void print(Rectangle rectangle) {
        System.out.println("print Rectangle to phone");
    }

    @Override
    public void print(Triangle triangle) {
        System.out.println("print Triangle to phone");
    }

    @Override
    public void print(Circle circle) {
        System.out.println("print Triangle to phone");
    }
}
