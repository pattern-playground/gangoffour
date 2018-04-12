package behavioral.state.mp3player;

public class StandbyState implements State {

    public void pressPlay(MP3PlayerContext context) {
        System.out.println("Setting state from Standby to Playing");
        context.setState(new PlayingState());
    }
}