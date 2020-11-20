package nandini;

public class BankingSystem {
	
	int debitCount;
	int creditCount;
	int currentBalance;
	static int debitCounttotal;
	static int creditCounttotal;
	static int totalbalanceCount;
	static int printTotalbalanceCount;

	void debitAmtDetails(int debitAmount) {
		currentBalance = currentBalance - debitAmount;
		debitCount++;
		debitCounttotal++;

	}

	void creditAmtDetails(int creditAmount) {
		currentBalance = currentBalance + creditAmount;
		creditCount++;
		creditCounttotal++;

	}

	void individualTransactionSummary(String individualUser) {
		System.out.println("Total " + creditCount + " times account was credited for "+ individualUser);
		System.out.println("Total " + debitCount + " times account was debited for "+ individualUser);

	}

	void printBalance(String user) {
		System.out.println(currentBalance + "  is the current balance of customer " + user);
		printTotalbalanceCount++;

	}

	void allTransactionSummaryReport() {
		System.out.println("Total " + creditCounttotal + " times account was Credited for all the user");
		System.out.println("Total " + debitCounttotal + " times account was debited for all the user");
		System.out.println("Total " +printTotalbalanceCount+ " times balance printed in the bank for all the transaction");

	}

	public static void main(String[] args) {
		BankingSystem bankingSystemUser1 = new BankingSystem();
		bankingSystemUser1.creditAmtDetails(800);
		bankingSystemUser1.creditAmtDetails(600);
		bankingSystemUser1.debitAmtDetails(900);
		bankingSystemUser1.individualTransactionSummary("User1");
		bankingSystemUser1.printBalance("User1");

		BankingSystem bankingSystemUser2 = new BankingSystem();
		bankingSystemUser2.creditAmtDetails(500);
		bankingSystemUser2.creditAmtDetails(300);
		bankingSystemUser2.creditAmtDetails(200);
		bankingSystemUser2.creditAmtDetails(500);
		bankingSystemUser2.creditAmtDetails(600);
		bankingSystemUser2.debitAmtDetails(700);
		bankingSystemUser2.debitAmtDetails(400);
		bankingSystemUser2.individualTransactionSummary("User2");
		bankingSystemUser2.printBalance("User2");

		BankingSystem bankingSystemReport = new BankingSystem();
		bankingSystemReport.allTransactionSummaryReport();

	}

}
