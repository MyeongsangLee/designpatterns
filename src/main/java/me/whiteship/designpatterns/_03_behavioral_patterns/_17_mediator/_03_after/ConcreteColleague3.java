package me.whiteship.designpatterns._03_behavioral_patterns._17_mediator._03_after;

public class ConcreteColleague3 extends Colleague{
    public ConcreteColleague3(String name) {
        super(name);
    }

    @Override
    public void receive(Colleague colleague) {
        System.out.println("나는 " + this.name + " 너는 " + colleague.getName());
    }
}
