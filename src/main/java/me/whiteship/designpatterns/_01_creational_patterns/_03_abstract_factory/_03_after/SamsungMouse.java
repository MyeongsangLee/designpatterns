package me.whiteship.designpatterns._01_creational_patterns._03_abstract_factory._03_after;

public class SamsungMouse implements Mouse{
    @Override
    public void createMouse() {
        System.out.println("Samsung 마우스 생성");
    }
}
