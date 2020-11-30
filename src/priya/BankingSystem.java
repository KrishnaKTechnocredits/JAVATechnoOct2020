package priya;

public class BankingSystem {
	int debitCount;
	int creditCount;
	int currentBalance;
	static int totalDebitCount;
	static int totalCreditCount;
	static int totalBalanceCount;
	static int totalPrintBalanceCount;
	
	void debitAmount(int debitCount) {
		//totalBalanceCount = totalDebitCount - debitCount;
		currentBalance = currentBalance + debitCount;
		totalDebitCount++;
	}
	void creditAmount(int creditCount) {
		currentBalance = currentBalance + creditCount;
		creditCount++;
		totalCreditCount++;
	}
	void printBalance() {
		System.out.println("Current Balance is : "+currentBalance);
		currentBalance++;
		totalPrintBalanceCount++;
		System.out.println("");
	}
	void individualTransactionSummary(String user) {
		System.out.println("Individual Transtion Summary");
		System.out.println(user+"transaction summary : Credit - " +creditCount+ "times,Debit - " +debitCount+ "times,printBalance - " +totalPrintBalanceCount+ "time");
		System.out.println(user+"transaction summary : Credit - " +creditCount+ "times,Debit - " +debitCount+ "times,printBalance - " +totalPrintBalanceCount+ "time");
		//System.out.println("");
	}
	void allTransactionSummary(){
		System.out.println("");
		System.out.println("All Transaction Summary");
		System.out.println("Total "+totalCreditCount+ " times amount was credited");
		System.out.println("Total "+totalDebitCount+ " times amount was debited");
		System.out.println("Total "+totalPrintBalanceCount+ " time current balance was printed");
		System.out.println("");
	}

	public static void main(String[] args) {
		BankingSystem bank1 = new BankingSystem();
		bank1.creditAmount(10000);
		bank1.creditAmount(1000);
		bank1.debitAmount(2000);
		bank1.debitAmount(500);
		bank1.individualTransactionSummary("User1");
		bank1.printBalance();

		BankingSystem bank2 = new BankingSystem();
		bank2.creditAmount(2000);
		bank2.creditAmount(2000);
		bank2.creditAmount(3000);
		bank2.creditAmount(3000);
		bank2.creditAmount(3000);
		bank2.debitAmount(1000);
		bank2.debitAmount(1000);
		bank2.individualTransactionSummary("User2");
		bank1.printBalance();

		BankingSystem bankSummary = new BankingSystem();
		bankSummary.allTransactionSummary();
	}
}
