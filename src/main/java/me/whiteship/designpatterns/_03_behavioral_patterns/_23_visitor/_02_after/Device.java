package me.whiteship.designpatterns._03_behavioral_patterns._23_visitor._02_after;

//Visitor
public interface Device {

    void print(Triangle triangle);

    void print(Rectangle rectangle);

    void print(Circle circle);
}
