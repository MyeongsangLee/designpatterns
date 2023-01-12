package me.whiteship.designpatterns._02_structure_patterns._06_adapter._03_exec;

//청둥오리
public class MallardDuck implements Duck{
    @Override
    public void quack() {
        System.out.println("MallardDuck Quack");
    }

    @Override
    public void fly() {
        System.out.println("MallardDuck I'm flying");
    }
}
