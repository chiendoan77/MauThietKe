package Adapter;

public class Adapter implements PriceCalculator{
	private UKPriceCaculator adapter;
	public Adapter(double price) {
		adapter = new UKPriceCaculator(price);
	}
	@Override
	public double calculatePrice() {
		// TODO Auto-generated method stub
		return adapter.getPrice();
	}
	
}
