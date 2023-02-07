package me.whiteship.designpatterns._03_behavioral_patterns._17_mediator._03_after;

public abstract class Colleague {

    protected String name;
    private String message;

    private Mediator mediator;

    public Colleague(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public void send() {
        System.out.println("메시지 보냅니다.");
        System.out.println();

        mediator.mediate(this);
    }

    public abstract void receive(Colleague colleague);
}
