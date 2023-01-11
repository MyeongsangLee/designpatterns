package me.whiteship.designpatterns._01_creational_patterns._03_abstract_factory._03_after;

public class BlackshipPartsFactory implements ShipPartsFactory{
    @Override
    public Anchor createAnchor() {
        return new BlackAnchor();
    }

    @Override
    public Wheel createWheel() {
        return new BlackWheel();
    }
}
