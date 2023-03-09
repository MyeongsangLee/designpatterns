package me.whiteship.designpatterns._02_structure_patterns._06_adapter._03_exec;

import org.junit.jupiter.api.Test;

class TurkeyAdapterTest {

    @Test
    void testAdapter() {
        Duck duck = new MallardDuck();
        testDuck(duck);

        TurkeyAdapter adapter = new TurkeyAdapter(new WildTurkey());
        testDuck(adapter);
    }

    public static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }

}