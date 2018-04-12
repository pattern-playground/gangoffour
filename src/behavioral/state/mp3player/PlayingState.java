package behavioral.state.mp3player;

public class PlayingState implements State {

    public void pressPlay(MP3PlayerContext context) {
        System.out.println("Setting state from Playing to Standby");
        context.setState(new StandbyState());
    }
}
