package me.whiteship.designpatterns._02_structure_patterns._08_composite._03_after;

public class Client {

    public static void main(String[] args) {
        Item itemA = new Item("itemA", 1000);
        Item itemB = new Item("itemB", 2000);
        Bag bag = new Bag();
        bag.add(itemA);
        bag.add(itemB);
        Character character = new Character(bag);

        Client client = new Client();

        client.printPrice(itemA);
        client.printPrice(itemB);
        client.printPrice(bag);
        client.printPrice(character);

    }
    private void printPrice(Component component) {

        System.out.println(component.getPrice());
    }

}
