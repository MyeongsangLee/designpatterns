package me.whiteship.designpatterns._03_behavioral_patterns._16_iterator._01_before;

import java.util.Collections;
import java.util.List;

public class Client {

    public static void main(String[] args) {
        Board board = new Board();
        board.addPost("디자인 패턴 게임");
        board.addPost("선생님, 저랑 디자인 패턴 하나 학습하시겠습니까?");
        board.addPost("지금 이 자리에 계신 여러분들은 모두 디자인 패턴을 학습하고 계신 분들입니다.");

        List<Post> posts = board.getPosts();
        for (Post post : posts) {
            System.out.println(post.getTitle());
        }

        Collections.sort(posts, (p1, p2) -> p2.getCreateDateTime().compareTo(p1.getCreateDateTime()));
        for (Post post : posts) {
            System.out.println(post.getTitle());
        }
    }
}
