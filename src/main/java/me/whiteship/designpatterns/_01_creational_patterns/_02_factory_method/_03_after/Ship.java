package me.whiteship.designpatterns._01_creational_patterns._02_factory_method._03_after;

import lombok.Getter;
import lombok.Setter;
import me.whiteship.designpatterns._01_creational_patterns._03_abstract_factory._03_after.Anchor;
import me.whiteship.designpatterns._01_creational_patterns._03_abstract_factory._03_after.Wheel;

@Getter @Setter
public class Ship {

    private String name;

    private String color;

    private String logo;

    private Anchor Anchor;

    private Wheel Wheel;

    @Override
    public String toString() {
        return "Ship{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", logo='" + logo + '\'' +
                '}';
    }
}
