package me.whiteship.designpatterns._01_creational_patterns._02_factory_method._03_after;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import me.whiteship.designpatterns._01_creational_patterns._03_abstract_factory._01_before.WhiteAnchor;
import me.whiteship.designpatterns._01_creational_patterns._03_abstract_factory._01_before.WhiteWheel;

@Getter @Setter @ToString
public class Ship {

    private String name;
    private String color;
    private String logo;

    private WhiteAnchor whiteAnchor;
    private WhiteWheel whiteWheel;

}
