package me.whiteship.designpatterns._03_behavioral_patterns._17_mediator._04_after;

public class ConcreteColleague2 extends Colleague{

    public ConcreteColleague2(String name) {
        super(name);
    }

    @Override
    public void receive(Colleague colleague) {
        System.out.println("from2 " + colleague.getName() + " to2 " + this.getName() + " message 안 받을 랍니다.");
    }

}
