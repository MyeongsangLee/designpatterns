package me.whiteship.designpatterns._03_behavioral_patterns._18_memento._03_after;

public class App {

    public static void main(String[] args) {
        CareTaker careTaker = new CareTaker();
        Originator originator = new Originator();
        originator.setState("State 111");

        originator.setState("State 222");
        careTaker.add(originator.createMemento());

        originator.setState("State 333");
        careTaker.add(originator.createMemento());

        originator.setState("State 444");

        System.out.println("Current State: " + originator);

        originator.restore(careTaker.getMemento(0));
        System.out.println("Current State: " + originator);

        originator.restore(careTaker.getMemento(1));
        System.out.println("Current State: " + originator);

    }
}
