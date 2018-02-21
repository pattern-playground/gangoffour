package behavioral.observer.auctionwatch.implementation;

import java.util.Observable;
import java.util.Observer;

// Notice that Observer lives in java.util
public class PersonWhoIsWatching implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("I have been alerted to an update!! " + arg.toString());
    }
}