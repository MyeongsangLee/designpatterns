package me.whiteship.designpatterns._03_behavioral_patterns._20_state._02_after;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Draft implements State{

    private OnlineCourse onlineCourse;

    @Override
    public void addReview(String review, Student student) {
        throw new UnsupportedOperationException("드래프트에서는 리뷰를 할 수 없습니다.");
    }

    @Override
    public void addStudent(Student student) {
        this.onlineCourse.getStudents().add(student);

        if (this.onlineCourse.getStudents().size() > 0) {
            this.onlineCourse.changeState(new Private(this.onlineCourse));
        }

    }
}
