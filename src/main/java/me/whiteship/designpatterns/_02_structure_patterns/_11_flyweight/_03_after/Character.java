package me.whiteship.designpatterns._02_structure_patterns._11_flyweight._03_after;

import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class Character {

    private char value;
    private String color;
    private Font font;

}
