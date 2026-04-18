package composite;

import java.util.ArrayList;
import java.util.List;

public class SalesTeam implements Payee {
	private List<Payee> members = new ArrayList<>(); 
	
	@Override
	public void payExpenses(int amount) {
		for (Payee p : members) {
			p.payExpenses(amount);
		}
	}
	public void add(Payee p) {
		members.add(p);
	}
	public void remove(Payee p) {
		members.remove(p);
	}
}
