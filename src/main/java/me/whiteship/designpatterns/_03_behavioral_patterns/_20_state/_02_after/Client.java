package me.whiteship.designpatterns._03_behavioral_patterns._20_state._02_after;

public class Client {

    public static void main(String[] args) {
        OnlineCourse onlineCourse = new OnlineCourse();  //draft
        Student student = new Student("whiteship");
        //state -> draft
//        onlineCourse.addReview("리뷰", student);

        //state -> private
        onlineCourse.addStudent(student);
        onlineCourse.addReview("학생리뷰", student);

        Student keesun = new Student("keesun");

//        onlineCourse.addReview("기선리뷰2", keesun);
        keesun.addPrivate(onlineCourse);
        onlineCourse.addStudent(keesun);
        onlineCourse.addReview("기선리뷰2", keesun);

        System.out.println(onlineCourse.getReviews());
        System.out.println(onlineCourse.getState());
        System.out.println(onlineCourse.getStudents());
    }
}
