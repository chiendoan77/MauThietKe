package Bridge;

public class Cricle extends Shape {
	public Cricle(Color color) {
		super(color);
	}
	

	@Override
	public void draw() {
		System.out.println("Đây là hình tròn " + color.nameColor());
	}
}
