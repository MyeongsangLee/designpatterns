package me.whiteship.designpatterns._03_behavioral_patterns._20_state._02_after;

import java.util.List;

public class OnlineCourse {
    private State state;

    public List<Student> students;
    public List<String> reviews;

    public void addStudent(Student student) {
        this.state.addStudent(student);
    }

    public void addReview(String review, Student student) {
        this.students.add(student);
    }

    public State getState() {
        return state;
    }

    public List<Student> getStudents() {
        return students;
    }

    public List<String> getReviews() {
        return reviews;
    }
}
