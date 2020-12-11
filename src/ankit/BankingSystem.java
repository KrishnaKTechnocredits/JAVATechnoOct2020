package ankit;

public class BankingSystem {

	int debitCount;
	int creditCount;
	int currentBalance;
	static int totalDebitCount;
	static int totalCreditCount;
	static int totalBalanceCount;
	static int totalPrintBalanceCount;

	void debitFunction(int debitAmount) {
		currentBalance = currentBalance - debitAmount;
		debitCount++;
		totalDebitCount++;

	}

	void creditFunction(int creditAmount) {
		currentBalance = currentBalance + creditAmount;
		creditCount++;
		totalCreditCount++;

	}

	void individualTransactionSummary(String User) {
		System.out.println("Total " + creditCount + " times account was credited for "+User);
		System.out.println("Total " + debitCount + " times account was debited for "+User);

	}

	void printBalance(String User) {
		System.out.println(currentBalance + "  is the current balance of customer " + User);
		totalPrintBalanceCount++;

	}

	void allTransactionSummaryReport() {
		System.out.println("Total " + totalCreditCount + " times account was Credited for all the user");
		System.out.println("Total " + totalDebitCount + " times account was debited for all the user");
		System.out.println("Total " +totalPrintBalanceCount+ " times balance printed in the bank for all the transaction");

	}

	public static void main(String[] args) {
		BankingSystem bankingSystemUser1 = new BankingSystem();
		bankingSystemUser1.creditFunction(700);
		bankingSystemUser1.creditFunction(700);
		bankingSystemUser1.debitFunction(500);
		bankingSystemUser1.individualTransactionSummary("User1");
		bankingSystemUser1.printBalance("User1");

		BankingSystem bankingSystemUser2 = new BankingSystem();
		bankingSystemUser2.creditFunction(200);
		bankingSystemUser2.creditFunction(300);
		bankingSystemUser2.creditFunction(400);
		bankingSystemUser2.creditFunction(500);
		bankingSystemUser2.creditFunction(600);
		bankingSystemUser2.debitFunction(500);
		bankingSystemUser2.debitFunction(400);
		bankingSystemUser2.individualTransactionSummary("User2");
		bankingSystemUser2.printBalance("User2");

		BankingSystem bankingSystemReport = new BankingSystem();
		bankingSystemReport.allTransactionSummaryReport();

	}

}
