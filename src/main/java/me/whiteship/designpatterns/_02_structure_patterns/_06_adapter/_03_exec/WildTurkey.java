package me.whiteship.designpatterns._02_structure_patterns._06_adapter._03_exec;

//야생칠면조
public class WildTurkey implements Turkey{
    @Override
    public void gobble() {
        System.out.println("WildTurkey gobble");
    }

    @Override
    public void fly() {
        System.out.println("WildTurkey I'm flying");
    }
}
