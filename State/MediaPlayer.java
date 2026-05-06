package State;

public class MediaPlayer {
    private State state;
    private String icon;

    public MediaPlayer() {
        state = new PausedState();
        icon = "PLAY ICON";
    }

    public void setState(State state) {
        this.state = state;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public void play() {
        state.play(this);
    }

    public void pause() {
        state.pause(this);
    }

    public void showIcon() {
        System.out.println("Icon: " + icon);
    }
}