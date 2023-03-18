package me.whiteship.designpatterns._01_creational_patterns._03_abstract_factory._03_after;

public class SamsungComputer implements ComputerFactory{
    @Override
    public Mouse createMouse() {
        return new SamsungMouse();
    }

    @Override
    public Keyboard createKeyboard() {
        return new SamsungKeyboard();
    }
}
