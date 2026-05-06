package Template_Method;

public class Main {

	public static void main(String[] args) {
		
		CharacterTemplate a = new Mage();
		a.playTurn();
		System.out.println("\n");
		CharacterTemplate b = new Warrior();
		b.playTurn();
		
		

	}

}
