package me.whiteship.designpatterns._01_creational_patterns._02_factory_method._03_after;

public interface ShipFactory {

    default Ship orderShip(String name, String email) {

        validate(name, email);
        prepareFor(name);
        Ship ship = createShip();
        sendMailTo(email, ship);

        return ship;
    }

    void sendMailTo(String email, Ship ship);

    Ship createShip();

    void prepareFor(String name) ;
    void validate(String name, String email);

}
