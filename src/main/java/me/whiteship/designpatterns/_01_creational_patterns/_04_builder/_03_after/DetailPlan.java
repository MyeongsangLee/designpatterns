package me.whiteship.designpatterns._01_creational_patterns._04_builder._03_after;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
@AllArgsConstructor
public class DetailPlan {
    private int day;
    private String plan;
}
