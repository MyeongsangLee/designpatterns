package me.whiteship.designpatterns._02_structure_patterns._08_composite._03_after;

import java.util.ArrayList;
import java.util.List;

public class Bag implements Component{
    private List<Component> lists = new ArrayList<>();

    public void add(Component component) {
        this.lists.add(component);
    }

    @Override
    public int getPrice() {
        return this.lists.stream().mapToInt(Component::getPrice).sum();
    }
}
