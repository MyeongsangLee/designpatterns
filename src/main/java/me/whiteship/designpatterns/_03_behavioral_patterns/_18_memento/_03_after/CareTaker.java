package me.whiteship.designpatterns._03_behavioral_patterns._18_memento._03_after;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {

    List<Memento> mementos = new ArrayList<>();

    public void add(Memento memento) {
        this.mementos.add(memento);
    }

    public Memento getMemento(int i) {
        return this.mementos.get(i);
    }
}
