package me.whiteship.designpatterns._01_creational_patterns._02_factory_method._02_after;

public class Client {
    public static void main(String[] args) {
        Client client = new Client();
        client.print(new WhiteShipFactory(), "whiteship", "aaa@aaa.com");
        client.print(new BlackShipFactory(), "blackship", "aaa@aaa.com");
//        Ship whiteship = new WhiteShipFactory().orderShip("Whiteship", "keesun@mail.com");
//        System.out.println(whiteship);
//
//        Ship blackship = new BlackShipFactory().orderShip("Blackship", "keesun@mail.com");
//        System.out.println(blackship);
    }

    private void print(ShipFactory shipFactory, String name, String email) {
        System.out.println(shipFactory.orderShip(name, email));
    }

}
