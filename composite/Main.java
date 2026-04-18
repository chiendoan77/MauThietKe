package composite;

public class Main {
    public static void main(String[] args) {

        Manager m1 = new Manager("Alice");
        Manager m2 = new Manager("Bob");

        Salesperson s1 = new Salesperson("John", m1);
        Salesperson s2 = new Salesperson("David", m2);

        SalesTeam team1 = new SalesTeam();
        team1.add(m1);
        team1.add(s1);

        SalesTeam team2 = new SalesTeam();
        team2.add(m2);
        team2.add(s2);

        // team lớn hơn (nested composite)
        SalesTeam company = new SalesTeam();
        company.add(team1);
        company.add(team2);

        company.payExpenses(1000);
    }
}
