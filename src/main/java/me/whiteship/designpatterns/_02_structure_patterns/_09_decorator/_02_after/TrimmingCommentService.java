package me.whiteship.designpatterns._02_structure_patterns._09_decorator._02_after;

public class TrimmingCommentService extends CommentDecorator{

    public TrimmingCommentService(CommentService commentService) {
        super(commentService);
    }

    @Override
    public void addComment(String comment) {
        super.addComment(trim(comment));
    }

    private String trim(String comment) {
        System.out.println("trim");
        return comment.replace("...", "");
    }
}
