package ruby;

public class BankingSystem {
	static int allCreditCount;
	static int allDebitCount;
	static int allPrintBalanceCount;
	
	int userCreditCount;
	int userDebitCount;
	int userPrintBalanceCount;
	
	void credit(int userCreditAmount){
		//userTotalBalance = userTotalBalance + userCreditAmount;
		userCreditCount++;
		allCreditCount++;	
	}
	
	void debit(int userDebitAmount) {
		//userTotalBalance = userTotalBalance - userDebitAmount;
		userDebitCount++;
		allDebitCount++;
	}
	
	void printBalance() {
		//System.out.println(userTotalBalance);
		userPrintBalanceCount++;
		allPrintBalanceCount++;
	}
	
	void individualTransactionSummary() {
		System.out.println("Individual Transactions Summary");
		System.out.println("User Credit - "+userCreditCount+" times");
		System.out.println("User Debit - "+userDebitCount+" times");
		System.out.println("User Print Balance - "+userPrintBalanceCount+" times");
	}
	
	void allTransactionSummary() {
		System.out.println("All Transactions Summary");
		System.out.println("Credit - "+allCreditCount+" times");
		System.out.println("Debit - "+allDebitCount+" times");
		System.out.println("Print Balance - "+userPrintBalanceCount+" times");
	}

	public static void main(String[] args) {
		BankingSystem bankingSystem_1 = new BankingSystem();
		bankingSystem_1.credit(50);
		bankingSystem_1.credit(50);
		bankingSystem_1.debit(20);
		bankingSystem_1.printBalance();
		bankingSystem_1.individualTransactionSummary();
		
		BankingSystem bankingSystem_2 = new BankingSystem();
		bankingSystem_2.credit(10);
		bankingSystem_2.credit(10);
		bankingSystem_2.credit(10);
		bankingSystem_2.credit(10);
		bankingSystem_2.credit(10);
		bankingSystem_2.debit(10);
		bankingSystem_2.debit(10);
		bankingSystem_2.individualTransactionSummary();
		
		bankingSystem_1.allTransactionSummary();
	}
}
