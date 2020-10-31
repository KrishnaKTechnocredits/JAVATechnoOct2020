package vishakha;

public class Bank {
	int creditCount;
	int debitCount;
	int currentBalance;
	static int totalCreditCount;
	static int totalDebitCount;
	static int totalPrintBalCount;
	
	void setCurrentBal(int currentBal){
		currentBalance = currentBal;
	}
	
	void creditAmount(int creditAmt){
		currentBalance = currentBalance + creditAmt;
		creditCount++;
		totalCreditCount++;
	}
	
	void debitAmount(int debitAmt){
		currentBalance = currentBalance - debitAmt;
		debitCount++;
		totalDebitCount++;
	}
	
	void printBalance(){
		System.out.println("Current Balance is : " +currentBalance);
		totalPrintBalCount++;
		System.out.println("");
	}
	
	void individualTransactionSummary(String user){
		System.out.println("----Individual transaction summary -----");
		System.out.println(user+ " credited amount "+creditCount+ " times in account");
		System.out.println(user+ " debited amount "+debitCount+ " times in account");
	}
	
	void allTransactionSummary(){
		System.out.println("");
		System.out.println("---- All Transaction Summary ----");
		System.out.println("Total "+totalCreditCount+ " times amount was credited");
		System.out.println("Total "+totalDebitCount+ " times amount was debited");
		System.out.println("Total "+totalPrintBalCount+ " time current balance was printed");
		System.out.println("");
	}
	
	public static void main(String[] args) {
		Bank bank1 = new Bank();
		bank1.setCurrentBal(90000);
		bank1.creditAmount(5000);
		bank1.creditAmount(1000);
		bank1.debitAmount(2000);
		bank1.individualTransactionSummary("User1");
		bank1.printBalance();
		
		Bank bank2 = new Bank();
		bank2.setCurrentBal(70000);
		bank2.creditAmount(3000);
		bank2.creditAmount(3000);
		bank2.creditAmount(3000);
		bank2.creditAmount(3000);
		bank2.creditAmount(3000);
		bank2.debitAmount(1000);
		bank2.debitAmount(1000);
		bank2.individualTransactionSummary("User2");
		
		Bank bankReport = new Bank();
		bankReport.allTransactionSummary();
	}
}
