package me.whiteship.designpatterns._03_behavioral_patterns._20_state._02_after;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class OnlineCourse {

    private State state = new Draft(this);

    private List<String> reviews = new ArrayList<>();
    private List<Student> students = new ArrayList<>();

    public void addReview(String review, Student student) {
        this.state.addReview(review, student);
    }

    public void addStudent(Student student) {
        this.state.addStudent(student);
    }

    public void changeState(State state) {
        this.state = state;
    }


}
