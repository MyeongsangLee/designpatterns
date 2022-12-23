package me.whiteship.designpatterns._03_behavioral_patterns._16_iterator._02_after;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Getter @Setter
public class Board {

    List<Post> posts = new ArrayList<>();

    public void addPost(String content) {
        this.posts.add(new Post(content));
    }

    public Iterator<Post> getRecentPostIterator() {
        return new RecentPostIterator(this.posts);
    }


}
