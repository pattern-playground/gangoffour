package behavioral.mediator.chatroom.implementation;

import behavioral.mediator.chatroom.Mediator;

public class ConcreteColleague extends Colleague {

    public ConcreteColleague(Mediator m) {
        super(m);
    }

    public void receive(String message) {
        System.out.println("ConcreteColleague Received: " + message);
    }
}