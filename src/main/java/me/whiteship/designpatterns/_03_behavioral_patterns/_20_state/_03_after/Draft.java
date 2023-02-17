package me.whiteship.designpatterns._03_behavioral_patterns._20_state._03_after;

public class Draft implements State{

    public Draft(OnlineCourse onlineCourse) {
        this.onlineCourse = onlineCourse;
    }

    private OnlineCourse onlineCourse;

    @Override
    public void addReview(String review, Student student) {
        throw new UnsupportedOperationException("리뷰를 작성할 수 없습니다.");
    }

    @Override
    public void addStudent(Student student) {
        this.onlineCourse.getStudents().add(student);
        if (this.onlineCourse.getStudents().size() > 0) {
            this.onlineCourse.changeState(new Private(this.onlineCourse));
        }
    }
}
