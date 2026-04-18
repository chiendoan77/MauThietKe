package Adapter;

public class CarPriceCaculator implements PriceCalculator{

	private double priceCar;
	public CarPriceCaculator(double priceCar) {
		this.priceCar = priceCar;
	}
	@Override
	public double calculatePrice() {
		return priceCar * 1.5 ;
	}

	
}
