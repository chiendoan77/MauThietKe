package Factory.Method.Pattern;

public class CandyStore {

    public static void main(String[] args) {

        Candy candy = CandyFactory.getCandy("chocolate");
        candy.create();

    }
}