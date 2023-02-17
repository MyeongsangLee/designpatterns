package me.whiteship.designpatterns._03_behavioral_patterns._20_state._03_after;

public class Client {

    public static void main(String[] args) {
        OnlineCourse onlineCourse = new OnlineCourse();
        Student student = new Student("whiteship");

        onlineCourse.addReview("첫리뷰", student);

        System.out.println(onlineCourse.getState());
    }
}
