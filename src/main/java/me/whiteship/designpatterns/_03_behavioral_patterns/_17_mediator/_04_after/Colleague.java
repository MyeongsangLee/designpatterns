package me.whiteship.designpatterns._03_behavioral_patterns._17_mediator._04_after;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public abstract class Colleague {

    protected String name;
    private String message;
    private Mediator mediator;

    public Colleague(String name) {
        this.name = name;
    }

    public void send() {
        System.out.println("메시지를 보냅니다.");
        System.out.println();

        mediator.mediate(this);
    }

    public abstract void receive(Colleague colleague);

}
