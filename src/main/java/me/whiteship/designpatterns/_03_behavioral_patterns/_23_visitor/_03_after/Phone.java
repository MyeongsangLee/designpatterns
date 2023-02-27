package me.whiteship.designpatterns._03_behavioral_patterns._23_visitor._03_after;

public class Phone implements Device{
    @Override
    public void printTo(Rectangle rectangle) {
        System.out.println("print rectangle to phone");
    }

    @Override
    public void printTo(Triangle triangle) {
        System.out.println("print triangle to phone");
    }

    @Override
    public void printTo(Circle circle) {
        System.out.println("print circle to phone");
    }
}
