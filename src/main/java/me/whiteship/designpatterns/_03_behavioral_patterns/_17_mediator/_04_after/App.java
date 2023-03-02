package me.whiteship.designpatterns._03_behavioral_patterns._17_mediator._04_after;

public class App {

    public static void main(String[] args) {
        ConcreteMediator mediator = new ConcreteMediator();
        Colleague user1 = new ConcreteColleagueA("user1");
        mediator.addColleague(user1);

        user1.setMediator(mediator);

        user1.setMessage("chat gpt 안가요?");
        user1.send();

    }
}
