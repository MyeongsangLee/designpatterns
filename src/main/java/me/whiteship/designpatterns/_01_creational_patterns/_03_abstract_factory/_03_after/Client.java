package me.whiteship.designpatterns._01_creational_patterns._03_abstract_factory._03_after;

public class Client {
    public void createComputer(String type) {
        ComputerFactory computerFactory = null;
        switch (type) {
            case "LG":
                computerFactory = new LGComputer();
                break;
            case "Samsung":
                computerFactory = new SamsungComputer();
                break;
        }

        computerFactory.createKeyboard().createKeyboard();
        computerFactory.createMouse().createMouse();
    }

    public static void main(String[] args) {
        Client client = new Client();
        client.createComputer("LG");
    }
}
