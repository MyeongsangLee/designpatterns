package me.whiteship.designpatterns._02_structure_patterns._07_bridge._05_my_after;

public class HuntingMethod1 implements HuntingHandler {

    private String name;

    public HuntingMethod1(String name) {
        this.name = name;
    }

    @Override
    public void prey() {
        System.out.println(name + " 지상에서 찾는다");
    }

    @Override
    public void detected() {
        System.out.println(name + " 노루 발견");
    }

    @Override
    public void attack() {
        System.out.println(name + " 물어뜯는다");
    }
}
