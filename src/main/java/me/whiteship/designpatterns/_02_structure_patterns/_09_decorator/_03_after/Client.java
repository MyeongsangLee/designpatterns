package me.whiteship.designpatterns._02_structure_patterns._09_decorator._03_after;

import org.hibernate.boot.archive.scan.spi.ClassFileArchiveEntryHandler;

public class Client {
    private CommentService commentService;

    public Client(CommentService commentService) {
        this.commentService = commentService;
    }

    public void writeComment(String comment) {
        commentService.addComment(comment);
    }

}
