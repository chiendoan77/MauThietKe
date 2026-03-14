package a;

public class MountainBikeFactory implements BiKeFactory {

	@Override
	public Wheel getWheel() {
		// TODO Auto-generated method stub
		return new MountainBikeWheel();
	}
}