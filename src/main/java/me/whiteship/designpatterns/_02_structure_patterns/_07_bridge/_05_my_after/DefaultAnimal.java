package me.whiteship.designpatterns._02_structure_patterns._07_bridge._05_my_after;

public abstract class DefaultAnimal implements Animal{

    private HuntingHandler huntingMethod;

    public DefaultAnimal(HuntingHandler huntingMethod) {
        this.huntingMethod = huntingMethod;
    }

    @Override
    public void prey() {
        huntingMethod.prey();
    }

    @Override
    public void detected() {
        huntingMethod.detected();
    }

    @Override
    public void attack() {
        huntingMethod.attack();
    }

    public abstract void hunt();
}
