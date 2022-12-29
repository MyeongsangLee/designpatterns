package me.whiteship.designpatterns._03_behavioral_patterns._20_state._02_after;

public class Client {

    public static void main(String[] args) {
        OnlineCourse onlineCourse = new OnlineCourse();
        Student student = new Student("whiteship");

        System.out.println(onlineCourse.getReviews());
        System.out.println(onlineCourse.getState());
        System.out.println(onlineCourse.getStudents());
    }
}
