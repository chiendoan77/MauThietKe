package a;

public class CandyFactory {

    public Candy getNameCandy(TypeCandy type) {

        if (type == TypeCandy.CHOCOLATE) {
            return new Chocolate();
        }

        if (type == TypeCandy.LOLLIPOP) {
            return new Lollipop();
        }

        return null;
    }

}
