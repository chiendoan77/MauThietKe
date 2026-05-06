package State;

public class PausedState implements State {

    @Override
    public void play(MediaPlayer player) {
        System.out.println("Play music");
        player.setState(new PlayingState());
        player.setIcon("PAUSE ICON");
    }

    @Override
    public void pause(MediaPlayer player) {
        System.out.println("Already paused...");
    }
}