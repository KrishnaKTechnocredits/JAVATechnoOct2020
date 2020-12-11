package brijesh;

public class BankingSystem {
	int currentBalance,userDebitCount,userCreditCount,userPrintCount;
	static int allDebitCount,allCreditCount,allPrintCount;
	
	void debitAmountBank(int debitAmount) {
		if(debitAmount<=currentBalance)
			currentBalance-=debitAmount;
		else
			System.out.println("You don't have sufficient balance in your account.");
		userDebitCount++;
		allDebitCount++;
	}
	
	void creditAmountBank(int creditAmount) {
		currentBalance+=creditAmount;
		userCreditCount++;
		allCreditCount++;
	}
	
	void printBalance(String userName) {
		userPrintCount++;
		allPrintCount++;
		System.out.println("Current balance in "+userName+"'s account: "+currentBalance);
	}
	
	void individualTransactionSummary(String userName) {
		System.out.println(userName+" transaction summary : Credit - "+userCreditCount+" times, Debit - "+userDebitCount+" times, printBalance - "+userPrintCount+" time");
	}
	
	static void allTransactionSummary() {
		System.out.println("All transaction summary : Credit - "+allCreditCount+" times, Debit - "+allDebitCount+" times, printBalance - "+allPrintCount+" time");
	}

	public static void main(String[] args) {
		BankingSystem bankingSystem1 = new BankingSystem();
		bankingSystem1.creditAmountBank(20000);
		bankingSystem1.debitAmountBank(5000);
		bankingSystem1.creditAmountBank(10000);
		bankingSystem1.printBalance("user1");
		bankingSystem1.individualTransactionSummary("user1");
		
		BankingSystem bankingSystem2 = new BankingSystem();
		bankingSystem2.creditAmountBank(10000);
		bankingSystem2.debitAmountBank(5000);
		bankingSystem2.creditAmountBank(1000);
		bankingSystem2.debitAmountBank(2000);
		bankingSystem2.creditAmountBank(8000);
		bankingSystem2.creditAmountBank(6000);
		bankingSystem2.creditAmountBank(9000);
		bankingSystem2.individualTransactionSummary("user2");
		
		allTransactionSummary();
	}

}
