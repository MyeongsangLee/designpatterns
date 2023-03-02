package me.whiteship.designpatterns._03_behavioral_patterns._17_mediator._04_after;

public class App {

    public static void main(String[] args) {
        Mediator mediator = new ConcreteMediator();
        Colleague user1 = new ConcreteColleague1("user1");
        Colleague user2 = new ConcreteColleague1("user2");
        Colleague user3 = new ConcreteColleague2("user3");
        mediator.addColleague(user1);
        mediator.addColleague(user2);
        mediator.addColleague(user3);

        user1.setMediator(mediator);
        user2.setMediator(mediator);
        user3.setMediator(mediator);

        user1.setMessage("혹시 chat GPT 아시나요?");
        user1.send();
    }
}
