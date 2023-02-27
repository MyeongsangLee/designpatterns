package me.whiteship.designpatterns._03_behavioral_patterns._23_visitor._03_after;

public class Rectangle implements Shape{

    @Override
    public void accept(Device device) {
        device.printTo(this);
    }
}
