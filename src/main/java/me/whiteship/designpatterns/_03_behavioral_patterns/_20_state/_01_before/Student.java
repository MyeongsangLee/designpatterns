package me.whiteship.designpatterns._03_behavioral_patterns._20_state._01_before;

import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@ToString
public class Student {

    private String name;

    public Student(String name) {
        this.name = name;
    }
    private List<OnlineCourse> privateCourses = new ArrayList<>();

    public boolean isEnabledForPrivateClass(OnlineCourse onlineCourse) {
        return privateCourses.contains(onlineCourse);
    }

    public void addPrivateCourse(OnlineCourse onlineCourse) {
        this.privateCourses.add(onlineCourse);
    }


}
