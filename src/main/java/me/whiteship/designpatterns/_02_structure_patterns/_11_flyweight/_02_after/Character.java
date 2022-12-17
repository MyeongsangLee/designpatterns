package me.whiteship.designpatterns._02_structure_patterns._11_flyweight._02_after;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.lang.annotation.Target;

@AllArgsConstructor
@Getter
@ToString
public class Character {
    private char value;
    private String color;
    private Font font;
}
