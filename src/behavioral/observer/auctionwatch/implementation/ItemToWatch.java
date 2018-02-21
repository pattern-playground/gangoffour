package behavioral.observer.auctionwatch.implementation;

import java.util.Observable;

// Notice that Observable lives in java.util
public class ItemToWatch extends Observable {

    private String itemData;
    public String getItemData() {
        return itemData;
    }

    public void setItemData(String itemData) {
        this.itemData = itemData;
        setChanged(); // Mark the observable as changed
    }
}