package Command;

public class ProjectorCommand implements Command {
    private Projector projector;
    private String newMode;
    private String prevMode;

    public ProjectorCommand(Projector projector, String mode) {
        this.projector = projector;
        this.newMode = mode;
    }

    public void execute() {
        prevMode = projector.getMode();
        projector.setMode(newMode);
    }

    public void undo() {
        projector.setMode(prevMode);
    }
}