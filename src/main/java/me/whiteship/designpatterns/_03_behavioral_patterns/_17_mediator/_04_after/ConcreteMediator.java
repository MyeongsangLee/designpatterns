package me.whiteship.designpatterns._03_behavioral_patterns._17_mediator._04_after;

import java.util.ArrayList;
import java.util.List;

public class ConcreteMediator implements Mediator{

    private List<Colleague> colleagues = new ArrayList<>();

    public void addColleague(Colleague colleague) {
        this.colleagues.add(colleague);
    }

    @Override
    public void mediate(Colleague colleague) {
        this.colleagues.forEach(c -> c.receive(c));
    }
}
