package me.whiteship.designpatterns._02_structure_patterns._09_decorator._03_after;

public class SpamFilteringCommentService extends CommentDecorator{

    public SpamFilteringCommentService(CommentService commentService) {
        super(commentService);
    }

    @Override
    public void addComment(String comment) {
        if (!isSpam(comment))
            super.addComment(comment);
    }

    private boolean isSpam(String comment) {
        return comment.contains("http://");
    }
}
