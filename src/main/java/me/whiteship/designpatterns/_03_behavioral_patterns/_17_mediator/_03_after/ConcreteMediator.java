package me.whiteship.designpatterns._03_behavioral_patterns._17_mediator._03_after;

import java.util.ArrayList;
import java.util.List;

public class ConcreteMediator implements Mediator{

    private List<Colleague> colleagueList = new ArrayList<>();

    @Override
    public void addColleague(Colleague colleague) {
        this.colleagueList.add(colleague);
    }

    @Override
    public void mediate(Colleague colleague) {
        for (Colleague receiverColleague : colleagueList) {
            System.out.println("\tMediating " + colleague.getName() + " to " + receiverColleague.getName());
            receiverColleague.receive(colleague);
        }
    }
}
