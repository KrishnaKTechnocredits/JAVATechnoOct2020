package ankita;

public class BankingSystem {
	
	int debitCnt,creditCnt,balanceCnt,currentBalance;
	static int totalDebitCnt,totalCreditCnt,totalBalanceCnt;
	
	void creditAmount(int creditAmt) {
		currentBalance=currentBalance + creditAmt;
		creditCnt++;
		totalCreditCnt++;	
	}
	void debitAmount(int debitAmt) {
		currentBalance = currentBalance - debitAmt;
		debitCnt++;
		totalDebitCnt++;
	}
	void printBalance(String name) {
		System.out.println("Current balance of  "+name+" :" + currentBalance);
		balanceCnt++;
		totalBalanceCnt++;
	}
	void individualTransactionSummary(String name) {
		System.out.println( name +" Transaction Summary:"+ "credit-" +creditCnt+ ", Debit-"+ debitCnt +", printBal-" + balanceCnt+"\n");
	}
	static void allTransactionSummary() {
		System.out.println( "All transaction summary :credit-" +totalCreditCnt+ ", Debit-"+ totalDebitCnt +", printBal-" + totalBalanceCnt);
	}

	public static void main(String[] args0) {
		BankingSystem bankingSystem1 = new BankingSystem();
		bankingSystem1.creditAmount(10000);
		bankingSystem1.debitAmount(1000);
		bankingSystem1.printBalance("user1");
		bankingSystem1.creditAmount(450);
		bankingSystem1.printBalance("user1");
		bankingSystem1.creditAmount(5000);
		bankingSystem1.debitAmount(700);
		bankingSystem1.printBalance("user1");
		bankingSystem1.individualTransactionSummary("user1");
		
		BankingSystem bankingSystem2 = new BankingSystem();
		bankingSystem2.creditAmount(5000);
		bankingSystem2.debitAmount(653);
		bankingSystem2.debitAmount(500);
		bankingSystem2.debitAmount(453);

		bankingSystem2.printBalance("user2");
		bankingSystem2.individualTransactionSummary("user2");

		allTransactionSummary();

	}
}
