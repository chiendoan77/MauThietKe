package a;

public class RoadBikeFactory implements BiKeFactory {

	@Override
	public Wheel getWheel() {
		// TODO Auto-generated method stub
		return new RoadBikeWheel();
	}

}