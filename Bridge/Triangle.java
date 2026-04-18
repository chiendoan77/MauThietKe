package Bridge;

public class Triangle extends Shape {
	public Triangle(Color color) {
		super(color);
	}

	Color color;

	public void draw() {
		System.out.println("Đây là tam giác" + color.nameColor());
	}
	
}
