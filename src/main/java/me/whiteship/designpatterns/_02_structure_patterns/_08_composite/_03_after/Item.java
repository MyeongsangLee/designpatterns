package me.whiteship.designpatterns._02_structure_patterns._08_composite._03_after;

public class Item implements Component{
    private String name;
    private int price;

    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public int getPrice() {
        return 0;
    }
}
