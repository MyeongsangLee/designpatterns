package me.whiteship.designpatterns._01_creational_patterns._03_abstract_factory._03_after;

public class WhiteshipPartsProFactory implements ShipPartsFactory{
    @Override
    public Anchor createAnchor() {
        return new WhiteAnchorPro();
    }

    @Override
    public Wheel createWheel() {
        return new WhiteWheelPro();
    }
}
