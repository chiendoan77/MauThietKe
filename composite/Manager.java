package composite;

public class Manager implements Payee {
	private String name;

	@Override
	public void payExpenses(int amount) {
		System.out.println("Manager " + name + "has been paid "  + amount + " dollars" );
	}
	public Manager(String name) {
		this.name = name;
	}

}
