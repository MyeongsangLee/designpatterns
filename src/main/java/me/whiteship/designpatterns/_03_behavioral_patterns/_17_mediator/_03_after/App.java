package me.whiteship.designpatterns._03_behavioral_patterns._17_mediator._03_after;

public class App {
    public static void main(String[] args) {
        Mediator mediator = new ConcreteMediator();
        Colleague user1 = new ConcreteColleague1("user1");
        Colleague user2 = new ConcreteColleague1("user2");
        Colleague user3 = new ConcreteColleague2("user3");
        Colleague user4 = new ConcreteColleague3("user4");

        mediator.addColleague(user1);
        mediator.addColleague(user2);
        mediator.addColleague(user3);
        mediator.addColleague(user4);

        user1.setMediator(mediator);
        user2.setMediator(mediator);
        user3.setMediator(mediator);
        user4.setMediator(mediator);

        user1.setMessage("chat gpt 안가요?");
        user1.send();

    }
}
