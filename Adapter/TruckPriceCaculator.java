package Adapter;

public class TruckPriceCaculator implements PriceCalculator{

	private double priceTruck;
	
	public TruckPriceCaculator(double priceTruck) {
		this.priceTruck = priceTruck; 
	}

	
	@Override
	public double calculatePrice() {
		return priceTruck * 2;
	}

	
	
}
