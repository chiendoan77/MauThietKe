package Factory.Method.Pattern;

public class MintCandy extends  Candy {

    @Override
    public void create() {
        System.out.println("Creating Mint Candy");
    }
}