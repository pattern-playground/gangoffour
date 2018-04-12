package behavioral.state.mp3player.run;

import behavioral.state.mp3player.MP3PlayerContext;
import behavioral.state.mp3player.StandbyState;

public class Client {

    public static void main(String[] args) {
        MP3PlayerContext mp3PlayerContext = new MP3PlayerContext(new StandbyState());

        mp3PlayerContext.play(); // Start Playing
        mp3PlayerContext.play(); // Stop Playing

    }
}

// *** Output ***
// Setting state from Standby to Playing
// Setting state from Playing to Standby