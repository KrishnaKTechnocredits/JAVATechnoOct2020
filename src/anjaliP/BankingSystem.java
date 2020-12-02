package anjaliP;

public class BankingSystem {
	static int totalDebit;
	static int totalCredit;
	static int totalBalance;
	int debit;
	int credit;
	int balance;
	
	static void setTotalBalance(int totalBal) {
		totalBalance=totalBal;
	}
	void debitAmt(int debitamt) {
		totalBalance = totalBalance - debitamt;
		debit++;
		totalDebit++;
	}
	void creditAmt(int creditamt) {
		totalBalance = totalBalance + creditamt;
		credit++;
		totalCredit++;
	}
	void printBalanceAmt() {
		balance++;
		totalBalance++;
	}
	void individualTransactionSummary(String user) {
		System.out.println("----------Individual Trasaction-------------");
		System.out.println(user+ " credited "+credit+ " times from the account");
		System.out.println(user+ " debited "+debit+ " times from the account");
		System.out.println(user+ " User Balance displayed : "+balance+" times"+"\n");	
	}
	 void allTransactionSummary() {
		System.out.println("-------- -Total Trasaction----------------");
		System.out.println("Total Credited amt displayed : "+totalCredit+" times");
		System.out.println("Total Debited amt displayed : "+totalDebit+" times");
		System.out.println("Total Balance amt displayed : "+balance+" times");

	}
	public static void main(String[]a) {
		BankingSystem bankingSystem_1 = new BankingSystem();
		bankingSystem_1.creditAmt(5000);
		bankingSystem_1.debitAmt(2000);
		bankingSystem_1.creditAmt(1000);
		bankingSystem_1.printBalanceAmt();
		bankingSystem_1.individualTransactionSummary("User1");

		BankingSystem bankingSystem_2 = new BankingSystem();
		bankingSystem_2.creditAmt(10000);
		bankingSystem_2.creditAmt(5000);
		bankingSystem_2.debitAmt(7000);
		bankingSystem_2.creditAmt(1000);
		bankingSystem_2.creditAmt(5000);
		bankingSystem_2.creditAmt(2500);
		bankingSystem_2.debitAmt(10000);
		bankingSystem_2.individualTransactionSummary("User2");
		
		bankingSystem_1.allTransactionSummary();
	}
}
