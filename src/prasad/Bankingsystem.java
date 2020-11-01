package prasad;

public class Bankingsystem {
	
	long accountBalance;
	long debitAmount;
	long creditAmount;

	void debitamount(long amount) {
		debitAmount=amount;
		accountBalance = accountBalance+amount;	
		}

	void creditamount(long amount) {
		creditAmount=amount;
		accountBalance= accountBalance-amount;
	}
	
	void printBalance() {
		System.out.println("Account Balance: " + accountBalance);
	}


public static void main(String[]arg) {
	Bankingsystem bankingsystem = new Bankingsystem();
	bankingsystem.debitamount(1000);
	bankingsystem.debitamount(1500);
	bankingsystem.printBalance();
	

	
	
	
	
	
	}
}
