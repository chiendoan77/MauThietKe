package Command;

public class Projector {
    private String mode = "OFF";

    public void setMode(String mode) {
        this.mode = mode;
        System.out.println("Projector mode: " + mode);
    }

    public String getMode() {
        return mode;
    }
}