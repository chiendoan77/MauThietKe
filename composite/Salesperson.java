package composite;

public class Salesperson implements Payee {
	private String name;
	Manager manager;
	
	Salesperson(String name,Manager manager){
		this.name = name;
		this.manager = manager;
	}
	@Override
	public void payExpenses(int amount) {
		System.out.println("SalesPerson " + name + "has been paid " + amount + " dollars" );
	}

}
