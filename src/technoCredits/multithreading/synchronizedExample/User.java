package technoCredits.multithreading.synchronizedExample;

public class User extends Thread{
	Bank bankAccount;
	
	User(Bank bankAccount){
		this.bankAccount = bankAccount;
	}
	
	public void run() {
		bankAccount.debitAmt(8000);
	}
	
	
}
