package me.whiteship.designpatterns._01_creational_patterns._03_abstract_factory._02_after;

import me.whiteship.designpatterns._01_creational_patterns._02_factory_method._03_after.Ship;

public class Client {

    public static void main(String[] args) {

        WhiteShipFactory whiteShipFactory = new WhiteShipFactory(new WhiteshipPartsFactory());
        Ship ship = whiteShipFactory.createShip();
        System.out.println(ship.getAnchor().getClass());
        System.out.println(ship.getWheel().getClass());
    }
}
