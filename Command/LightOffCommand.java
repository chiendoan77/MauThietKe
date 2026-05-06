package Command;

public class LightOffCommand implements Command {
    private Light light;
    private int prevState;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        prevState = light.getBrightness();
        light.off();
    }

    public void undo() {
        light.setBrightness(prevState);
    }
}
