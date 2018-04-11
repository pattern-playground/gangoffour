package behavioral.iterator.remotecontrol;

// Could just use java.util.Iterator here
public interface ChannelIterator {

    public boolean hasNext();

    public String next();
}