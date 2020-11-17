package surbhi;
public class Assignment9Banking {

	int creditCnt;
	int debitCnt;
	double currentBalance;
	static int totalCreditCnt;
	static int totalDebitCnt;
	static int totalPrintBalCnt;

	void setCurrentBal(double currentBal) {
		currentBalance = currentBal;
	}

	void creditAmount(int creditAmount) {
		currentBalance = currentBalance + creditAmount;
		creditCnt++;
		totalCreditCnt++;
	}

	void debitAmount(int debitAmountt) {
		currentBalance = currentBalance - debitAmountt;
		debitCnt++;
		totalDebitCnt++;
	}

	void printBalance() {
		System.out.println("Current Balance is : " + currentBalance);
		totalPrintBalCnt++;
	}

	void individualTransactionSummary(String userDetails) {
		System.out.println("Individual transaction summary for " + userDetails);
		System.out.println();
		System.out.println(userDetails + " credited " + creditCnt + " times in account");
		System.out.println(userDetails + " debited " + debitCnt + " times in account");
	}

	void allTransactionSummary() {
		System.out.println("Overall transactions Summary");
		System.out.println();
		System.out.println(totalCreditCnt + " times amount was credited");
		System.out.println(totalDebitCnt + " times amount was debited");
		System.out.println(totalPrintBalCnt + " times current balance was printed");
	}

	public static void main(String[] args) {
		Assignment9Banking assignment9Banking = new Assignment9Banking();
		assignment9Banking.setCurrentBal(190000);
		assignment9Banking.creditAmount(10000);
		assignment9Banking.debitAmount(12000);
		assignment9Banking.individualTransactionSummary("User1");
		assignment9Banking.printBalance();
		System.out.println("**********************");

		Assignment9Banking assignment9Banking_2 = new Assignment9Banking();
		assignment9Banking_2.setCurrentBal(170000);
		assignment9Banking_2.creditAmount(3000);
		assignment9Banking_2.creditAmount(6000);
		assignment9Banking_2.creditAmount(9000);
		assignment9Banking_2.debitAmount(10000);
		assignment9Banking_2.debitAmount(900);
		assignment9Banking_2.individualTransactionSummary("User2");
		System.out.println("*******************************");
		Assignment9Banking summary = new Assignment9Banking();
		summary.allTransactionSummary();

	}
}
