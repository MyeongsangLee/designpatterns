package me.whiteship.designpatterns._02_structure_patterns._06_adapter._03_exec;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TurkeyAdapterTest {

    @Test
    void testAdapter() {
        Turkey turkey = new WildTurkey();
        turkey.gobble();
        turkey.fly();

        Duck duck = new MallardDuck();
        testDuck(duck);

        TurkeyAdapter turkeyAdapter = new TurkeyAdapter(new WildTurkey());
        testDuck(turkeyAdapter);
    }

    public static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }

}