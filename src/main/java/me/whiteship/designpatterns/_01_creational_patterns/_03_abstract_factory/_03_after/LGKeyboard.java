package me.whiteship.designpatterns._01_creational_patterns._03_abstract_factory._03_after;

public class LGKeyboard implements Keyboard{
    @Override
    public void createKeyboard() {
        System.out.println("LG 키보드 생성");
    }
}
