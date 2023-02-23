package me.whiteship.designpatterns._03_behavioral_patterns._23_visitor._03_after;

public class Triangle implements Shape {

    @Override
    public void accept(Device device) {
        device.print(this);
    }
}