package me.whiteship.designpatterns._03_behavioral_patterns._23_visitor._02_after;

//Visitor
public interface Device {

    void print(Rectangle rectangle);

    void print(Triangle triangle);

    void print(Circle circle);
}
