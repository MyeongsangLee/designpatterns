package me.whiteship.designpatterns._02_structure_patterns._08_composite._03_after;

public class Character implements Component{
    private Bag bag;

    public Character(Bag bag) {
        this.bag = bag;
    }

    @Override
    public int getPrice() {
        return bag.getPrice();
    }
}
