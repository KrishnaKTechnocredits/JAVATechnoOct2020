package technoCredits.multithreading;

public class Client1 {

	public static void main(String[] args) {
		Bank bank = new Bank(); // one account
		//Bank bank2 = new Bank(); 
		
		Maulik maulik = new Maulik(bank);
		Krishna krishna = new Krishna(bank);
		
		maulik.start();
		krishna.start();
		
	}
}
