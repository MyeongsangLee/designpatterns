package me.whiteship.designpatterns._02_structure_patterns._08_composite._03_after;

import java.util.ArrayList;
import java.util.List;

public class Bag implements Component{

    private List<Item> items = new ArrayList<>();

    public void add(Item item) {
        items.add(item);
    }

    public List<Item> getItems() {
        return items;
    }

    @Override
    public int getPrice() {
        return items.stream().mapToInt(Item::getPrice).sum();
    }
}
