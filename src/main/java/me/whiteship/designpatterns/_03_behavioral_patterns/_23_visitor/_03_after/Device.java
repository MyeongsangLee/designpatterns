package me.whiteship.designpatterns._03_behavioral_patterns._23_visitor._03_after;

public interface Device {

    void print(Rectangle rectangle);

    void print(Circle circle);

    void print(Triangle triangle);
}
