package me.whiteship.designpatterns._01_creational_patterns._03_abstract_factory._01_before;

import me.whiteship.designpatterns._01_creational_patterns._02_factory_method._03_after.DefaultShipFactory;
import me.whiteship.designpatterns._01_creational_patterns._02_factory_method._03_after.Ship;

public class WhiteShipFactory extends DefaultShipFactory {

    @Override
    public Ship createShip() {
        Ship ship = new Ship();
        ship.setAnchor(new WhiteAnchor());
        ship.setWheel(new WhiteWheel());
        return null;
    }
}
