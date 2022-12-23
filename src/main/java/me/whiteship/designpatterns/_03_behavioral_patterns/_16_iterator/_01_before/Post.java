package me.whiteship.designpatterns._03_behavioral_patterns._16_iterator._01_before;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class Post {

    private String title;
    private LocalDateTime createDateTime;

    public Post(String title) {
        this.title = title;
        this.createDateTime = LocalDateTime.now();
    }
}
