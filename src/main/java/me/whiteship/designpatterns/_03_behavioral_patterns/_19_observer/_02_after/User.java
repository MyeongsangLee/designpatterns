package me.whiteship.designpatterns._03_behavioral_patterns._19_observer._02_after;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

//ConcreteObserver
@Getter
@AllArgsConstructor
public class User implements Subscriber{
    private String name;

    @Override
    public void handleMessage(String message) {
        System.out.println(message);
    }
}
