package Adapter;

public class Main {

	public static void main(String[] args) {
		PriceCalculator car = new CarPriceCaculator(200000);
		PriceCalculator truck = new TruckPriceCaculator(500000);
		
		PriceCalculator UKCaculator = new Adapter(3000);
		
		System.out.println("car : " + car.calculatePrice());
		System.out.println("truck : " + truck.calculatePrice());
		System.out.println("UKCaculator : " + UKCaculator.calculatePrice());
	}

}
