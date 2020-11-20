package raghvendra.bankingSystem;

public class BankingSystem {
	int debitCounter;
	int creditCounter;
	int printBalanceCounter;
	int currentBalance;
	static int totalDebit;
	static int totalCredit;
	static int totalPrintBalance;
	
	void currentBalance(int setBalance) {
		currentBalance=setBalance;
	}
	
	void debitAmount(int debitAmount) {
		currentBalance=currentBalance-debitAmount;
		debitCounter++;
		totalDebit++;
	}
	
	void creditAmount(int CreditAmount) {
		currentBalance=currentBalance+CreditAmount;
		creditCounter++;
		totalCredit++;
		System.out.println();
	}
	
	void printBalance() {
		printBalanceCounter++;
		totalPrintBalance++;
	}
	
	void individualTransactionSummary(String user) {
		System.out.println(user+"transation summary:");
		System.out.println("Credit-"+creditCounter+" times");
		System.out.println("Debit-"+debitCounter+" times");
		System.out.println("Print balance-"+printBalanceCounter+" times");

	}
	
	static void allTransactionSummary() {
		System.out.println("All user transation summary:");
		System.out.println("Credit-"+totalCredit+" times");
		System.out.println("Debit-"+totalDebit+" times");
		System.out.println("Print balance-"+totalPrintBalance+" times");
	}
	
	public static void main(String[] args) {
		BankingSystem bankingSystem=new BankingSystem();
		bankingSystem.currentBalance(58000);
		bankingSystem.creditAmount(2000);
		bankingSystem.creditAmount(3000);
		bankingSystem.creditAmount(780);
		bankingSystem.debitAmount(5670);
		bankingSystem.printBalance();
		bankingSystem.individualTransactionSummary("User 1 ");
		BankingSystem bankingSystem2=new BankingSystem();
		bankingSystem2.currentBalance(78000);
		bankingSystem2.creditAmount(2000);
		bankingSystem2.debitAmount(5670);
		bankingSystem2.debitAmount(9670);
		bankingSystem2.printBalance();
		bankingSystem2.printBalance();
		bankingSystem.individualTransactionSummary("User 2 ");
		allTransactionSummary();
		}

}
