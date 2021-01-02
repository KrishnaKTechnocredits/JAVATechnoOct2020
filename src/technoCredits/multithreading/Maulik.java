package technoCredits.multithreading;

public class Maulik extends Thread{
	Bank bank;
	Maulik(Bank bank){
		this.bank = bank;
	}
	
	public void run() {
		bank.debit();
	}
}
