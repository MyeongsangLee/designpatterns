package me.whiteship.designpatterns._01_creational_patterns._02_factory_method._01_before;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShipFactoryTest {

    @Test
    void shipFactory() {
        Ship whiteship = ShipFactory.orderShip("Whiteship", "keesun@mail.com");
        //assertEquals();
        System.out.println(whiteship);

        Ship blackship = ShipFactory.orderShip("Blackship", "keesun@mail.com");
        System.out.println(blackship);

    }

}