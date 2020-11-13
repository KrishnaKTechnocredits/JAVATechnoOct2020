package vaibhav;

public class BankingSystem {
	
	int credit;
	int debit;
	int balance;
	
	static int sCredit;
	static int sDebit;
	static int sBalance;
	
	void debitMoney() {
		debit++;
		sDebit++;
	}
	
	void creditMoney() {		
		credit++;
		sCredit++;
	}

	void printBalance(int givenBalance) {
		System.out.println("Account balance is " + givenBalance);
		balance++;
		sBalance++;
	}
	
	void individualTransactionSummary() {
		System.out.println("The Number of Debit transaction performed on this account is "+debit);
		System.out.println("The Number of Credit transaction performed on this account is "+credit);
		System.out.println("The Number of balance printed for this account is "+balance);
	}
	
	void allTransactionSummary() {
		System.out.println("The Total Number of debit transaction performed "+sDebit);
		System.out.println("The Total Number of credit transaction performed "+sCredit);
		System.out.println("The Total Number of print balance transaction performed "+sBalance);
		
	}
	
	
	public static void main(String[] args) {
		BankingSystem user1 = new BankingSystem();//to understand users,Given different name to object reference as user1/user 2
		user1.creditMoney();
		user1.creditMoney();
		user1.creditMoney();
		user1.debitMoney();
		user1.debitMoney();
		user1.debitMoney();
		user1.debitMoney();
		System.out.println("****User 1 details****");
		user1.printBalance(500);		
		user1.individualTransactionSummary();
		BankingSystem user2 = new BankingSystem();
		user2.creditMoney();
		user2.debitMoney();
		System.out.println("****User 2 details****");
		user2.printBalance(700);			
		user2.individualTransactionSummary();
		System.out.println("****All Transactions details****");
		user1.allTransactionSummary();
		user2.allTransactionSummary();
		
	}

}
