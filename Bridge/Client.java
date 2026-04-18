package Bridge;


public class Client {
	public static void main(String[] agrs) {
		Shape s =  new Cricle(new Red());
		s.draw();
	}
}
