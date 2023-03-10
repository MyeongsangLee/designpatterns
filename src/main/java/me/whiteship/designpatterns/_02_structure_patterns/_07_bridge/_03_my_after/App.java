package me.whiteship.designpatterns._02_structure_patterns._07_bridge._03_my_after;

public class App {

    public static void main(String[] args) {

        Champion kda아리 = new 아리(new KDA());
        kda아리.skillQ();
        kda아리.skillW();

        Champion poolParty아리 = new 아리(new PoolParty());
        poolParty아리.skillR();
        poolParty아리.skillW();
    }
}
