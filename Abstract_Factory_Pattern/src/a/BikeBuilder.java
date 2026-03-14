package a;

public class BikeBuilder {
	private Wheel wheel;
	public void build(BiKeFactory bikeF) {
		this.wheel = bikeF.getWheel();
	}
	public void showResult() {
		if (wheel != null) {
			wheel.getInfo();
		}
	}
}