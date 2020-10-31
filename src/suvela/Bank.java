package suvela;

public class Bank {
	static int debitAmt;
	static int creditAmt;
	static int balanceAmt;
	int debitAmount;
	int creditAmount;
	int printBalance;
	static int amount;

	void debitAmount(int dAmt) {
		debitAmount++;
		debitAmt++;
		amount = amount - dAmt;
		System.out.println("Debited amount : " + dAmt);

	}

	void creditAmount(int cAmt) {
		creditAmount++;
		creditAmt++;
		amount = amount + cAmt;
		System.out.println("Credited amount : " + cAmt);
	}

	void printBalance() {
		System.out.println("Current balance : "+amount);
		printBalance++;
		balanceAmt++;
	}

	void individualTransactionsummary() {
		System.out.println("Credit= " + creditAmount + " Debit = " + debitAmount + " Print Balance = " + printBalance);
	}

	static void allTransactionsummary() {
		System.out.println("--All transaction summary--");
		System.out.println("Credit = " + creditAmt + " Debit = " + debitAmt + " Print Balance = " + balanceAmt);
	}

	public static void main(String[] args) {
		Bank bank = new Bank();
		System.out.println("User1 summary:");
		bank.creditAmount(400);
		bank.creditAmount(200);
		bank.debitAmount(300);
		bank.printBalance();
		bank.individualTransactionsummary();

		Bank bank1 = new Bank();
		System.out.println("User2 summary:");
		bank1.creditAmount(10);
		bank1.creditAmount(10);
		bank1.creditAmount(10);
		bank1.creditAmount(10);
		bank1.creditAmount(10);
		bank1.debitAmount(5);
		bank1.debitAmount(5);
		bank1.individualTransactionsummary();

		allTransactionsummary();

	}

}
