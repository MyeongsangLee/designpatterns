package me.whiteship.designpatterns._01_creational_patterns._02_factory_method._02_after;

public class Client {
    public static void main(String[] args) {
        Client client = new Client();

        Ship whiteship = new WhiteShipFactory().orderShip("Whiteship", "keesun@mail.com");
        System.out.println(whiteship);

//        Ship blackship = WhiteShipFactory.orderShip("Blackship", "keesun@mail.com");
//        System.out.println(blackship);
    }

}
