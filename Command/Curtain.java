package Command;

public class Curtain {
    private int position = 100;

    public void setPosition(int pos) {
        position = pos;
        System.out.println("Curtain at " + pos + "%");
    }

    public int getPosition() {
        return position;
    }
}