package me.whiteship.designpatterns._03_behavioral_patterns._17_mediator._04_after;

public interface Mediator {

    void addColleague(Colleague colleague);

    void mediate(Colleague colleague);
}
