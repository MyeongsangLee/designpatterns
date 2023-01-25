package me.whiteship.designpatterns._02_structure_patterns._10_facade._03_atfer;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class EmailMessage {

    private String from;
    private String to;
    private String subject;
    private String text;

}
