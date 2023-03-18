package me.whiteship.designpatterns._01_creational_patterns._03_abstract_factory._03_after;

public class SamsungKeyboard implements Keyboard{
    @Override
    public void createKeyboard() {
        System.out.println("Samsung 키보드 생성");
    }
}
