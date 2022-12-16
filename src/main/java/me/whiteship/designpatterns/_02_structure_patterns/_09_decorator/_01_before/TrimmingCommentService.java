package me.whiteship.designpatterns._02_structure_patterns._09_decorator._01_before;

public class TrimmingCommentService extends CommentService{

    @Override
    public void addComments(String comment) {
        super.addComments(trim(comment));
    }

    private String  trim(String comment) {
        return comment.replace("...", "");
    }


}
