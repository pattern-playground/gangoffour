package behavioral.iterator.remotecontrol.implementation;

import behavioral.iterator.remotecontrol.ChannelIterator;

import java.util.List;

public class ConcreteChannelIterator implements ChannelIterator {

    public ConcreteChannelIterator(List<String> channels) {
        this.channels = channels;
    }

    private List<String> channels;
    private int someCounter = 0;

    @Override
    public boolean hasNext() {
        System.out.println("Checking if has a next element");
        return someCounter < channels.size();
    }

    @Override
    public String next() {
        System.out.println("Going to next element...");
        String channel = channels.get(someCounter);
        if(someCounter < channels.size()) {
            someCounter++;
        }
        return channel;
    }
}
