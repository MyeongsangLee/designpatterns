package me.whiteship.designpatterns._02_structure_patterns._09_decorator._03_after;

public class DefaultCommentService implements CommentService{

    @Override
    public void addComment(String comment) {
        System.out.println(comment);
    }
}
