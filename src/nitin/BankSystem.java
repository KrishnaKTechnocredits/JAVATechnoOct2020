package nitin;

public class BankSystem {
	int currentBalance,debitCount,creditCount,allTransactionCount,printBalanceCount;
	static int allDebitCount,allCreditCount,allPrintBalanceCount;
	
	void debitAmount(int debitAmount) {
		currentBalance=currentBalance-debitAmount;
		debitCount++;
		allDebitCount++;
	}
	void creditAmount(int creditAmount) {
		currentBalance=currentBalance+creditAmount;
		creditCount++;
		allCreditCount++;
	}
	void printBalance(String user) {
		System.out.println("CurrentBalance of "+user+" is : "+currentBalance);
		printBalanceCount++;
		allPrintBalanceCount++;
	}
	void individualTransactionSummary(String user) {
		System.out.println(user+" transaction summary : Credit - "+creditCount+" times, Debit - "+debitCount+" times, PrintBalance - "+printBalanceCount+" times");
		
	}
	static void allTransactionSummary() {
		System.out.println("All transaction summary :  Credit - "+allCreditCount+" times, Debit - "+allDebitCount+" times, PrintBalance - "+allPrintBalanceCount+" times");
	}
	public static void main(String[] args) {
		BankSystem bankSystem=new BankSystem();
		bankSystem.creditAmount(1200);
		bankSystem.creditAmount(1000);
		bankSystem.printBalance("User1");
		bankSystem.creditAmount(5000);
		bankSystem.debitAmount(500);
		bankSystem.debitAmount(100);
		bankSystem.printBalance("User1");
		bankSystem.individualTransactionSummary("User1");
		BankSystem bankSystem1=new BankSystem();
		bankSystem1.creditAmount(10000);
		bankSystem1.printBalance("User2");
		bankSystem1.creditAmount(7000);
		bankSystem1.printBalance("User2");
		bankSystem1.debitAmount(5000);		
		bankSystem1.printBalance("User2");
		bankSystem1.individualTransactionSummary("User2");
		
		allTransactionSummary();
	}
}
