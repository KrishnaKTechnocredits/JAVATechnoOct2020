package shrutiS;

public class BankingSystem {
	int debitCount;
	int creditCount;
	int balanceCount;
	//double totalDebit;
	//double totalCredit;
	static int totalDebitTimes;
	static int totalCreditTimes;
	static int totalBalanceTimes;

	void debitAmount(double debitAmount) {
		// System.out.println("Amount debited : "+ debitAmount);
		//totalDebit = totalDebit + debitAmount;
		debitCount++;
		totalDebitTimes++;
	}
	void creditAmount(double creditAmount) {
		// System.out.println("Amount credited : "+ creditAmount);
		//totalCredit = totalCredit + creditAmount;
		creditCount++;
		totalCreditTimes++;
	}
	void printBalance() {
		//double availBalance = totalCredit - totalDebit;
		//System.out.println("Available balance : "+ availBalance);
		balanceCount++;
		totalBalanceTimes++;
	}
	void individualTransactionSummary(int user) {           
		
		System.out.println("User" + user + " transaction summary : credit: " + creditCount + " times, Debit: "+ debitCount + " times, printBalance: " +balanceCount+" times");
	}
	static void allTransactionSummary() {
		
		System.out.println("All transaction summary : Credit: "+totalCreditTimes +" times, Debit: "+totalDebitTimes+" times, printBalance: "+totalBalanceTimes+" times");
	}

	public static void main(String[] a) {
		BankingSystem bank1 = new BankingSystem();
		
		bank1.debitAmount(300);
		for (int i = 1; i <= 2; i++) {
			bank1.creditAmount(400);
		}
		bank1.printBalance();
		bank1.individualTransactionSummary(1);

		BankingSystem bank2 = new BankingSystem();
		
		for (int i = 1; i <= 5; i++) {
			bank2.creditAmount(100);
		}
		for (int i = 1; i <= 2; i++) {
			bank2.debitAmount(100);
		}
		bank2.individualTransactionSummary(2);

		allTransactionSummary();
	}

}
