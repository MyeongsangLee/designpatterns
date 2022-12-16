package me.whiteship.designpatterns._02_structure_patterns._09_decorator._01_before;

public class SpamFilteringCommentService extends CommentService {

    @Override
    public void addComments(String comment) {
        boolean isSpam = isSpam(comment);
        if (!isSpam) {
            super.addComments(comment);
        }
    }

    private boolean isSpam(String comment) {
        return comment.contains("http");
    }
}
