package behavioral.mediator.chatroom.implementation;

import behavioral.mediator.chatroom.Mediator;

public class AnotherColleague extends Colleague {

    public AnotherColleague(Mediator m) {
        super(m);
    }

    public void receive(String message) {
        System.out.println("AnotherColleague Received: " + message);
    }
}