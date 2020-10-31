package priyanka;

public class BankingSystem {

	int balance;
	static int totalCredit;
	static int totalDebit;
	static int totalPrintBalance;
	int credit;
	int debit;
	int printBal;

	void accountHolder(String accountHolderName) {
		if (accountHolderName == "Priyanka") {
			System.out.println("The Account Holder Name:" + accountHolderName);
			creditAmount(1000);
			debitAmount(500);
			creditAmount(2000);
			debitAmount(500);
			creditAmount(200);
			//individualTransaction();
			printBalance();
		}

		else if (accountHolderName == "Riya") {
			System.out.println("The Account Holder Name:" + accountHolderName);
			creditAmount(5000);
			debitAmount(500);
			creditAmount(2000);
			//individualTransaction();
			printBalance();
		}
	}

	void debitAmount(int debitAmount) {

		balance = balance - debitAmount;
		System.out.println("The debited amount is :" + debitAmount);
		System.out.println("The current Balance is :" + balance);
		debit++;
		totalDebit++;

	}

	void creditAmount(int creditAmount) {

		balance = balance + creditAmount;
		System.out.println("The Credited amount is :" + creditAmount);
		System.out.println("The current Balance is :" + balance);
		credit++;
		totalCredit++;
	}

	void printBalance() {
		printBal++;
		totalPrintBalance++;
		individualTransaction();
	}

	void individualTransaction() {
		System.out.println("Transaction summary is: ");
		System.out.println(
				" Credit " + credit + " times " + " Debit " + debit + " times " + " Print " + printBal + " times ");

	}

	static void allTransactionSummary() {

		System.out.println(" All Transaction summary is: ");
		System.out.println(" Credit " + totalCredit + " times " + " Debit " + totalDebit + " times " + " Print "
				+ totalPrintBalance + " times ");

	}

	public static void main(String[] arg) {

		BankingSystem bankingSystem1 = new BankingSystem();
		bankingSystem1.accountHolder("Priyanka");
		System.out.println("****************************************************");

		BankingSystem bankingSystem2 = new BankingSystem();
		bankingSystem2.accountHolder("Riya");
		System.out.println("****************************************************");
		allTransactionSummary();

	}
}
