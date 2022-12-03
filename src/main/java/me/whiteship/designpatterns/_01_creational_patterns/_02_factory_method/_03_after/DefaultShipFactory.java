package me.whiteship.designpatterns._01_creational_patterns._02_factory_method._03_after;

public abstract class DefaultShipFactory implements ShipFactory {
    @Override
    public void sendMailTo(String email, Ship ship) {
        System.out.println(ship.getName() + " 다 만들었습니다.");
    }

    @Override
    public void prepareFor(String name) {
        System.out.println(name + " 만들 준비 중");
    }

    @Override
    public void validate(String name, String email) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("배 이름을 지어주세요.");
        }
        if (email == null || email.isBlank()) {
            throw new IllegalArgumentException("연락처를 남겨주세요.");
        }
    };
}