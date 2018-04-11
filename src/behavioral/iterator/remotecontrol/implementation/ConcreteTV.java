package behavioral.iterator.remotecontrol.implementation;

import behavioral.iterator.remotecontrol.ChannelIterator;
import behavioral.iterator.remotecontrol.TV;

import java.util.ArrayList;
import java.util.List;

// Concrete Aggregator
public class ConcreteTV implements TV {

    private ChannelIterator iterator;
    private List<String> channels;

    public ConcreteTV() {
        channels = new ArrayList<>();
        channels.add("BBC 1");
        channels.add("BBC 2");

        iterator = new ConcreteChannelIterator(channels);
    }

    public ChannelIterator getIterator() {
        return iterator;
    }
}