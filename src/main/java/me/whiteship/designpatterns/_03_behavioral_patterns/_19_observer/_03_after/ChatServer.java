package me.whiteship.designpatterns._03_behavioral_patterns._19_observer._03_after;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ChatServer {

    private Map<String, List<Subscriber>> subscribers = new HashMap<>();

    public void register(String subject, Subscriber subscriber) {
        if (subscribers.containsKey(subject)) {
            subscribers.get(subject).add(subscriber);
        } else {
            List<Subscriber> list = new ArrayList<>();
            list.add(subscriber);
            subscribers.put(subject, list);
        }
    }

    public void unRegister(String subject, Subscriber subscriber) {
        if (subscribers.containsKey(subject)) {
            subscribers.get(subject).remove(subscriber);
        }
    }

    public void sendMessage(User user, String subject, String message) {

        if (subscribers.containsKey(subject)) {
            String sendMessage = user.getName() + " : " + message;
            subscribers.get(subject).forEach(subscriber -> subscriber.handlerMessage(sendMessage));
        }
    }

}
