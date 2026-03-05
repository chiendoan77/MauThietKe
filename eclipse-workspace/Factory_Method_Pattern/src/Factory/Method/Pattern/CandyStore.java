package Factory.Method.Pattern;

public class CandyStore {

    public static void main(String[] args) {

    	Candy candy1 = CandyFactory.getCandy("chocolate");
        candy1.create();

        Candy candy2 = CandyFactory.getCandy("mint");
        candy2.create();

    }
}