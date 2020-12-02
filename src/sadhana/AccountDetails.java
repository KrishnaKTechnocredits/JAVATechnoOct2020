package sadhana;

public class AccountDetails {

	int debit, credit,currentBalance;
	static int debitCount, creditCount, printBalCount;


	void debitAmount(int amountDebited) {
		currentBalance = currentBalance - amountDebited;
		debit++;
		debitCount++;
	}

	void creditAmount(int amountCredited) {
		currentBalance = currentBalance + amountCredited;
		credit++;
		creditCount++;
	}

	void printBalance(String name) {
		
		printBalCount++;
		
		
	}

	void individualTransactionSummary(String name) {
		System.out.println(name + " transaction summary : Credit - " + credit + " times, Debit - " + debit + " times, printBalance - " + printBalCount + " time");
	}

	void allTransactionSummary() {
		System.out.println("All transaction summary : Credit - " + credit + " times, Debit - " + debitCount + " times, printBalance - " + printBalCount +" time");
	} 

	public static void main(String[] args) {
		AccountDetails accountDetails = new AccountDetails();
		accountDetails.creditAmount(20000);
		accountDetails.debitAmount(500);
		accountDetails.printBalance("User1");
		accountDetails.creditAmount(10000);
		accountDetails.printBalance("User1");
		accountDetails.debitAmount(8000);
		accountDetails.debitAmount(2000);
		accountDetails.creditAmount(5000);
		accountDetails.printBalance("User1");
		accountDetails.individualTransactionSummary("User1");
		accountDetails.allTransactionSummary();
		
		AccountDetails accountDetails1 = new AccountDetails();
		accountDetails1.creditAmount(30000);
		accountDetails1.debitAmount(11181);
		accountDetails1.printBalance("User2");
		accountDetails1.creditAmount(200000);
		accountDetails1.printBalance("User2");
		accountDetails1.debitAmount(1000);
		accountDetails1.debitAmount(3000);
		accountDetails1.creditAmount(28000);
		accountDetails1.printBalance("User2");
		accountDetails1.individualTransactionSummary("User2");
		accountDetails1.allTransactionSummary();
	}

}

