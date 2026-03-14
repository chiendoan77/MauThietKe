package a;

public class CandyStore {

    public static void main(String[] args) {

        CandyFactory factory = new CandyFactory();

        Candy candy1 = factory.getNameCandy(TypeCandy.CHOCOLATE);
        candy1.thongBao();

        Candy candy2 = factory.getNameCandy(TypeCandy.LOLLIPOP);
        candy2.thongBao();

    }

}
