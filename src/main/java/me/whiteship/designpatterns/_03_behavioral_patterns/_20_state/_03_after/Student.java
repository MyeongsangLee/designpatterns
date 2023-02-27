package me.whiteship.designpatterns._03_behavioral_patterns._20_state._03_after;

import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@ToString
public class Student {

    private String name;

    private List<OnlineCourse> privateCourses = new ArrayList<>();

    public boolean isPrivateClass(OnlineCourse onlineCourse) {
        return privateCourses.contains(onlineCourse);
    }

    public void addPrivateCourse(OnlineCourse onlineCourse) {
        privateCourses.add(onlineCourse);
    }

}
