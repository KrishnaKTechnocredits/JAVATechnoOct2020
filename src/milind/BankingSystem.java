package milind;

public class BankingSystem {
	
	int debitCount, creditcount, printBalCount, currentBalance;
	static int totalDebitCount, totalCreditCount, totalPrintBalCount;
	
	
	void debitAmount(int amountDebited) {
		currentBalance = currentBalance - amountDebited;
		debitCount++;
		totalDebitCount++;
	}
	
	void creditAmount(int amountCredited) {
		currentBalance = currentBalance + amountCredited;
		creditcount++;
		totalCreditCount++;
	}
	
	void printBalance(String name) {
		System.out.println(name + "'s Current balance is " + currentBalance );
		printBalCount++;
		totalPrintBalCount++;
	}
	
	void individualTransactionSummary(String name) {
		System.out.println(name + " transaction summary : Credit - " + creditcount + " times, Debit - " + debitCount + " times, printBalance - " + printBalCount + " time");
	}
	
	void allTransactionSummary() {
		System.out.println("All transaction summary : Credit - " + totalCreditCount + " times, Debit - " + totalDebitCount + " times, printBalance - " + totalPrintBalCount +" time");
	} 
	
	public static void main(String[] args) {
		BankingSystem bankingSystem1 = new BankingSystem();
		bankingSystem1.creditAmount(10000);
		bankingSystem1.debitAmount(5000);
		bankingSystem1.printBalance("Milind");
		bankingSystem1.creditAmount(10000);
		bankingSystem1.printBalance("Milind");
		bankingSystem1.debitAmount(8000);
		bankingSystem1.debitAmount(2000);
		bankingSystem1.creditAmount(5000);
		bankingSystem1.printBalance("Milind");
		bankingSystem1.individualTransactionSummary("Milind");
		bankingSystem1.allTransactionSummary();
		
		BankingSystem bankingSystem2 = new BankingSystem();
		bankingSystem2.creditAmount(200000);
		bankingSystem2.debitAmount(50000);
		bankingSystem2.printBalance("Bhairavi");
		bankingSystem2.creditAmount(200000);
		bankingSystem2.printBalance("Bhairavi");
		bankingSystem2.debitAmount(80000);
		bankingSystem2.debitAmount(20000);
		bankingSystem2.creditAmount(50000);
		bankingSystem2.printBalance("Bhairavi");
		bankingSystem2.individualTransactionSummary("Bhairavi");
		bankingSystem2.allTransactionSummary();
	}
}
