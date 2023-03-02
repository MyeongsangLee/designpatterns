package me.whiteship.designpatterns._03_behavioral_patterns._17_mediator._04_after;

public class ConcreteColleague1 extends Colleague{

    public ConcreteColleague1(String name) {
        super(name);
    }

    @Override
    public void receive(Colleague colleague) {
        System.out.println("from " + colleague.getName() + " to " + this.getName() + " message : " + colleague.getMessage());
    }

}
