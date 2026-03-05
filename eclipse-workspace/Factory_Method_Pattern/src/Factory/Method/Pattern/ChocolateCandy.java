package Factory.Method.Pattern;

public class ChocolateCandy extends  Candy {

    @Override
    public void create() {
        System.out.println("Creating Chocolate Candy");
    }
}