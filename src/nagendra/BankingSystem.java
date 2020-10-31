package nagendra;

public class BankingSystem {

	int creditAmount;
	int debitAmount;
	int printBalance;
    static int credit;
    static int debit;
    static int print;


    
	void creditAmount() {
		creditAmount++;
		credit++;

	}

	void debitAmount() {
		debitAmount++;
		debit++;

	}

	void printBalance() {
		printBalance++;
		print++;

	}

	void individualTransactionSummary() {

		System.out.println("Credit Amount is Called :" +creditAmount);
		System.out.println("Debit Amount is Called :"  +debitAmount);
		System.out.println("Print Balance is Called :" +printBalance);

	}
	 static void allTransactionSummary() {
		System.out.println("<-----All Transaction Summary ---->" );
		System.out.println("Credit Amount is Called :" +credit);
		System.out.println("Debit Amount is Called :"  +debit);
		System.out.println("Print Balance is Called :" +print);

	}

	public static void main(String[] args) {

		BankingSystem user1 = new BankingSystem();
		System.out.println("<------User1 transaction summary ----->");
		user1.creditAmount();
		user1.debitAmount();
		user1.printBalance();
		user1.creditAmount();
		user1.individualTransactionSummary();

		BankingSystem user2 = new BankingSystem();
		System.out.println("User2 <----transaction summary ----->");
		user2.creditAmount();
		user2.creditAmount();
		user2.creditAmount();
		user2.creditAmount();
		user2.creditAmount();
		user2.printBalance();
		user2.individualTransactionSummary();
		allTransactionSummary();
	}

}
