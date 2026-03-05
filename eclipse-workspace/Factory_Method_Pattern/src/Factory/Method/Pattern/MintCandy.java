package Factory.Method.Pattern;

public class MintCandy implements Candy {

    @Override
    public void create() {
        System.out.println("Creating Mint Candy");
    }
}