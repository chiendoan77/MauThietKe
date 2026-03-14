package a;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintSpooler ps1 = PrintSpooler.getInstance();
		PrintSpooler ps2 = PrintSpooler.getInstance();
		System.out.println(ps1 == ps2);
	}

}
