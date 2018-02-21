package behavioral.mediator.chatroom.run;

import behavioral.mediator.chatroom.ApplicationMediator;
import behavioral.mediator.chatroom.implementation.AnotherColleague;
import behavioral.mediator.chatroom.implementation.Colleague;
import behavioral.mediator.chatroom.implementation.ConcreteColleague;

public class Client {

    public static void main(String[] args) {

        ApplicationMediator mediator = new ApplicationMediator();

        Colleague concrete = new ConcreteColleague(mediator);
        Colleague another = new AnotherColleague(mediator);

        mediator.addColleague(concrete);
        mediator.addColleague(another);

        concrete.send("A message from the concrete!");
        another.send("A message from another - we don't handle the messaging, the mediator does!");
    }
}

// *** Output ***
// AnotherColleague Received: A message from the concrete!
// ConcreteColleague Received: A message from another - we don't handle the messaging, the mediator does!