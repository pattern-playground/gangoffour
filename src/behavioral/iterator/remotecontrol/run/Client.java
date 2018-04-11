package behavioral.iterator.remotecontrol.run;

import behavioral.iterator.remotecontrol.ChannelIterator;
import behavioral.iterator.remotecontrol.implementation.ConcreteTV;

public class Client {

    public static void main(String[] args) {
        ConcreteTV concreteTV = new ConcreteTV();
        ChannelIterator iterator = concreteTV.getIterator();

        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

// Checking if has a next element
// Going to next element...
// BBC 1
// Checking if has a next element
// Going to next element...
// BBC 2
// Checking if has a next element
