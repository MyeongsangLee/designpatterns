package me.whiteship.designpatterns._03_behavioral_patterns._17_mediator._04_after;

public abstract class Colleague {

    private String name;
    private String message;
    private Mediator mediator;

    public Colleague(String name) {
        this.name = name;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public void send() {
        System.out.println("메시지 보냅니다");
        System.out.println();
        this.mediator.mediate(this);
    }

    public String getName() {
        return name;
    }

    public abstract void receive(Colleague colleague);



}
