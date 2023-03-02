package me.whiteship.designpatterns._03_behavioral_patterns._20_state._03_after;

public class Client {
    public static void main(String[] args) {

        OnlineCourse onlineCourse = new OnlineCourse();
        Student student = new Student("whiteship");

        //Draft
        //onlineCourse.addReview("리뷰", student);
        onlineCourse.addStudent(student);

        //private
        onlineCourse.addReview("리뷰1", student);

        Student keesun = new Student("keesun");
        onlineCourse.addReview("리뷰2", keesun);

        keesun.addPrivateCourse(onlineCourse);
        onlineCourse.addStudent(keesun);

        //published
        onlineCourse.changeState(new Published(onlineCourse));
        Student myeongsang = new Student("myeongsang");
        onlineCourse.addReview("리뷰3", myeongsang);
        onlineCourse.addStudent(myeongsang);

        System.out.println(onlineCourse.getState());
        System.out.println(onlineCourse.getReviews());
        System.out.println(onlineCourse.getStudents());
    }
}
