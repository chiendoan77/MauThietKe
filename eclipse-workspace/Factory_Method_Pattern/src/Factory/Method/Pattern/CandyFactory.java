package Factory.Method.Pattern;

public class CandyFactory {

    public static Candy getCandy(String type) {

        if(type.equalsIgnoreCase("chocolate")){
            return new ChocolateCandy();
        }
        else if(type.equalsIgnoreCase("mint")){
            return new MintCandy();
        }

        return null;
    }
}
