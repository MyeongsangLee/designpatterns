package me.whiteship.designpatterns._03_behavioral_patterns._23_visitor._03_after;

public interface Device {

    void printTo(Rectangle rectangle);

    void printTo(Triangle triangle);

    void printTo(Circle circle);
}
