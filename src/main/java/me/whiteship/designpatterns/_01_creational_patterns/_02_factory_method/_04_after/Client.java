package me.whiteship.designpatterns._01_creational_patterns._02_factory_method._04_after;

public class Client {

    public static void main(String[] args) {

        Client client = new Client();
        client.printShip(new WhiteShipFactory(), "whiteship", "whiteShip@naver.com");
        client.printShip(new BlackShipFactory(), "blackship", "blackShip@naver.com");

    }

    private void printShip(ShipFactory shipFactory, String name, String email) {
        System.out.println(shipFactory.orderShip(name, email));
    }
}
