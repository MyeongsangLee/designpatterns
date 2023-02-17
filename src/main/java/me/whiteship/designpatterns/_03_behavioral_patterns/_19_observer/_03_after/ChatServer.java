package me.whiteship.designpatterns._03_behavioral_patterns._19_observer._03_after;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ChatServer {

    private Map<String, List<Subscriber>> subscribers = new HashMap<>();

    public void register(String subject, Subscriber subscriber) {
        if (this.subscribers.containsKey(subject)) {
            this.subscribers.get(subject).add(subscriber);
        } else {
            ArrayList<Subscriber> arrayList = new ArrayList<>();
            arrayList.add(subscriber);
            this.subscribers.put(subject, arrayList);
        }
    }

    public void unregister(String subject, Subscriber subscriber) {
        this.subscribers.get(subject).remove(subscriber);
    }

    public void sendMessage(User user, String subject, String message) {
        if (this.subscribers.containsKey(subject)) {
            String userMessage = user.getName() + " : " + message;
            this.subscribers.get(subject).forEach(subscriber -> subscriber.handleMessage(userMessage));
        }

    }
}
