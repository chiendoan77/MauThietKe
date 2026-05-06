package Command;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Light light = new Light();
        Curtain curtain = new Curtain();
        Projector projector = new Projector();

        ControlPanel panel = new ControlPanel();

        Command lightOff = new LightOffCommand(light);
        Command curtainDown = new CurtainCommand(curtain, 0);
        Command projectorWork = new ProjectorCommand(projector, "WORK");

        Command meetingMode = new MacroCommand(
            Arrays.asList(curtainDown, lightOff, projectorWork)
        );

        panel.executeCommand(meetingMode);

        System.out.println("UNDO...");
        panel.undo();
    }
}