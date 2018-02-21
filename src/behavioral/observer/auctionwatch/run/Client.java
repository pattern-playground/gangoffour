package behavioral.observer.auctionwatch.run;

import behavioral.observer.auctionwatch.implementation.ItemToWatch;
import behavioral.observer.auctionwatch.implementation.PersonWhoIsWatching;

public class Client {

    public static void main(String[] args) {
        ItemToWatch itemToWatch = new ItemToWatch();
        PersonWhoIsWatching personWhoIsWatching  = new PersonWhoIsWatching();

        itemToWatch.addObserver(personWhoIsWatching);
        itemToWatch.setItemData("Changing the Data in the Item"); // setChanged() in Observable must be called otherwise no-one is notified.

        itemToWatch.notifyObservers("Notifying Observers");
    }
}

// *** Output ***
// I have been alerted to an update!! Notifying Observers