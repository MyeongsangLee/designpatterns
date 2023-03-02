package me.whiteship.designpatterns._03_behavioral_patterns._19_observer._03_after;

import lombok.Getter;

@Getter
public class User implements Subscriber{
    private String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void handlerMessage(String message) {
        System.out.println(name + " : " + message);
    }
}
