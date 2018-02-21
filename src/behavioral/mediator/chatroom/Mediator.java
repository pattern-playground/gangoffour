package behavioral.mediator.chatroom;

import behavioral.mediator.chatroom.implementation.Colleague;

public interface Mediator {
    public void send(String message, Colleague colleague);
}
