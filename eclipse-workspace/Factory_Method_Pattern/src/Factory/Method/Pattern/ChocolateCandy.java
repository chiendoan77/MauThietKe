package Factory.Method.Pattern;

public class ChocolateCandy implements Candy {

    @Override
    public void create() {
        System.out.println("Creating Chocolate Candy");
    }
}