package me.whiteship.designpatterns._03_behavioral_patterns._17_mediator._04_after;

public class ConcreteColleagueA extends Colleague{

    public ConcreteColleagueA(String name) {
        super(name);
    }

    @Override
    public void receive(Colleague colleague) {

        System.out.println(this.name + " received " + colleague.getName() + "'s Message : " + colleague.getMessage());

    }
}
