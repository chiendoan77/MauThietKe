package Adapter;

public class UKPriceCaculator {
	private double price ;
	public UKPriceCaculator(double price) {
		this.price = price;
	}
	public double getPrice() {
		return price * 1.5;
		
	}
	
}
