package me.whiteship.designpatterns._03_behavioral_patterns._20_state._02_after;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Private implements State{

    private OnlineCourse onlineCourse;

    @Override
    public void addReview(String review, Student student) {
        if (this.onlineCourse.getStudents().contains(student)) {
            this.onlineCourse.getReviews().add(review);
        } else {
            throw new UnsupportedOperationException("등록 되지 않는 학생은 리뷰를 작성 할 수 없습니다.");
        }
    }

    @Override
    public void addStudent(Student student) {
        if (student.isAvailable(this.onlineCourse)) {
            this.onlineCourse.getStudents().add(student);
        } else {
            throw new UnsupportedOperationException("프라이빗 코스를 수강 할 수 없습니다.");
        }
    }
}
