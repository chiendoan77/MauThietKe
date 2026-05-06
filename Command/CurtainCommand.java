package Command;

public class CurtainCommand implements Command {
    private Curtain curtain;
    private int newPos;
    private int prevPos;

    public CurtainCommand(Curtain curtain, int pos) {
        this.curtain = curtain;
        this.newPos = pos;
    }

    public void execute() {
        prevPos = curtain.getPosition();
        curtain.setPosition(newPos);
    }

    public void undo() {
        curtain.setPosition(prevPos);
    }
}