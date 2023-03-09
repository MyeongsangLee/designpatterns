package me.whiteship.designpatterns._02_structure_patterns._07_bridge._03_my_after;

public class DefaultChampion implements Champion{

    private Skin skin;
    private String name;

    public DefaultChampion(Skin skin, String name) {
        this.skin = skin;
        this.name = name;
    }

    @Override
    public void move() {
        System.out.println( this.name + " : " + skin.getName() + " move");
    }

    @Override
    public void skillQ() {
        System.out.println( this.name + " : " + skin.getName() + " skillQ");
    }

    @Override
    public void skillW() {
        System.out.println( this.name + " : " + skin.getName() + " skillW");
    }

    @Override
    public void skillE() {
        System.out.println( this.name + " : " + skin.getName() + " skillE");
    }

    @Override
    public void skillR() {
        System.out.println( this.name + " : " + skin.getName() + " skillR");
    }
}
