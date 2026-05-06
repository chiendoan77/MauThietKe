package Template_Method;

public abstract class CharacterTemplate {

    public final void playTurn() {
        move();
        attack();
        specialSkill();
        endTurn();
    }

    private void move() {
        System.out.println("Moving...");
    }

    private void attack() {
        System.out.println("Basic attack");
    }

    protected abstract void specialSkill();

    private void endTurn() {
        System.out.println("End turn");
    }
}