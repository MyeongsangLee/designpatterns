package me.whiteship.designpatterns._02_structure_patterns._07_bridge._05_my_after;

public class Tiger extends DefaultAnimal{

    public Tiger(HuntingHandler huntingMethod) {
        super(huntingMethod);
    }

    @Override
    public void hunt() {
        System.out.println("호랑이의 사냥방법");
        prey();
        detected();
        attack();
    }
}
